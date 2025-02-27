// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AccessType. */
public final class AccessType extends ExpandableStringEnum<AccessType> {
    /** Static value AccessKey for AccessType. */
    public static final AccessType ACCESS_KEY = fromString("AccessKey");

    /** Static value SystemAssignedManagedIdentity for AccessType. */
    public static final AccessType SYSTEM_ASSIGNED_MANAGED_IDENTITY = fromString("SystemAssignedManagedIdentity");

    /** Static value UserAssignedManagedIdentity for AccessType. */
    public static final AccessType USER_ASSIGNED_MANAGED_IDENTITY = fromString("UserAssignedManagedIdentity");

    /**
     * Creates or finds a AccessType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AccessType.
     */
    @JsonCreator
    public static AccessType fromString(String name) {
        return fromString(name, AccessType.class);
    }

    /** @return known AccessType values. */
    public static Collection<AccessType> values() {
        return values(AccessType.class);
    }
}
