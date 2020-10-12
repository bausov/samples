package eu.bausov.samples.springintegration.config;

import eu.bausov.samples.springintegration.domain.ToDo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.MessageChannels;

/**
 * Created by s.bausov on 11.10.2020.
 */
@EnableIntegration
@Configuration
public class ToDoIntegartion {

    @Bean
    public DirectChannel input() {
        return MessageChannels.direct().get();
    }

    @Bean
    public IntegrationFlow simpleFlow() {
        return IntegrationFlows
                .from(input())
                .filter(ToDo.class, ToDo::isCompleted)
                .transform(ToDo.class, toDo -> toDo.getDescription().toUpperCase())
                .handle(System.out::println)
                .get();
    }
}
