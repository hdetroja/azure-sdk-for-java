// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for Usages ListByInstancePool. */
public final class UsagesListByInstancePoolSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2018-06-01-preview/examples/ListInstancePoolUsage.json
     */
    /**
     * Sample code: List instance pool usages.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listInstancePoolUsages(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getUsages()
            .listByInstancePool("group1", "testIP", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2018-06-01-preview/examples/ListInstancePoolUsageExpanded.json
     */
    /**
     * Sample code: List instance pool usages expanded with children.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listInstancePoolUsagesExpandedWithChildren(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getUsages()
            .listByInstancePool("group1", "testIP", true, Context.NONE);
    }
}
