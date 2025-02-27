// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** Part of MultiTenantDiagnosticSettings. Specifies the settings for a particular metric. */
@Fluent
public final class MetricSettings {
    /*
     * the timegrain of the metric in ISO8601 format.
     */
    @JsonProperty(value = "timeGrain")
    private Duration timeGrain;

    /*
     * Name of a Diagnostic Metric category for a resource type this setting is applied to. To obtain the list of
     * Diagnostic metric categories for a resource, first perform a GET diagnostic settings operation.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * a value indicating whether this category is enabled.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * the retention policy for this category.
     */
    @JsonProperty(value = "retentionPolicy")
    private RetentionPolicy retentionPolicy;

    /**
     * Get the timeGrain property: the timegrain of the metric in ISO8601 format.
     *
     * @return the timeGrain value.
     */
    public Duration timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain property: the timegrain of the metric in ISO8601 format.
     *
     * @param timeGrain the timeGrain value to set.
     * @return the MetricSettings object itself.
     */
    public MetricSettings withTimeGrain(Duration timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the category property: Name of a Diagnostic Metric category for a resource type this setting is applied to.
     * To obtain the list of Diagnostic metric categories for a resource, first perform a GET diagnostic settings
     * operation.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: Name of a Diagnostic Metric category for a resource type this setting is applied to.
     * To obtain the list of Diagnostic metric categories for a resource, first perform a GET diagnostic settings
     * operation.
     *
     * @param category the category value to set.
     * @return the MetricSettings object itself.
     */
    public MetricSettings withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the enabled property: a value indicating whether this category is enabled.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: a value indicating whether this category is enabled.
     *
     * @param enabled the enabled value to set.
     * @return the MetricSettings object itself.
     */
    public MetricSettings withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the retentionPolicy property: the retention policy for this category.
     *
     * @return the retentionPolicy value.
     */
    public RetentionPolicy retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: the retention policy for this category.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the MetricSettings object itself.
     */
    public MetricSettings withRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (retentionPolicy() != null) {
            retentionPolicy().validate();
        }
    }
}
