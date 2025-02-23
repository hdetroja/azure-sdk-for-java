// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** The SearchIndexerLimits model. */
@Immutable
public final class SearchIndexerLimits {
    /*
     * The maximum duration that the indexer is permitted to run for one execution.
     */
    @JsonProperty(value = "maxRunTime", access = JsonProperty.Access.WRITE_ONLY)
    private Duration maxRunTime;

    /*
     * The maximum size of a document, in bytes, which will be considered valid for indexing.
     */
    @JsonProperty(value = "maxDocumentExtractionSize", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxDocumentExtractionSize;

    /*
     * The maximum number of characters that will be extracted from a document picked up for indexing.
     */
    @JsonProperty(value = "maxDocumentContentCharactersToExtract", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxDocumentContentCharactersToExtract;

    /**
     * Get the maxRunTime property: The maximum duration that the indexer is permitted to run for one execution.
     *
     * @return the maxRunTime value.
     */
    public Duration getMaxRunTime() {
        return this.maxRunTime;
    }

    /**
     * Get the maxDocumentExtractionSize property: The maximum size of a document, in bytes, which will be considered
     * valid for indexing.
     *
     * @return the maxDocumentExtractionSize value.
     */
    public Long getMaxDocumentExtractionSize() {
        return this.maxDocumentExtractionSize;
    }

    /**
     * Get the maxDocumentContentCharactersToExtract property: The maximum number of characters that will be extracted
     * from a document picked up for indexing.
     *
     * @return the maxDocumentContentCharactersToExtract value.
     */
    public Long getMaxDocumentContentCharactersToExtract() {
        return this.maxDocumentContentCharactersToExtract;
    }
}
