// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Express Route Circuit connection state. */
public final class CircuitConnectionStatus extends ExpandableStringEnum<CircuitConnectionStatus> {
    /** Static value Connected for CircuitConnectionStatus. */
    public static final CircuitConnectionStatus CONNECTED = fromString("Connected");

    /** Static value Connecting for CircuitConnectionStatus. */
    public static final CircuitConnectionStatus CONNECTING = fromString("Connecting");

    /** Static value Disconnected for CircuitConnectionStatus. */
    public static final CircuitConnectionStatus DISCONNECTED = fromString("Disconnected");

    /**
     * Creates or finds a CircuitConnectionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CircuitConnectionStatus.
     */
    @JsonCreator
    public static CircuitConnectionStatus fromString(String name) {
        return fromString(name, CircuitConnectionStatus.class);
    }

    /**
     * Gets known CircuitConnectionStatus values.
     *
     * @return known CircuitConnectionStatus values.
     */
    public static Collection<CircuitConnectionStatus> values() {
        return values(CircuitConnectionStatus.class);
    }
}
