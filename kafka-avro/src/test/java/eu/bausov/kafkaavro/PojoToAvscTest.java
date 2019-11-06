package eu.bausov.kafkaavro;

import eu.bausov.kafkaavro.model.OrderImpl;
import org.apache.avro.Schema;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.reflect.ReflectData;
import org.apache.avro.reflect.ReflectDatumReader;
import org.apache.avro.reflect.ReflectDatumWriter;
import org.junit.jupiter.api.Test;

/**
 * Created by GreenNun on 06.11.2019.
 */
class PojoToAvscTest {

    @Test
    void test() {
        Schema s = ReflectData.get().getSchema(OrderImpl.class);
        DatumWriter<OrderImpl> writer = new ReflectDatumWriter<OrderImpl>(OrderImpl.class);
        DatumReader<OrderImpl> reader = new ReflectDatumReader<OrderImpl>(OrderImpl.class);

        System.out.println(s);
        System.out.println(writer);
        System.out.println(reader);
    }
}
