// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation.models;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.azure.core.annotation.Fluent;

/** The ChoiceResult model. */
@Fluent
public final class ChoiceResult {
    /*
     * Label is the primary identifier for the choice detected
     */
    @JsonProperty(value = "label")
    private String label;

    /*
     * Phrases are set to the value if choice is selected via phrase detection.
     * If Dtmf input is recognized, then Label will be the identifier for the
     * choice detected and phrases will be set to null
     */
    @JsonProperty(value = "recognizedPhrase")
    private String recognizedPhrase;

    /**
     * Get the label property: Label is the primary identifier for the choice detected.
     *
     * @return the label value.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Set the label property: Label is the primary identifier for the choice detected.
     *
     * @param label the label value to set.
     * @return the ChoiceResult object itself.
     */
    public ChoiceResult setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the recognizedPhrase property: Phrases are set to the value if choice is selected via phrase detection. If
     * Dtmf input is recognized, then Label will be the identifier for the choice detected and phrases will be set to
     * null.
     *
     * @return the recognizedPhrase value.
     */
    public String getRecognizedPhrase() {
        return this.recognizedPhrase;
    }

    /**
     * Set the recognizedPhrase property: Phrases are set to the value if choice is selected via phrase detection. If
     * Dtmf input is recognized, then Label will be the identifier for the choice detected and phrases will be set to
     * null.
     *
     * @param recognizedPhrase the recognizedPhrase value to set.
     * @return the ChoiceResult object itself.
     */
    public ChoiceResult setRecognizedPhrase(String recognizedPhrase) {
        this.recognizedPhrase = recognizedPhrase;
        return this;
    }
}
