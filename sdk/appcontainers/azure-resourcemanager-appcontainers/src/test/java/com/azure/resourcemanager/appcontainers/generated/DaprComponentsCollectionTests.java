// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.DaprComponentInner;
import com.azure.resourcemanager.appcontainers.models.DaprComponentsCollection;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DaprComponentsCollectionTests {
    @Test
    public void testDeserialize() {
        DaprComponentsCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"componentType\":\"txhojujb\",\"version\":\"elmcuvhixbjxyfw\",\"ignoreErrors\":true,\"initTimeout\":\"coolsttpkiwkkb\",\"secrets\":[],\"secretStoreComponent\":\"rywvtylbfpn\",\"metadata\":[],\"scopes\":[]},\"id\":\"oiwiithtywub\",\"name\":\"cbihwqk\",\"type\":\"fdntwjchrdgoih\"},{\"properties\":{\"componentType\":\"wct\",\"version\":\"dzjlu\",\"ignoreErrors\":false,\"initTimeout\":\"lwg\",\"secrets\":[],\"secretStoreComponent\":\"sb\",\"metadata\":[],\"scopes\":[]},\"id\":\"vtgsei\",\"name\":\"qfi\",\"type\":\"fxqknpirgneptt\"}],\"nextLink\":\"msniffc\"}")
                .toObject(DaprComponentsCollection.class);
        Assertions.assertEquals("txhojujb", model.value().get(0).componentType());
        Assertions.assertEquals("elmcuvhixbjxyfw", model.value().get(0).version());
        Assertions.assertEquals(true, model.value().get(0).ignoreErrors());
        Assertions.assertEquals("coolsttpkiwkkb", model.value().get(0).initTimeout());
        Assertions.assertEquals("rywvtylbfpn", model.value().get(0).secretStoreComponent());
    }

    @Test
    public void testSerialize() {
        DaprComponentsCollection model =
            new DaprComponentsCollection()
                .withValue(
                    Arrays
                        .asList(
                            new DaprComponentInner()
                                .withComponentType("txhojujb")
                                .withVersion("elmcuvhixbjxyfw")
                                .withIgnoreErrors(true)
                                .withInitTimeout("coolsttpkiwkkb")
                                .withSecrets(Arrays.asList())
                                .withSecretStoreComponent("rywvtylbfpn")
                                .withMetadata(Arrays.asList())
                                .withScopes(Arrays.asList()),
                            new DaprComponentInner()
                                .withComponentType("wct")
                                .withVersion("dzjlu")
                                .withIgnoreErrors(false)
                                .withInitTimeout("lwg")
                                .withSecrets(Arrays.asList())
                                .withSecretStoreComponent("sb")
                                .withMetadata(Arrays.asList())
                                .withScopes(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(DaprComponentsCollection.class);
        Assertions.assertEquals("txhojujb", model.value().get(0).componentType());
        Assertions.assertEquals("elmcuvhixbjxyfw", model.value().get(0).version());
        Assertions.assertEquals(true, model.value().get(0).ignoreErrors());
        Assertions.assertEquals("coolsttpkiwkkb", model.value().get(0).initTimeout());
        Assertions.assertEquals("rywvtylbfpn", model.value().get(0).secretStoreComponent());
    }
}
