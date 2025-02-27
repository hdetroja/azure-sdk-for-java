// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specifies what scenario the customer wants this CDN endpoint to optimize, e.g. Download, Media services. With this
 * information we can apply scenario driven optimization.
 */
public final class OptimizationType extends ExpandableStringEnum<OptimizationType> {
    /** Static value GeneralWebDelivery for OptimizationType. */
    public static final OptimizationType GENERAL_WEB_DELIVERY = fromString("GeneralWebDelivery");

    /** Static value GeneralMediaStreaming for OptimizationType. */
    public static final OptimizationType GENERAL_MEDIA_STREAMING = fromString("GeneralMediaStreaming");

    /** Static value VideoOnDemandMediaStreaming for OptimizationType. */
    public static final OptimizationType VIDEO_ON_DEMAND_MEDIA_STREAMING = fromString("VideoOnDemandMediaStreaming");

    /** Static value LargeFileDownload for OptimizationType. */
    public static final OptimizationType LARGE_FILE_DOWNLOAD = fromString("LargeFileDownload");

    /** Static value DynamicSiteAcceleration for OptimizationType. */
    public static final OptimizationType DYNAMIC_SITE_ACCELERATION = fromString("DynamicSiteAcceleration");

    /**
     * Creates or finds a OptimizationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OptimizationType.
     */
    @JsonCreator
    public static OptimizationType fromString(String name) {
        return fromString(name, OptimizationType.class);
    }

    /**
     * Gets known OptimizationType values.
     *
     * @return known OptimizationType values.
     */
    public static Collection<OptimizationType> values() {
        return values(OptimizationType.class);
    }
}
