package com.example.websocketreactive;

import org.jetbrains.annotations.NotNull;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketMessage;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;

/**
 * Created by Stanislav Bausov on 25.12.2019.
 */
// todo test
public class EchoWebSocketHandler implements WebSocketHandler {
    @NotNull
    @Override
    public Mono<Void> handle(@NotNull WebSocketSession session) {
        return session
                .receive()
                .map(WebSocketMessage::getPayloadAsText)
                .map(tm -> "Echo: " + tm)
                .log("receive: ")
                .map(session::textMessage)
                .as(session::send);
    }
}
