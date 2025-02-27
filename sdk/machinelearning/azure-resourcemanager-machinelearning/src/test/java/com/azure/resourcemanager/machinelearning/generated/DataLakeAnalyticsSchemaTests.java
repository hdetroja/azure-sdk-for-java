// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.DataLakeAnalyticsSchema;
import com.azure.resourcemanager.machinelearning.models.DataLakeAnalyticsSchemaProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DataLakeAnalyticsSchemaTests {
    @Test
    public void testDeserialize() {
        DataLakeAnalyticsSchema model =
            BinaryData
                .fromString("{\"properties\":{\"dataLakeStoreAccountName\":\"mg\"}}")
                .toObject(DataLakeAnalyticsSchema.class);
        Assertions.assertEquals("mg", model.properties().dataLakeStoreAccountName());
    }

    @Test
    public void testSerialize() {
        DataLakeAnalyticsSchema model =
            new DataLakeAnalyticsSchema()
                .withProperties(new DataLakeAnalyticsSchemaProperties().withDataLakeStoreAccountName("mg"));
        model = BinaryData.fromObject(model).toObject(DataLakeAnalyticsSchema.class);
        Assertions.assertEquals("mg", model.properties().dataLakeStoreAccountName());
    }
}
