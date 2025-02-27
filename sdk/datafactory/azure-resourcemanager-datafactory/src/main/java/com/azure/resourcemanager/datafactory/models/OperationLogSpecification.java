// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details about an operation related to logs. */
@Fluent
public final class OperationLogSpecification {
    /*
     * The name of the log category.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Localized display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Blobs created in the customer storage account, per hour.
     */
    @JsonProperty(value = "blobDuration")
    private String blobDuration;

    /** Creates an instance of OperationLogSpecification class. */
    public OperationLogSpecification() {
    }

    /**
     * Get the name property: The name of the log category.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the log category.
     *
     * @param name the name value to set.
     * @return the OperationLogSpecification object itself.
     */
    public OperationLogSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Localized display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Localized display name.
     *
     * @param displayName the displayName value to set.
     * @return the OperationLogSpecification object itself.
     */
    public OperationLogSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the blobDuration property: Blobs created in the customer storage account, per hour.
     *
     * @return the blobDuration value.
     */
    public String blobDuration() {
        return this.blobDuration;
    }

    /**
     * Set the blobDuration property: Blobs created in the customer storage account, per hour.
     *
     * @param blobDuration the blobDuration value to set.
     * @return the OperationLogSpecification object itself.
     */
    public OperationLogSpecification withBlobDuration(String blobDuration) {
        this.blobDuration = blobDuration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
