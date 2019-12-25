package com.example.websocketreactive;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.socket.client.WebSocketClient;
import reactor.core.publisher.Flux;

import java.net.URI;
import java.time.Duration;

@SpringBootApplication
public class WebSocketReactiveApplication {
    private final WebSocketClient webSocketClient;

    public WebSocketReactiveApplication(WebSocketClient webSocketClient) {
        this.webSocketClient = webSocketClient;
    }

    public static void main(String[] args) {
        SpringApplication.run(WebSocketReactiveApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return (args) -> {
            webSocketClient
                    .execute(
                            URI.create("http://localhost:8080/ws/echo"),
                            session -> Flux
                                    .interval(Duration.ofMillis(100))
                                    .map(String::valueOf)
                                    .log("send: ")
                                    .map(session::textMessage)
                                    .as(session::send)
                    )
//                    .block(Duration.ofMillis(5000));
                    .subscribe();
        };
    }
}
