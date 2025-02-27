// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.IdAssetReference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IdAssetReferenceTests {
    @Test
    public void testDeserialize() {
        IdAssetReference model =
            BinaryData
                .fromString("{\"referenceType\":\"Id\",\"assetId\":\"itpkpztrgdg\"}")
                .toObject(IdAssetReference.class);
        Assertions.assertEquals("itpkpztrgdg", model.assetId());
    }

    @Test
    public void testSerialize() {
        IdAssetReference model = new IdAssetReference().withAssetId("itpkpztrgdg");
        model = BinaryData.fromObject(model).toObject(IdAssetReference.class);
        Assertions.assertEquals("itpkpztrgdg", model.assetId());
    }
}
