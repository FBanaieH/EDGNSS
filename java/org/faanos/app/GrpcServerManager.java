/*
 * Copyright 2022-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.faanos.app;

import io.grpc.Server;
import io.grpc.netty.NettyServerBuilder;
import org.onlab.util.Tools;
import org.onosproject.cfg.ComponentConfigService;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Dictionary;
import java.util.concurrent.TimeUnit;

import static org.faanos.app.OsgiPropertyConstants.GRPC_PORT;
import static org.faanos.app.OsgiPropertyConstants.GRPC_PORT_DEFAULT;


/**
 * Skeletal ONOS application component.
 */
@Component(immediate = true,
        property = {GRPC_PORT + ":Integer=" + GRPC_PORT_DEFAULT})
public class GrpcServerManager {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Reference(cardinality = ReferenceCardinality.MANDATORY)
    protected ComponentConfigService cfgService;

    protected Server server;
    private int grpcPort = GRPC_PORT_DEFAULT;
    private  InternalGrpcServer grpcServer;

    @Activate
    protected void activate(ComponentContext ctx) {

        cfgService.registerProperties(getClass());
        grpcServer = new InternalGrpcServer();
        readComponentConfiguration(ctx);
        log.info(" ***|-|-|*** gRPC server is started ***|-|-|*** ");
        try {
            grpcServer.start();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            log.info("--------------------------"+e.getMessage());
        }
    }

    @Deactivate
    protected void deactivate() {
        grpcServer.stop();
        cfgService.unregisterProperties(getClass(), false);
        log.info(" --- Stopped --- ");
    }

    @Modified
    public void modified(ComponentContext context) {
        readComponentConfiguration(context);
    }

    private void readComponentConfiguration(ComponentContext context) {

        Dictionary<?, ?> properties = context.getProperties();
        grpcPort = Tools.getIntegerProperty(properties, GRPC_PORT, GRPC_PORT_DEFAULT);
        log.info("Configured. GRPC port is configured to {} ", grpcPort);
    }

    private class InternalGrpcServer {
        private void start() throws IOException, InterruptedException {

            server = NettyServerBuilder.forPort(grpcPort)
                    .addService(new EventListener())
                    .build()
                    .start();

            log.info(" --@--@--@--@-- server started, listening on "+grpcPort+" --@--@--@--@-- ");
        }

        private void stop() {
            if (server != null) {
                server.shutdown();
            }
        }

        private void blockUntilShutdown() throws InterruptedException {
           if (server != null) {
                server.awaitTermination();
            }
        }
    }
}
