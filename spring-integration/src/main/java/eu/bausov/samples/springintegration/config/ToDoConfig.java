package eu.bausov.samples.springintegration.config;

import eu.bausov.samples.springintegration.domain.ToDo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

/**
 * Created by s.bausov on 11.10.2020.
 */
@Configuration
public class ToDoConfig {

    @Bean
    public ApplicationRunner runner(MessageChannel input) {
        return args -> {
            input.send(MessageBuilder
                    .withPayload(new ToDo("buy milk today", true))
                    .build()
            );
        };
    }
}
