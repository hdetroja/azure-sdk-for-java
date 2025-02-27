// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of repositories. */
@Fluent
public final class Repositories {
    /*
     * Repository names
     */
    @JsonProperty(value = "repositories")
    private List<String> repositories;

    /*
     * The link property.
     */
    @JsonProperty(value = "link")
    private String link;

    /** Creates an instance of Repositories class. */
    public Repositories() {}

    /**
     * Get the repositories property: Repository names.
     *
     * @return the repositories value.
     */
    public List<String> getRepositories() {
        return this.repositories;
    }

    /**
     * Set the repositories property: Repository names.
     *
     * @param repositories the repositories value to set.
     * @return the Repositories object itself.
     */
    public Repositories setRepositories(List<String> repositories) {
        this.repositories = repositories;
        return this;
    }

    /**
     * Get the link property: The link property.
     *
     * @return the link value.
     */
    public String getLink() {
        return this.link;
    }

    /**
     * Set the link property: The link property.
     *
     * @param link the link value to set.
     * @return the Repositories object itself.
     */
    public Repositories setLink(String link) {
        this.link = link;
        return this;
    }
}
