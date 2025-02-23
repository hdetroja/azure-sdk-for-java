// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ForwardProxy;
import com.azure.resourcemanager.appcontainers.models.ForwardProxyConvention;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ForwardProxyTests {
    @Test
    public void testDeserialize() {
        ForwardProxy model =
            BinaryData
                .fromString(
                    "{\"convention\":\"Custom\",\"customHostHeaderName\":\"jdyggdtji\",\"customProtoHeaderName\":\"b\"}")
                .toObject(ForwardProxy.class);
        Assertions.assertEquals(ForwardProxyConvention.CUSTOM, model.convention());
        Assertions.assertEquals("jdyggdtji", model.customHostHeaderName());
        Assertions.assertEquals("b", model.customProtoHeaderName());
    }

    @Test
    public void testSerialize() {
        ForwardProxy model =
            new ForwardProxy()
                .withConvention(ForwardProxyConvention.CUSTOM)
                .withCustomHostHeaderName("jdyggdtji")
                .withCustomProtoHeaderName("b");
        model = BinaryData.fromObject(model).toObject(ForwardProxy.class);
        Assertions.assertEquals(ForwardProxyConvention.CUSTOM, model.convention());
        Assertions.assertEquals("jdyggdtji", model.customHostHeaderName());
        Assertions.assertEquals("b", model.customProtoHeaderName());
    }
}
