// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ExpandTypesForGetCapacityReservationGroups. */
public final class ExpandTypesForGetCapacityReservationGroups
    extends ExpandableStringEnum<ExpandTypesForGetCapacityReservationGroups> {
    /** Static value virtualMachineScaleSetVMs/$ref for ExpandTypesForGetCapacityReservationGroups. */
    public static final ExpandTypesForGetCapacityReservationGroups VIRTUAL_MACHINE_SCALE_SET_VMS_REF =
        fromString("virtualMachineScaleSetVMs/$ref");

    /** Static value virtualMachines/$ref for ExpandTypesForGetCapacityReservationGroups. */
    public static final ExpandTypesForGetCapacityReservationGroups VIRTUAL_MACHINES_REF =
        fromString("virtualMachines/$ref");

    /**
     * Creates or finds a ExpandTypesForGetCapacityReservationGroups from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExpandTypesForGetCapacityReservationGroups.
     */
    @JsonCreator
    public static ExpandTypesForGetCapacityReservationGroups fromString(String name) {
        return fromString(name, ExpandTypesForGetCapacityReservationGroups.class);
    }

    /**
     * Gets known ExpandTypesForGetCapacityReservationGroups values.
     *
     * @return known ExpandTypesForGetCapacityReservationGroups values.
     */
    public static Collection<ExpandTypesForGetCapacityReservationGroups> values() {
        return values(ExpandTypesForGetCapacityReservationGroups.class);
    }
}
