package org.acme.micrometer;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tags;

@Path("/api")
public class GreetingsResource {

    @Inject
    MeterRegistry registry;

    @GET
    @Path("/{param}")
    public String sayHello(@PathParam(value = "param") String param) {
        registry.counter("api_invocation_counter", Tags.of("param", param)).increment();

        return "API successfully invoked!";
    }
}

