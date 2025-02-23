// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for backup item. Workload-specific backup items are derived from this class. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "workloadItemType",
    defaultImpl = WorkloadItem.class)
@JsonTypeName("WorkloadItem")
@JsonSubTypes({@JsonSubTypes.Type(name = "AzureVmWorkloadItem", value = AzureVmWorkloadItem.class)})
@Fluent
public class WorkloadItem {
    /*
     * Type of backup management to backup an item.
     */
    @JsonProperty(value = "backupManagementType")
    private String backupManagementType;

    /*
     * Type of workload for the backup management
     */
    @JsonProperty(value = "workloadType")
    private String workloadType;

    /*
     * Friendly name of the backup item.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * State of the back up item.
     */
    @JsonProperty(value = "protectionState")
    private ProtectionStatus protectionState;

    /** Creates an instance of WorkloadItem class. */
    public WorkloadItem() {
    }

    /**
     * Get the backupManagementType property: Type of backup management to backup an item.
     *
     * @return the backupManagementType value.
     */
    public String backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set the backupManagementType property: Type of backup management to backup an item.
     *
     * @param backupManagementType the backupManagementType value to set.
     * @return the WorkloadItem object itself.
     */
    public WorkloadItem withBackupManagementType(String backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get the workloadType property: Type of workload for the backup management.
     *
     * @return the workloadType value.
     */
    public String workloadType() {
        return this.workloadType;
    }

    /**
     * Set the workloadType property: Type of workload for the backup management.
     *
     * @param workloadType the workloadType value to set.
     * @return the WorkloadItem object itself.
     */
    public WorkloadItem withWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of the backup item.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name of the backup item.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the WorkloadItem object itself.
     */
    public WorkloadItem withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the protectionState property: State of the back up item.
     *
     * @return the protectionState value.
     */
    public ProtectionStatus protectionState() {
        return this.protectionState;
    }

    /**
     * Set the protectionState property: State of the back up item.
     *
     * @param protectionState the protectionState value to set.
     * @return the WorkloadItem object itself.
     */
    public WorkloadItem withProtectionState(ProtectionStatus protectionState) {
        this.protectionState = protectionState;
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
