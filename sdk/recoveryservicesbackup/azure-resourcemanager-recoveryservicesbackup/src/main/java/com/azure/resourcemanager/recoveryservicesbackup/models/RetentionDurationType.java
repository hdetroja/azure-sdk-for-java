// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Retention duration type of retention policy. */
public final class RetentionDurationType extends ExpandableStringEnum<RetentionDurationType> {
    /** Static value Invalid for RetentionDurationType. */
    public static final RetentionDurationType INVALID = fromString("Invalid");

    /** Static value Days for RetentionDurationType. */
    public static final RetentionDurationType DAYS = fromString("Days");

    /** Static value Weeks for RetentionDurationType. */
    public static final RetentionDurationType WEEKS = fromString("Weeks");

    /** Static value Months for RetentionDurationType. */
    public static final RetentionDurationType MONTHS = fromString("Months");

    /** Static value Years for RetentionDurationType. */
    public static final RetentionDurationType YEARS = fromString("Years");

    /**
     * Creates or finds a RetentionDurationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RetentionDurationType.
     */
    @JsonCreator
    public static RetentionDurationType fromString(String name) {
        return fromString(name, RetentionDurationType.class);
    }

    /**
     * Gets known RetentionDurationType values.
     *
     * @return known RetentionDurationType values.
     */
    public static Collection<RetentionDurationType> values() {
        return values(RetentionDurationType.class);
    }
}
