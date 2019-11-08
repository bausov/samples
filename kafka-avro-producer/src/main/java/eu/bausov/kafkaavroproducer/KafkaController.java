package eu.bausov.kafkaavroproducer;

/**
 * Created by GreenNun on 08.11.2019.
 */

import eu.bausov.avro.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@RestController
@RequestMapping(value = "/user")
public class KafkaController {

    private final Producer producer;

    @Autowired
    KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("name") String name, @RequestParam("age") Integer age) throws InterruptedException {
        final AtomicBoolean run = new AtomicBoolean(true);

        new Thread(() -> {
            while (run.get()) {
                this.producer.sendMessage(new User(name + UUID.randomUUID().toString(), age));
            }
        }).start();

        TimeUnit.SECONDS.sleep(10);
        run.set(false);
    }
}
