package com.practice.camelmicroservicea.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class KafkaSenderRouter extends RouteBuilder
{
    @Override
    public void configure() throws Exception {
        from("files/json")
                .log("${body}")
                .to("kafka:myKafkaTopic");
    }
}
