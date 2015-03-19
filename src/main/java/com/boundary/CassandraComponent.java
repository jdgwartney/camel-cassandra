package com.boundary;

import java.util.Map;

import org.apache.camel.Endpoint;
import org.apache.camel.impl.DefaultComponent;

/**
 * Represents the component that manages {@link CassandraEndpoint}.
 */
public class CassandraComponent extends DefaultComponent {

    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        Endpoint endpoint = new CassandraEndpoint(uri, this);
        setProperties(endpoint, parameters);
        return endpoint;
    }
}
