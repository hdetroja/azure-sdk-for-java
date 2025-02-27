// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The QueueDescriptionEntryContent model. */
@JacksonXmlRootElement(localName = "null", namespace = "http://www.w3.org/2005/Atom")
@Fluent
public final class QueueDescriptionEntryContent {
    /*
     * Type of content in queue response
     */
    @JacksonXmlProperty(localName = "type", isAttribute = true)
    private String type;

    /*
     * Description of a Service Bus queue resource.
     */
    @JacksonXmlProperty(
            localName = "QueueDescription",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private QueueDescription queueDescription;

    /**
     * Get the type property: Type of content in queue response.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Type of content in queue response.
     *
     * @param type the type value to set.
     * @return the QueueDescriptionEntryContent object itself.
     */
    public QueueDescriptionEntryContent setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the queueDescription property: Description of a Service Bus queue resource.
     *
     * @return the queueDescription value.
     */
    public QueueDescription getQueueDescription() {
        return this.queueDescription;
    }

    /**
     * Set the queueDescription property: Description of a Service Bus queue resource.
     *
     * @param queueDescription the queueDescription value to set.
     * @return the QueueDescriptionEntryContent object itself.
     */
    public QueueDescriptionEntryContent setQueueDescription(QueueDescription queueDescription) {
        this.queueDescription = queueDescription;
        return this;
    }
}
