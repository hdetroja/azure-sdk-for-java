// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Domain purchase consent object, representing acceptance of applicable legal agreements. */
@Fluent
public final class DomainPurchaseConsent {
    /*
     * List of applicable legal agreement keys. This list can be retrieved
     * using ListLegalAgreements API under <code>TopLevelDomain</code>
     * resource.
     */
    @JsonProperty(value = "agreementKeys")
    private List<String> agreementKeys;

    /*
     * Client IP address.
     */
    @JsonProperty(value = "agreedBy")
    private String agreedBy;

    /*
     * Timestamp when the agreements were accepted.
     */
    @JsonProperty(value = "agreedAt")
    private OffsetDateTime agreedAt;

    /**
     * Get the agreementKeys property: List of applicable legal agreement keys. This list can be retrieved using
     * ListLegalAgreements API under &lt;code&gt;TopLevelDomain&lt;/code&gt; resource.
     *
     * @return the agreementKeys value.
     */
    public List<String> agreementKeys() {
        return this.agreementKeys;
    }

    /**
     * Set the agreementKeys property: List of applicable legal agreement keys. This list can be retrieved using
     * ListLegalAgreements API under &lt;code&gt;TopLevelDomain&lt;/code&gt; resource.
     *
     * @param agreementKeys the agreementKeys value to set.
     * @return the DomainPurchaseConsent object itself.
     */
    public DomainPurchaseConsent withAgreementKeys(List<String> agreementKeys) {
        this.agreementKeys = agreementKeys;
        return this;
    }

    /**
     * Get the agreedBy property: Client IP address.
     *
     * @return the agreedBy value.
     */
    public String agreedBy() {
        return this.agreedBy;
    }

    /**
     * Set the agreedBy property: Client IP address.
     *
     * @param agreedBy the agreedBy value to set.
     * @return the DomainPurchaseConsent object itself.
     */
    public DomainPurchaseConsent withAgreedBy(String agreedBy) {
        this.agreedBy = agreedBy;
        return this;
    }

    /**
     * Get the agreedAt property: Timestamp when the agreements were accepted.
     *
     * @return the agreedAt value.
     */
    public OffsetDateTime agreedAt() {
        return this.agreedAt;
    }

    /**
     * Set the agreedAt property: Timestamp when the agreements were accepted.
     *
     * @param agreedAt the agreedAt value to set.
     * @return the DomainPurchaseConsent object itself.
     */
    public DomainPurchaseConsent withAgreedAt(OffsetDateTime agreedAt) {
        this.agreedAt = agreedAt;
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
