// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Load Distribution Algorithm enums. */
public final class ApplicationGatewayLoadDistributionAlgorithm
    extends ExpandableStringEnum<ApplicationGatewayLoadDistributionAlgorithm> {
    /** Static value RoundRobin for ApplicationGatewayLoadDistributionAlgorithm. */
    public static final ApplicationGatewayLoadDistributionAlgorithm ROUND_ROBIN = fromString("RoundRobin");

    /** Static value LeastConnections for ApplicationGatewayLoadDistributionAlgorithm. */
    public static final ApplicationGatewayLoadDistributionAlgorithm LEAST_CONNECTIONS = fromString("LeastConnections");

    /** Static value IpHash for ApplicationGatewayLoadDistributionAlgorithm. */
    public static final ApplicationGatewayLoadDistributionAlgorithm IP_HASH = fromString("IpHash");

    /**
     * Creates or finds a ApplicationGatewayLoadDistributionAlgorithm from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationGatewayLoadDistributionAlgorithm.
     */
    @JsonCreator
    public static ApplicationGatewayLoadDistributionAlgorithm fromString(String name) {
        return fromString(name, ApplicationGatewayLoadDistributionAlgorithm.class);
    }

    /**
     * Gets known ApplicationGatewayLoadDistributionAlgorithm values.
     *
     * @return known ApplicationGatewayLoadDistributionAlgorithm values.
     */
    public static Collection<ApplicationGatewayLoadDistributionAlgorithm> values() {
        return values(ApplicationGatewayLoadDistributionAlgorithm.class);
    }
}
