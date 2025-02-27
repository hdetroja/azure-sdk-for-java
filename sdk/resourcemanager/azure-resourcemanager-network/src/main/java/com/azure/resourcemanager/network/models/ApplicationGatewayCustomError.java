// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Customer error of an application gateway. */
@Fluent
public final class ApplicationGatewayCustomError {
    /*
     * Status code of the application gateway customer error.
     */
    @JsonProperty(value = "statusCode")
    private ApplicationGatewayCustomErrorStatusCode statusCode;

    /*
     * Error page URL of the application gateway customer error.
     */
    @JsonProperty(value = "customErrorPageUrl")
    private String customErrorPageUrl;

    /** Creates an instance of ApplicationGatewayCustomError class. */
    public ApplicationGatewayCustomError() {
    }

    /**
     * Get the statusCode property: Status code of the application gateway customer error.
     *
     * @return the statusCode value.
     */
    public ApplicationGatewayCustomErrorStatusCode statusCode() {
        return this.statusCode;
    }

    /**
     * Set the statusCode property: Status code of the application gateway customer error.
     *
     * @param statusCode the statusCode value to set.
     * @return the ApplicationGatewayCustomError object itself.
     */
    public ApplicationGatewayCustomError withStatusCode(ApplicationGatewayCustomErrorStatusCode statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get the customErrorPageUrl property: Error page URL of the application gateway customer error.
     *
     * @return the customErrorPageUrl value.
     */
    public String customErrorPageUrl() {
        return this.customErrorPageUrl;
    }

    /**
     * Set the customErrorPageUrl property: Error page URL of the application gateway customer error.
     *
     * @param customErrorPageUrl the customErrorPageUrl value to set.
     * @return the ApplicationGatewayCustomError object itself.
     */
    public ApplicationGatewayCustomError withCustomErrorPageUrl(String customErrorPageUrl) {
        this.customErrorPageUrl = customErrorPageUrl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
