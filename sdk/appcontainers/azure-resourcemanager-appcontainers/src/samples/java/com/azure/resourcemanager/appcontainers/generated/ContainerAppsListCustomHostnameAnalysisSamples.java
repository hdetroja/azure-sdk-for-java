// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.Context;

/** Samples for ContainerApps ListCustomHostnameAnalysis. */
public final class ContainerAppsListCustomHostnameAnalysisSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2022-06-01-preview/examples/ContainerApps_ListCustomHostNameAnalysis.json
     */
    /**
     * Sample code: Analyze Custom Hostname.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void analyzeCustomHostname(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerApps()
            .listCustomHostnameAnalysisWithResponse("rg", "testcontainerApp0", "my.name.corp", Context.NONE);
    }
}
