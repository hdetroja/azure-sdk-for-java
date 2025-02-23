// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.SapEccResourceDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The path of the SAP ECC OData entity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapEccResource")
@Fluent
public final class SapEccResourceDataset extends Dataset {
    /*
     * SAP ECC OData resource dataset properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private SapEccResourceDatasetTypeProperties innerTypeProperties = new SapEccResourceDatasetTypeProperties();

    /** Creates an instance of SapEccResourceDataset class. */
    public SapEccResourceDataset() {
    }

    /**
     * Get the innerTypeProperties property: SAP ECC OData resource dataset properties.
     *
     * @return the innerTypeProperties value.
     */
    private SapEccResourceDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SapEccResourceDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapEccResourceDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapEccResourceDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapEccResourceDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapEccResourceDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapEccResourceDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapEccResourceDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the path property: The path of the SAP ECC OData entity. Type: string (or Expression with resultType string).
     *
     * @return the path value.
     */
    public Object path() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().path();
    }

    /**
     * Set the path property: The path of the SAP ECC OData entity. Type: string (or Expression with resultType string).
     *
     * @param path the path value to set.
     * @return the SapEccResourceDataset object itself.
     */
    public SapEccResourceDataset withPath(Object path) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapEccResourceDatasetTypeProperties();
        }
        this.innerTypeProperties().withPath(path);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model SapEccResourceDataset"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SapEccResourceDataset.class);
}
