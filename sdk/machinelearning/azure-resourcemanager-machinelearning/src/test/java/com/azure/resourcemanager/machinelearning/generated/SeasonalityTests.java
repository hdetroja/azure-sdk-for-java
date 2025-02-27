// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.Seasonality;
import org.junit.jupiter.api.Test;

public final class SeasonalityTests {
    @Test
    public void testDeserialize() {
        Seasonality model = BinaryData.fromString("{\"mode\":\"Seasonality\"}").toObject(Seasonality.class);
    }

    @Test
    public void testSerialize() {
        Seasonality model = new Seasonality();
        model = BinaryData.fromObject(model).toObject(Seasonality.class);
    }
}
