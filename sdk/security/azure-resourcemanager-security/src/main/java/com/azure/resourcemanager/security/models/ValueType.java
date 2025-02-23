// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The value type of the items in the list. */
public final class ValueType extends ExpandableStringEnum<ValueType> {
    /** Static value IpCidr for ValueType. */
    public static final ValueType IP_CIDR = fromString("IpCidr");

    /** Static value String for ValueType. */
    public static final ValueType STRING = fromString("String");

    /**
     * Creates or finds a ValueType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ValueType.
     */
    @JsonCreator
    public static ValueType fromString(String name) {
        return fromString(name, ValueType.class);
    }

    /**
     * Gets known ValueType values.
     *
     * @return known ValueType values.
     */
    public static Collection<ValueType> values() {
        return values(ValueType.class);
    }
}
