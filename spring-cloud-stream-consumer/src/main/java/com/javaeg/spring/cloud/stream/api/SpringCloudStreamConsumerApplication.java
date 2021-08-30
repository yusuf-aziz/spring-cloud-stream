package com.javaeg.spring.cloud.stream.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableBinding(Sink.class)
@Slf4j
public class SpringCloudStreamConsumerApplication {

	@StreamListener("inbound")
	public void consumeMessage(Product product) {
		log.info("Consumer product :" + product);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamConsumerApplication.class, args);
	}

}
