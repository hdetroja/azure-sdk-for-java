// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Enum to determine the job distribution type. */
public final class DistributionType extends ExpandableStringEnum<DistributionType> {
    /** Static value PyTorch for DistributionType. */
    public static final DistributionType PY_TORCH = fromString("PyTorch");

    /** Static value TensorFlow for DistributionType. */
    public static final DistributionType TENSOR_FLOW = fromString("TensorFlow");

    /** Static value Mpi for DistributionType. */
    public static final DistributionType MPI = fromString("Mpi");

    /**
     * Creates or finds a DistributionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DistributionType.
     */
    @JsonCreator
    public static DistributionType fromString(String name) {
        return fromString(name, DistributionType.class);
    }

    /**
     * Gets known DistributionType values.
     *
     * @return known DistributionType values.
     */
    public static Collection<DistributionType> values() {
        return values(DistributionType.class);
    }
}
