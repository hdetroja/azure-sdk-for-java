// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SampleName. */
public final class SampleName extends ExpandableStringEnum<SampleName> {
    /** Static value AdventureWorksLT for SampleName. */
    public static final SampleName ADVENTURE_WORKS_LT = fromString("AdventureWorksLT");

    /** Static value WideWorldImportersStd for SampleName. */
    public static final SampleName WIDE_WORLD_IMPORTERS_STD = fromString("WideWorldImportersStd");

    /** Static value WideWorldImportersFull for SampleName. */
    public static final SampleName WIDE_WORLD_IMPORTERS_FULL = fromString("WideWorldImportersFull");

    /**
     * Creates or finds a SampleName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SampleName.
     */
    @JsonCreator
    public static SampleName fromString(String name) {
        return fromString(name, SampleName.class);
    }

    /**
     * Gets known SampleName values.
     *
     * @return known SampleName values.
     */
    public static Collection<SampleName> values() {
        return values(SampleName.class);
    }
}
