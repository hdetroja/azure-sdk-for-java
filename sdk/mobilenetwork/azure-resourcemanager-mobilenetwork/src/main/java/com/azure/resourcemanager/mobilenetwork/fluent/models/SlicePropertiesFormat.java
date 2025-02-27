// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.azure.resourcemanager.mobilenetwork.models.Snssai;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Network slice properties. */
@Fluent
public final class SlicePropertiesFormat {
    /*
     * The provisioning state of the network slice resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Single-network slice selection assistance information (S-NSSAI). Unique
     * at the scope of a mobile network.
     */
    @JsonProperty(value = "snssai", required = true)
    private Snssai snssai;

    /*
     * An optional description for this network slice.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the provisioningState property: The provisioning state of the network slice resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the snssai property: Single-network slice selection assistance information (S-NSSAI). Unique at the scope of
     * a mobile network.
     *
     * @return the snssai value.
     */
    public Snssai snssai() {
        return this.snssai;
    }

    /**
     * Set the snssai property: Single-network slice selection assistance information (S-NSSAI). Unique at the scope of
     * a mobile network.
     *
     * @param snssai the snssai value to set.
     * @return the SlicePropertiesFormat object itself.
     */
    public SlicePropertiesFormat withSnssai(Snssai snssai) {
        this.snssai = snssai;
        return this;
    }

    /**
     * Get the description property: An optional description for this network slice.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: An optional description for this network slice.
     *
     * @param description the description value to set.
     * @return the SlicePropertiesFormat object itself.
     */
    public SlicePropertiesFormat withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (snssai() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property snssai in model SlicePropertiesFormat"));
        } else {
            snssai().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SlicePropertiesFormat.class);
}
