package com.example.cloudstreamkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.cloud.stream.reactive.StreamEmitter;
import reactor.core.publisher.Flux;

import java.time.Duration;

@SpringBootApplication
@EnableBinding(Source.class)
public class CloudStreamKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudStreamKafkaApplication.class, args);
    }

    @StreamEmitter
    @Output(Source.OUTPUT)
    public Flux<String> getStream() {
        return Flux.interval(Duration.ofSeconds(1))
                .map(l -> ">>> " + l);
    }
}
