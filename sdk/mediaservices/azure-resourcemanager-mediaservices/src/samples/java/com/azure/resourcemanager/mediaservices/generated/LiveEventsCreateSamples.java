// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.resourcemanager.mediaservices.models.IpAccessControl;
import com.azure.resourcemanager.mediaservices.models.IpRange;
import com.azure.resourcemanager.mediaservices.models.LiveEventInput;
import com.azure.resourcemanager.mediaservices.models.LiveEventInputAccessControl;
import com.azure.resourcemanager.mediaservices.models.LiveEventInputProtocol;
import com.azure.resourcemanager.mediaservices.models.LiveEventPreview;
import com.azure.resourcemanager.mediaservices.models.LiveEventPreviewAccessControl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for LiveEvents Create. */
public final class LiveEventsCreateSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/stable/2022-08-01/examples/liveevent-create.json
     */
    /**
     * Sample code: Create a LiveEvent.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void createALiveEvent(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .liveEvents()
            .define("myLiveEvent1")
            .withRegion("West US")
            .withExistingMediaservice("mediaresources", "slitestmedia10")
            .withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withDescription("test event 1")
            .withInput(
                new LiveEventInput()
                    .withStreamingProtocol(LiveEventInputProtocol.RTMP)
                    .withAccessControl(
                        new LiveEventInputAccessControl()
                            .withIp(
                                new IpAccessControl()
                                    .withAllow(
                                        Arrays
                                            .asList(
                                                new IpRange()
                                                    .withName("AllowAll")
                                                    .withAddress("0.0.0.0")
                                                    .withSubnetPrefixLength(0)))))
                    .withKeyFrameIntervalDuration("PT6S"))
            .withPreview(
                new LiveEventPreview()
                    .withAccessControl(
                        new LiveEventPreviewAccessControl()
                            .withIp(
                                new IpAccessControl()
                                    .withAllow(
                                        Arrays
                                            .asList(
                                                new IpRange()
                                                    .withName("AllowAll")
                                                    .withAddress("0.0.0.0")
                                                    .withSubnetPrefixLength(0))))))
            .create();
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
