// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Linked service for Amazon Redshift. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AmazonRedshift")
@JsonFlatten
@Fluent
public class AmazonRedshiftLinkedService extends LinkedService {
    /*
     * The name of the Amazon Redshift server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.server", required = true)
    private Object server;

    /*
     * The username of the Amazon Redshift source. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /*
     * The password of the Amazon Redshift source.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The database name of the Amazon Redshift source. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.database", required = true)
    private Object database;

    /*
     * The TCP port number that the Amazon Redshift server uses to listen for client connections. The default value is
     * 5439. Type: integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the server property: The name of the Amazon Redshift server. Type: string (or Expression with resultType
     * string).
     *
     * @return the server value.
     */
    public Object getServer() {
        return this.server;
    }

    /**
     * Set the server property: The name of the Amazon Redshift server. Type: string (or Expression with resultType
     * string).
     *
     * @param server the server value to set.
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService setServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the username property: The username of the Amazon Redshift source. Type: string (or Expression with
     * resultType string).
     *
     * @return the username value.
     */
    public Object getUsername() {
        return this.username;
    }

    /**
     * Set the username property: The username of the Amazon Redshift source. Type: string (or Expression with
     * resultType string).
     *
     * @param username the username value to set.
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService setUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password of the Amazon Redshift source.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password of the Amazon Redshift source.
     *
     * @param password the password value to set.
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the database property: The database name of the Amazon Redshift source. Type: string (or Expression with
     * resultType string).
     *
     * @return the database value.
     */
    public Object getDatabase() {
        return this.database;
    }

    /**
     * Set the database property: The database name of the Amazon Redshift source. Type: string (or Expression with
     * resultType string).
     *
     * @param database the database value to set.
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService setDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the port property: The TCP port number that the Amazon Redshift server uses to listen for client connections.
     * The default value is 5439. Type: integer (or Expression with resultType integer).
     *
     * @return the port value.
     */
    public Object getPort() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port number that the Amazon Redshift server uses to listen for client connections.
     * The default value is 5439. Type: integer (or Expression with resultType integer).
     *
     * @param port the port value to set.
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService setPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRedshiftLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRedshiftLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRedshiftLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRedshiftLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
