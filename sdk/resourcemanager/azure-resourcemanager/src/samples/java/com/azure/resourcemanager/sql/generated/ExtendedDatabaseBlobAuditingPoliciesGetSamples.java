// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for ExtendedDatabaseBlobAuditingPolicies Get. */
public final class ExtendedDatabaseBlobAuditingPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2017-03-01-preview/examples/ExtendedDatabaseBlobAuditingGet.json
     */
    /**
     * Sample code: Get an extended database's blob auditing policy.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAnExtendedDatabaseSBlobAuditingPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getExtendedDatabaseBlobAuditingPolicies()
            .getWithResponse("blobauditingtest-6852", "blobauditingtest-2080", "testdb", Context.NONE);
    }
}
