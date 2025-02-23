// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Temporary disk payload. */
@Fluent
public final class TemporaryDisk {
    /*
     * Size of the temporary disk in GB
     */
    @JsonProperty(value = "sizeInGB")
    private Integer sizeInGB;

    /*
     * Mount path of the temporary disk
     */
    @JsonProperty(value = "mountPath")
    private String mountPath;

    /**
     * Get the sizeInGB property: Size of the temporary disk in GB.
     *
     * @return the sizeInGB value.
     */
    public Integer sizeInGB() {
        return this.sizeInGB;
    }

    /**
     * Set the sizeInGB property: Size of the temporary disk in GB.
     *
     * @param sizeInGB the sizeInGB value to set.
     * @return the TemporaryDisk object itself.
     */
    public TemporaryDisk withSizeInGB(Integer sizeInGB) {
        this.sizeInGB = sizeInGB;
        return this;
    }

    /**
     * Get the mountPath property: Mount path of the temporary disk.
     *
     * @return the mountPath value.
     */
    public String mountPath() {
        return this.mountPath;
    }

    /**
     * Set the mountPath property: Mount path of the temporary disk.
     *
     * @param mountPath the mountPath value to set.
     * @return the TemporaryDisk object itself.
     */
    public TemporaryDisk withMountPath(String mountPath) {
        this.mountPath = mountPath;
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
