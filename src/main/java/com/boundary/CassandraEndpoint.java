package com.boundary;

import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.impl.DefaultEndpoint;

/**
 * Represents a Cassandra endpoint.
 */
public class CassandraEndpoint extends DefaultEndpoint {

    public CassandraEndpoint() {
    }

    public CassandraEndpoint(String uri, CassandraComponent component) {
        super(uri, component);
    }

    public CassandraEndpoint(String endpointUri) {
        super(endpointUri);
    }

    public Producer createProducer() throws Exception {
        return new CassandraProducer(this);
    }

    public Consumer createConsumer(Processor processor) throws Exception {
        return new CassandraConsumer(this, processor);
    }

    public boolean isSingleton() {
        return true;
    }
}
