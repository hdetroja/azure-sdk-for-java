// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dashboard.fluent.models.ManagedGrafanaInner;
import com.azure.resourcemanager.dashboard.models.ApiKey;
import com.azure.resourcemanager.dashboard.models.AutoGeneratedDomainNameLabelScope;
import com.azure.resourcemanager.dashboard.models.DeterministicOutboundIp;
import com.azure.resourcemanager.dashboard.models.ManagedGrafanaListResponse;
import com.azure.resourcemanager.dashboard.models.ManagedGrafanaProperties;
import com.azure.resourcemanager.dashboard.models.ManagedServiceIdentity;
import com.azure.resourcemanager.dashboard.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.dashboard.models.PublicNetworkAccess;
import com.azure.resourcemanager.dashboard.models.ResourceSku;
import com.azure.resourcemanager.dashboard.models.ZoneRedundancy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ManagedGrafanaListResponseTests {
    @Test
    public void testDeserialize() {
        ManagedGrafanaListResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"sku\":{\"name\":\"ithxqhabifpi\"},\"properties\":{\"provisioningState\":\"Accepted\",\"grafanaVersion\":\"byscnp\",\"endpoint\":\"uhivyqniw\",\"publicNetworkAccess\":\"Enabled\",\"zoneRedundancy\":\"Disabled\",\"apiKey\":\"Disabled\",\"deterministicOutboundIP\":\"Enabled\",\"outboundIPs\":[],\"privateEndpointConnections\":[],\"autoGeneratedDomainNameLabelScope\":\"TenantReuse\"},\"identity\":{\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{}},\"location\":\"gaudcc\",\"tags\":{\"cnyejhkryhtnapcz\":\"s\"},\"id\":\"lokjyemkk\",\"name\":\"ni\",\"type\":\"joxzjnchgejspodm\"}],\"nextLink\":\"lzydehojwyahux\"}")
                .toObject(ManagedGrafanaListResponse.class);
        Assertions.assertEquals("gaudcc", model.value().get(0).location());
        Assertions.assertEquals("s", model.value().get(0).tags().get("cnyejhkryhtnapcz"));
        Assertions.assertEquals("ithxqhabifpi", model.value().get(0).sku().name());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.value().get(0).properties().publicNetworkAccess());
        Assertions.assertEquals(ZoneRedundancy.DISABLED, model.value().get(0).properties().zoneRedundancy());
        Assertions.assertEquals(ApiKey.DISABLED, model.value().get(0).properties().apiKey());
        Assertions
            .assertEquals(DeterministicOutboundIp.ENABLED, model.value().get(0).properties().deterministicOutboundIp());
        Assertions
            .assertEquals(
                AutoGeneratedDomainNameLabelScope.TENANT_REUSE,
                model.value().get(0).properties().autoGeneratedDomainNameLabelScope());
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("lzydehojwyahux", model.nextLink());
    }

    @Test
    public void testSerialize() {
        ManagedGrafanaListResponse model =
            new ManagedGrafanaListResponse()
                .withValue(
                    Arrays
                        .asList(
                            new ManagedGrafanaInner()
                                .withLocation("gaudcc")
                                .withTags(mapOf("cnyejhkryhtnapcz", "s"))
                                .withSku(new ResourceSku().withName("ithxqhabifpi"))
                                .withProperties(
                                    new ManagedGrafanaProperties()
                                        .withPublicNetworkAccess(PublicNetworkAccess.ENABLED)
                                        .withZoneRedundancy(ZoneRedundancy.DISABLED)
                                        .withApiKey(ApiKey.DISABLED)
                                        .withDeterministicOutboundIp(DeterministicOutboundIp.ENABLED)
                                        .withAutoGeneratedDomainNameLabelScope(
                                            AutoGeneratedDomainNameLabelScope.TENANT_REUSE))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))))
                .withNextLink("lzydehojwyahux");
        model = BinaryData.fromObject(model).toObject(ManagedGrafanaListResponse.class);
        Assertions.assertEquals("gaudcc", model.value().get(0).location());
        Assertions.assertEquals("s", model.value().get(0).tags().get("cnyejhkryhtnapcz"));
        Assertions.assertEquals("ithxqhabifpi", model.value().get(0).sku().name());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.value().get(0).properties().publicNetworkAccess());
        Assertions.assertEquals(ZoneRedundancy.DISABLED, model.value().get(0).properties().zoneRedundancy());
        Assertions.assertEquals(ApiKey.DISABLED, model.value().get(0).properties().apiKey());
        Assertions
            .assertEquals(DeterministicOutboundIp.ENABLED, model.value().get(0).properties().deterministicOutboundIp());
        Assertions
            .assertEquals(
                AutoGeneratedDomainNameLabelScope.TENANT_REUSE,
                model.value().get(0).properties().autoGeneratedDomainNameLabelScope());
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("lzydehojwyahux", model.nextLink());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
