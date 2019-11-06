package eu.bausov.kafkaavro;

import eu.bausov.kafkaavro.model.generated.OrderImpl;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * Created by GreenNun on 06.11.2019.
 */
class GeneratedTest {

    @Test
    void test() {
        final var build = OrderImpl.newBuilder()
                .setLimit(new BigDecimal("0.000"))
                .setPrice(new BigDecimal("0.000"))
                .build();

        System.out.println(build);
    }
}
