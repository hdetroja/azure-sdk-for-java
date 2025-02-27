// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionInner;
import com.azure.resourcemanager.kusto.fluent.models.EventGridConnectionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Class representing an Event Grid data connection. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("EventGrid")
@Fluent
public final class EventGridDataConnection extends DataConnectionInner {
    /*
     * The properties of the Event Grid data connection.
     */
    @JsonProperty(value = "properties")
    private EventGridConnectionProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of the Event Grid data connection.
     *
     * @return the innerProperties value.
     */
    private EventGridConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public EventGridDataConnection withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * Get the storageAccountResourceId property: The resource ID of the storage account where the data resides.
     *
     * @return the storageAccountResourceId value.
     */
    public String storageAccountResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountResourceId();
    }

    /**
     * Set the storageAccountResourceId property: The resource ID of the storage account where the data resides.
     *
     * @param storageAccountResourceId the storageAccountResourceId value to set.
     * @return the EventGridDataConnection object itself.
     */
    public EventGridDataConnection withStorageAccountResourceId(String storageAccountResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventGridConnectionProperties();
        }
        this.innerProperties().withStorageAccountResourceId(storageAccountResourceId);
        return this;
    }

    /**
     * Get the eventGridResourceId property: The resource ID of the event grid that is subscribed to the storage account
     * events.
     *
     * @return the eventGridResourceId value.
     */
    public String eventGridResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().eventGridResourceId();
    }

    /**
     * Set the eventGridResourceId property: The resource ID of the event grid that is subscribed to the storage account
     * events.
     *
     * @param eventGridResourceId the eventGridResourceId value to set.
     * @return the EventGridDataConnection object itself.
     */
    public EventGridDataConnection withEventGridResourceId(String eventGridResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventGridConnectionProperties();
        }
        this.innerProperties().withEventGridResourceId(eventGridResourceId);
        return this;
    }

    /**
     * Get the eventHubResourceId property: The resource ID where the event grid is configured to send events.
     *
     * @return the eventHubResourceId value.
     */
    public String eventHubResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().eventHubResourceId();
    }

    /**
     * Set the eventHubResourceId property: The resource ID where the event grid is configured to send events.
     *
     * @param eventHubResourceId the eventHubResourceId value to set.
     * @return the EventGridDataConnection object itself.
     */
    public EventGridDataConnection withEventHubResourceId(String eventHubResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventGridConnectionProperties();
        }
        this.innerProperties().withEventHubResourceId(eventHubResourceId);
        return this;
    }

    /**
     * Get the consumerGroup property: The event hub consumer group.
     *
     * @return the consumerGroup value.
     */
    public String consumerGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().consumerGroup();
    }

    /**
     * Set the consumerGroup property: The event hub consumer group.
     *
     * @param consumerGroup the consumerGroup value to set.
     * @return the EventGridDataConnection object itself.
     */
    public EventGridDataConnection withConsumerGroup(String consumerGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventGridConnectionProperties();
        }
        this.innerProperties().withConsumerGroup(consumerGroup);
        return this;
    }

    /**
     * Get the tableName property: The table where the data should be ingested. Optionally the table information can be
     * added to each message.
     *
     * @return the tableName value.
     */
    public String tableName() {
        return this.innerProperties() == null ? null : this.innerProperties().tableName();
    }

    /**
     * Set the tableName property: The table where the data should be ingested. Optionally the table information can be
     * added to each message.
     *
     * @param tableName the tableName value to set.
     * @return the EventGridDataConnection object itself.
     */
    public EventGridDataConnection withTableName(String tableName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventGridConnectionProperties();
        }
        this.innerProperties().withTableName(tableName);
        return this;
    }

    /**
     * Get the mappingRuleName property: The mapping rule to be used to ingest the data. Optionally the mapping
     * information can be added to each message.
     *
     * @return the mappingRuleName value.
     */
    public String mappingRuleName() {
        return this.innerProperties() == null ? null : this.innerProperties().mappingRuleName();
    }

    /**
     * Set the mappingRuleName property: The mapping rule to be used to ingest the data. Optionally the mapping
     * information can be added to each message.
     *
     * @param mappingRuleName the mappingRuleName value to set.
     * @return the EventGridDataConnection object itself.
     */
    public EventGridDataConnection withMappingRuleName(String mappingRuleName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventGridConnectionProperties();
        }
        this.innerProperties().withMappingRuleName(mappingRuleName);
        return this;
    }

    /**
     * Get the dataFormat property: The data format of the message. Optionally the data format can be added to each
     * message.
     *
     * @return the dataFormat value.
     */
    public EventGridDataFormat dataFormat() {
        return this.innerProperties() == null ? null : this.innerProperties().dataFormat();
    }

    /**
     * Set the dataFormat property: The data format of the message. Optionally the data format can be added to each
     * message.
     *
     * @param dataFormat the dataFormat value to set.
     * @return the EventGridDataConnection object itself.
     */
    public EventGridDataConnection withDataFormat(EventGridDataFormat dataFormat) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventGridConnectionProperties();
        }
        this.innerProperties().withDataFormat(dataFormat);
        return this;
    }

    /**
     * Get the ignoreFirstRecord property: A Boolean value that, if set to true, indicates that ingestion should ignore
     * the first record of every file.
     *
     * @return the ignoreFirstRecord value.
     */
    public Boolean ignoreFirstRecord() {
        return this.innerProperties() == null ? null : this.innerProperties().ignoreFirstRecord();
    }

    /**
     * Set the ignoreFirstRecord property: A Boolean value that, if set to true, indicates that ingestion should ignore
     * the first record of every file.
     *
     * @param ignoreFirstRecord the ignoreFirstRecord value to set.
     * @return the EventGridDataConnection object itself.
     */
    public EventGridDataConnection withIgnoreFirstRecord(Boolean ignoreFirstRecord) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventGridConnectionProperties();
        }
        this.innerProperties().withIgnoreFirstRecord(ignoreFirstRecord);
        return this;
    }

    /**
     * Get the blobStorageEventType property: The name of blob storage event type to process.
     *
     * @return the blobStorageEventType value.
     */
    public BlobStorageEventType blobStorageEventType() {
        return this.innerProperties() == null ? null : this.innerProperties().blobStorageEventType();
    }

    /**
     * Set the blobStorageEventType property: The name of blob storage event type to process.
     *
     * @param blobStorageEventType the blobStorageEventType value to set.
     * @return the EventGridDataConnection object itself.
     */
    public EventGridDataConnection withBlobStorageEventType(BlobStorageEventType blobStorageEventType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventGridConnectionProperties();
        }
        this.innerProperties().withBlobStorageEventType(blobStorageEventType);
        return this;
    }

    /**
     * Get the managedIdentityResourceId property: The resource ID of a managed identity (system or user assigned) to be
     * used to authenticate with event hub and storage account.
     *
     * @return the managedIdentityResourceId value.
     */
    public String managedIdentityResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().managedIdentityResourceId();
    }

    /**
     * Set the managedIdentityResourceId property: The resource ID of a managed identity (system or user assigned) to be
     * used to authenticate with event hub and storage account.
     *
     * @param managedIdentityResourceId the managedIdentityResourceId value to set.
     * @return the EventGridDataConnection object itself.
     */
    public EventGridDataConnection withManagedIdentityResourceId(String managedIdentityResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventGridConnectionProperties();
        }
        this.innerProperties().withManagedIdentityResourceId(managedIdentityResourceId);
        return this;
    }

    /**
     * Get the managedIdentityObjectId property: The object ID of managedIdentityResourceId.
     *
     * @return the managedIdentityObjectId value.
     */
    public String managedIdentityObjectId() {
        return this.innerProperties() == null ? null : this.innerProperties().managedIdentityObjectId();
    }

    /**
     * Get the databaseRouting property: Indication for database routing information from the data connection, by
     * default only database routing information is allowed.
     *
     * @return the databaseRouting value.
     */
    public DatabaseRouting databaseRouting() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseRouting();
    }

    /**
     * Set the databaseRouting property: Indication for database routing information from the data connection, by
     * default only database routing information is allowed.
     *
     * @param databaseRouting the databaseRouting value to set.
     * @return the EventGridDataConnection object itself.
     */
    public EventGridDataConnection withDatabaseRouting(DatabaseRouting databaseRouting) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventGridConnectionProperties();
        }
        this.innerProperties().withDatabaseRouting(databaseRouting);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
