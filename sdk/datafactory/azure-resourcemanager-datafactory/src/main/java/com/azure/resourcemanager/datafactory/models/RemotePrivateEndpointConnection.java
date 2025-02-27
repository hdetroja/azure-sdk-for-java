// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A remote private endpoint connection. */
@Fluent
public final class RemotePrivateEndpointConnection {
    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * PrivateEndpoint of a remote private endpoint connection
     */
    @JsonProperty(value = "privateEndpoint")
    private ArmIdWrapper privateEndpoint;

    /*
     * The state of a private link connection
     */
    @JsonProperty(value = "privateLinkServiceConnectionState")
    private PrivateLinkConnectionState privateLinkServiceConnectionState;

    /** Creates an instance of RemotePrivateEndpointConnection class. */
    public RemotePrivateEndpointConnection() {
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the privateEndpoint property: PrivateEndpoint of a remote private endpoint connection.
     *
     * @return the privateEndpoint value.
     */
    public ArmIdWrapper privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: PrivateEndpoint of a remote private endpoint connection.
     *
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the RemotePrivateEndpointConnection object itself.
     */
    public RemotePrivateEndpointConnection withPrivateEndpoint(ArmIdWrapper privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: The state of a private link connection.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: The state of a private link connection.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the RemotePrivateEndpointConnection object itself.
     */
    public RemotePrivateEndpointConnection withPrivateLinkServiceConnectionState(
        PrivateLinkConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpoint() != null) {
            privateEndpoint().validate();
        }
        if (privateLinkServiceConnectionState() != null) {
            privateLinkServiceConnectionState().validate();
        }
    }
}
