package com.practice.camelmicroservicea;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class CamelMicroserviceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelMicroserviceAApplication.class, args);
	}

}

@Component
class MyFileRouter2 extends RouteBuilder {
	@Override
	public void configure() throws Exception {
		from("file:files/input")
				.log("${body}")
				.to("file:files/output");
	}
}

@Component
class ActiveMqSenderRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		//timer
		from("timer:active-mq-timer?period=10000")
				.transform().constant("My message for ActiveMQ")
				.log("${body}")
				.to("activemq:my-activemq-queue");
		//queue
	}
}



