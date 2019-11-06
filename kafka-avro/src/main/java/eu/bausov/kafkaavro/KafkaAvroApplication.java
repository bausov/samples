package eu.bausov.kafkaavro;

import eu.bausov.kafkaavro.model.Weather;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaAvroApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaAvroApplication.class, args);
        test();
    }

    private static void test() {
        final var weather = new Weather();
        final var build = Weather.newBuilder().build();
        System.out.println(weather);
    }
}
