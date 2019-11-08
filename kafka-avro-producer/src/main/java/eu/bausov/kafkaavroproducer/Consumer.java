package eu.bausov.kafkaavroproducer;

import eu.bausov.avro.User;
import lombok.extern.apachecommons.CommonsLog;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by GreenNun on 08.11.2019.
 */
@Service
@CommonsLog(topic = "Consumer Logger")
public class Consumer {
    private final AtomicInteger count = new AtomicInteger(1);

    @Value("${topic.name}")
    private String topicName;

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(ConsumerRecord<String, User> record) {
        log.info(String.format("%s >>> Consumed message -> %s", count.getAndIncrement(), record.value()));
    }
}
