package eu.bausov.kafkaavro.model;

import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * Created by GreenNun on 06.11.2019.
 */
@Accessors(fluent = true)
public class OrderImpl extends Order {
    private BigDecimal limit;
}
