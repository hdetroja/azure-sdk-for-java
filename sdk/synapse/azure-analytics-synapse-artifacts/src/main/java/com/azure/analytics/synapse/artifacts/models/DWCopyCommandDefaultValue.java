// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Default value. */
@Fluent
public final class DWCopyCommandDefaultValue {
    /*
     * Column name. Type: object (or Expression with resultType string).
     */
    @JsonProperty(value = "columnName")
    private Object columnName;

    /*
     * The default value of the column. Type: object (or Expression with resultType string).
     */
    @JsonProperty(value = "defaultValue")
    private Object defaultValue;

    /**
     * Get the columnName property: Column name. Type: object (or Expression with resultType string).
     *
     * @return the columnName value.
     */
    public Object getColumnName() {
        return this.columnName;
    }

    /**
     * Set the columnName property: Column name. Type: object (or Expression with resultType string).
     *
     * @param columnName the columnName value to set.
     * @return the DWCopyCommandDefaultValue object itself.
     */
    public DWCopyCommandDefaultValue setColumnName(Object columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * Get the defaultValue property: The default value of the column. Type: object (or Expression with resultType
     * string).
     *
     * @return the defaultValue value.
     */
    public Object getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * Set the defaultValue property: The default value of the column. Type: object (or Expression with resultType
     * string).
     *
     * @param defaultValue the defaultValue value to set.
     * @return the DWCopyCommandDefaultValue object itself.
     */
    public DWCopyCommandDefaultValue setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
}
