/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package eu.bausov.kafkaavro.model.generated;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@org.apache.avro.specific.AvroGenerated
public class OrderImpl extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrderImpl\",\"namespace\":\"eu.bausov.kafkaavro.model.generated\",\"fields\":[{\"name\":\"limit\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}},{\"name\":\"price\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}}]}");
    private static final long serialVersionUID = -6166687084631130167L;
    private static SpecificData MODEL$ = new SpecificData();
    private static final BinaryMessageEncoder<OrderImpl> ENCODER =
            new BinaryMessageEncoder<OrderImpl>(MODEL$, SCHEMA$);
    private static final BinaryMessageDecoder<OrderImpl> DECODER =
            new BinaryMessageDecoder<OrderImpl>(MODEL$, SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<OrderImpl>
            WRITER$ = (org.apache.avro.io.DatumWriter<OrderImpl>) MODEL$.createDatumWriter(SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<OrderImpl>
            READER$ = (org.apache.avro.io.DatumReader<OrderImpl>) MODEL$.createDatumReader(SCHEMA$);

    static {
        MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
    }

    @Deprecated
    public java.math.BigDecimal limit;
    @Deprecated
    public java.math.BigDecimal price;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public OrderImpl() {
    }

    /**
     * All-args constructor.
     * @param limit The new value for limit
     * @param price The new value for price
     */
    public OrderImpl(java.math.BigDecimal limit, java.math.BigDecimal price) {
        this.limit = limit;
        this.price = price;
    }

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    /**
     * Return the BinaryMessageEncoder instance used by this class.
     * @return the message encoder used by this class
     */
    public static BinaryMessageEncoder<OrderImpl> getEncoder() {
        return ENCODER;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     * @return the message decoder used by this class
     */
    public static BinaryMessageDecoder<OrderImpl> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
     */
    public static BinaryMessageDecoder<OrderImpl> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<OrderImpl>(MODEL$, SCHEMA$, resolver);
    }

    /**
     * Deserializes a OrderImpl from a ByteBuffer.
     * @param b a byte buffer holding serialized data for an instance of this class
     * @return a OrderImpl instance decoded from the given buffer
     * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
     */
    public static OrderImpl fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    /**
     * Creates a new OrderImpl RecordBuilder.
     * @return A new OrderImpl RecordBuilder
     */
    public static eu.bausov.kafkaavro.model.generated.OrderImpl.Builder newBuilder() {
        return new eu.bausov.kafkaavro.model.generated.OrderImpl.Builder();
    }

    /**
     * Creates a new OrderImpl RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new OrderImpl RecordBuilder
     */
    public static eu.bausov.kafkaavro.model.generated.OrderImpl.Builder newBuilder(eu.bausov.kafkaavro.model.generated.OrderImpl.Builder other) {
        if (other == null) {
            return new eu.bausov.kafkaavro.model.generated.OrderImpl.Builder();
        } else {
            return new eu.bausov.kafkaavro.model.generated.OrderImpl.Builder(other);
        }
    }

    /**
     * Creates a new OrderImpl RecordBuilder by copying an existing OrderImpl instance.
     * @param other The existing instance to copy.
     * @return A new OrderImpl RecordBuilder
     */
    public static eu.bausov.kafkaavro.model.generated.OrderImpl.Builder newBuilder(eu.bausov.kafkaavro.model.generated.OrderImpl other) {
        if (other == null) {
            return new eu.bausov.kafkaavro.model.generated.OrderImpl.Builder();
        } else {
            return new eu.bausov.kafkaavro.model.generated.OrderImpl.Builder(other);
        }
    }

    /**
     * Serializes this OrderImpl to a ByteBuffer.
     * @return a buffer holding the serialized data for this instance
     * @throws java.io.IOException if this instance could not be serialized
     */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    public org.apache.avro.specific.SpecificData getSpecificData() {
        return MODEL$;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return limit;
            case 1:
                return price;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                limit = (java.math.BigDecimal) value$;
                break;
            case 1:
                price = (java.math.BigDecimal) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'limit' field.
     * @return The value of the 'limit' field.
     */
    public java.math.BigDecimal getLimit() {
        return limit;
    }

    /**
     * Sets the value of the 'limit' field.
     * @param value the value to set.
     */
    public void setLimit(java.math.BigDecimal value) {
        this.limit = value;
    }

    /**
     * Gets the value of the 'price' field.
     * @return The value of the 'price' field.
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the 'price' field.
     * @param value the value to set.
     */
    public void setPrice(java.math.BigDecimal value) {
        this.price = value;
    }

    @Override
    public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @Override
    public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    @Override
    protected boolean hasCustomCoders() {
        return true;
    }

    @Override
    public void customEncode(org.apache.avro.io.Encoder out)
            throws java.io.IOException {
        out.writeString(this.limit.toString());

        out.writeString(this.price.toString());

    }

    @Override
    public void customDecode(org.apache.avro.io.ResolvingDecoder in)
            throws java.io.IOException {
        org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.limit = new java.math.BigDecimal(in.readString());

            this.price = new java.math.BigDecimal(in.readString());

        } else {
            for (int i = 0; i < 2; i++) {
                switch (fieldOrder[i].pos()) {
                    case 0:
                        this.limit = new java.math.BigDecimal(in.readString());
                        break;

                    case 1:
                        this.price = new java.math.BigDecimal(in.readString());
                        break;

                    default:
                        throw new java.io.IOException("Corrupt ResolvingDecoder.");
                }
            }
        }
    }

    /**
     * RecordBuilder for OrderImpl instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderImpl>
            implements org.apache.avro.data.RecordBuilder<OrderImpl> {

        private java.math.BigDecimal limit;
        private java.math.BigDecimal price;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(eu.bausov.kafkaavro.model.generated.OrderImpl.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.limit)) {
                this.limit = data().deepCopy(fields()[0].schema(), other.limit);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.price)) {
                this.price = data().deepCopy(fields()[1].schema(), other.price);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
        }

        /**
         * Creates a Builder by copying an existing OrderImpl instance
         * @param other The existing instance to copy.
         */
        private Builder(eu.bausov.kafkaavro.model.generated.OrderImpl other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.limit)) {
                this.limit = data().deepCopy(fields()[0].schema(), other.limit);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.price)) {
                this.price = data().deepCopy(fields()[1].schema(), other.price);
                fieldSetFlags()[1] = true;
            }
        }

        /**
         * Gets the value of the 'limit' field.
         * @return The value.
         */
        public java.math.BigDecimal getLimit() {
            return limit;
        }


        /**
         * Sets the value of the 'limit' field.
         * @param value The value of 'limit'.
         * @return This builder.
         */
        public eu.bausov.kafkaavro.model.generated.OrderImpl.Builder setLimit(java.math.BigDecimal value) {
            validate(fields()[0], value);
            this.limit = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'limit' field has been set.
         * @return True if the 'limit' field has been set, false otherwise.
         */
        public boolean hasLimit() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'limit' field.
         * @return This builder.
         */
        public eu.bausov.kafkaavro.model.generated.OrderImpl.Builder clearLimit() {
            limit = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'price' field.
         * @return The value.
         */
        public java.math.BigDecimal getPrice() {
            return price;
        }


        /**
         * Sets the value of the 'price' field.
         * @param value The value of 'price'.
         * @return This builder.
         */
        public eu.bausov.kafkaavro.model.generated.OrderImpl.Builder setPrice(java.math.BigDecimal value) {
            validate(fields()[1], value);
            this.price = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'price' field has been set.
         * @return True if the 'price' field has been set, false otherwise.
         */
        public boolean hasPrice() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'price' field.
         * @return This builder.
         */
        public eu.bausov.kafkaavro.model.generated.OrderImpl.Builder clearPrice() {
            price = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public OrderImpl build() {
            try {
                OrderImpl record = new OrderImpl();
                record.limit = fieldSetFlags()[0] ? this.limit : (java.math.BigDecimal) defaultValue(fields()[0]);
                record.price = fieldSetFlags()[1] ? this.price : (java.math.BigDecimal) defaultValue(fields()[1]);
                return record;
            } catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }
}










