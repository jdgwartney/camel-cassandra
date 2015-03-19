package com.boundary;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Cassandra producer.
 */
public class CassandraProducer extends DefaultProducer {
    private static final Logger LOG = LoggerFactory.getLogger(CassandraProducer.class);
    private CassandraEndpoint endpoint;

    public CassandraProducer(CassandraEndpoint endpoint) {
        super(endpoint);
        this.endpoint = endpoint;
    }

    public void process(Exchange exchange) throws Exception {
        System.out.println(exchange.getIn().getBody());    
    }

}
