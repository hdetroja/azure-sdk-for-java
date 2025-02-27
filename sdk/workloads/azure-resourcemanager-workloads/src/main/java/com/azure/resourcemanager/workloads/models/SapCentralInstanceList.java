// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.workloads.fluent.models.SapCentralServerInstanceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the collection of SAP Central Instances. */
@Fluent
public final class SapCentralInstanceList {
    /*
     * Gets the list of SAP central instances.
     */
    @JsonProperty(value = "value")
    private List<SapCentralServerInstanceInner> value;

    /*
     * Gets the value of next link.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Gets the list of SAP central instances.
     *
     * @return the value value.
     */
    public List<SapCentralServerInstanceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets the list of SAP central instances.
     *
     * @param value the value value to set.
     * @return the SapCentralInstanceList object itself.
     */
    public SapCentralInstanceList withValue(List<SapCentralServerInstanceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets the value of next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets the value of next link.
     *
     * @param nextLink the nextLink value to set.
     * @return the SapCentralInstanceList object itself.
     */
    public SapCentralInstanceList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
