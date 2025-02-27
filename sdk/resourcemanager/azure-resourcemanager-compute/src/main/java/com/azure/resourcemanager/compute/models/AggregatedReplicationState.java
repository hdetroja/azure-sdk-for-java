// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** This is the aggregated replication status based on all the regional replication status flags. */
public final class AggregatedReplicationState extends ExpandableStringEnum<AggregatedReplicationState> {
    /** Static value Unknown for AggregatedReplicationState. */
    public static final AggregatedReplicationState UNKNOWN = fromString("Unknown");

    /** Static value InProgress for AggregatedReplicationState. */
    public static final AggregatedReplicationState IN_PROGRESS = fromString("InProgress");

    /** Static value Completed for AggregatedReplicationState. */
    public static final AggregatedReplicationState COMPLETED = fromString("Completed");

    /** Static value Failed for AggregatedReplicationState. */
    public static final AggregatedReplicationState FAILED = fromString("Failed");

    /**
     * Creates or finds a AggregatedReplicationState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AggregatedReplicationState.
     */
    @JsonCreator
    public static AggregatedReplicationState fromString(String name) {
        return fromString(name, AggregatedReplicationState.class);
    }

    /**
     * Gets known AggregatedReplicationState values.
     *
     * @return known AggregatedReplicationState values.
     */
    public static Collection<AggregatedReplicationState> values() {
        return values(AggregatedReplicationState.class);
    }
}
