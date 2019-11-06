package eu.bausov.kafkaavro.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * Created by GreenNun on 06.11.2019.
 */
@Data
@Accessors(fluent = true)
public abstract class Order implements Entity {
    private BigDecimal price;
}
