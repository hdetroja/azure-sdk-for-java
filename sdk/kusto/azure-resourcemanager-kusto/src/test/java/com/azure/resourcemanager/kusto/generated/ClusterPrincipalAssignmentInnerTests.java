// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.ClusterPrincipalAssignmentInner;
import com.azure.resourcemanager.kusto.models.ClusterPrincipalRole;
import com.azure.resourcemanager.kusto.models.PrincipalType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClusterPrincipalAssignmentInnerTests {
    @Test
    public void testDeserialize() {
        ClusterPrincipalAssignmentInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"principalId\":\"dkcglhsl\",\"role\":\"AllDatabasesAdmin\",\"tenantId\":\"dyggdtjixhbku\",\"principalType\":\"App\",\"tenantName\":\"wey\",\"principalName\":\"menevfyexfwh\",\"provisioningState\":\"Creating\",\"aadObjectId\":\"bvyvdcsity\"},\"id\":\"naamde\",\"name\":\"tehfiqscjeypvh\",\"type\":\"zrkgqhcjrefovg\"}")
                .toObject(ClusterPrincipalAssignmentInner.class);
        Assertions.assertEquals("dkcglhsl", model.principalId());
        Assertions.assertEquals(ClusterPrincipalRole.ALL_DATABASES_ADMIN, model.role());
        Assertions.assertEquals("dyggdtjixhbku", model.tenantId());
        Assertions.assertEquals(PrincipalType.APP, model.principalType());
    }

    @Test
    public void testSerialize() {
        ClusterPrincipalAssignmentInner model =
            new ClusterPrincipalAssignmentInner()
                .withPrincipalId("dkcglhsl")
                .withRole(ClusterPrincipalRole.ALL_DATABASES_ADMIN)
                .withTenantId("dyggdtjixhbku")
                .withPrincipalType(PrincipalType.APP);
        model = BinaryData.fromObject(model).toObject(ClusterPrincipalAssignmentInner.class);
        Assertions.assertEquals("dkcglhsl", model.principalId());
        Assertions.assertEquals(ClusterPrincipalRole.ALL_DATABASES_ADMIN, model.role());
        Assertions.assertEquals("dyggdtjixhbku", model.tenantId());
        Assertions.assertEquals(PrincipalType.APP, model.principalType());
    }
}
