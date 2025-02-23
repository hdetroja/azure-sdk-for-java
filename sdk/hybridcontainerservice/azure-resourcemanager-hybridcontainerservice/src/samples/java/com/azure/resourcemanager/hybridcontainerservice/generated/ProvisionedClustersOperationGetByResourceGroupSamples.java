// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.Context;

/** Samples for ProvisionedClustersOperation GetByResourceGroup. */
public final class ProvisionedClustersOperationGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/preview/2022-05-01-preview/examples/GetProvisionedCluster.json
     */
    /**
     * Sample code: GetProvisionedCluster.
     *
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void getProvisionedCluster(
        com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager
            .provisionedClustersOperations()
            .getByResourceGroupWithResponse("test-arcappliance-resgrp", "test-hybridakscluster", Context.NONE);
    }
}
