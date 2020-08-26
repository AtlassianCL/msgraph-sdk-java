// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Threat Assessment Request Collection Request.
 */
public interface IThreatAssessmentRequestCollectionRequest {

    void get(final ICallback<IThreatAssessmentRequestCollectionPage> callback);

    IThreatAssessmentRequestCollectionPage get() throws ClientException;

    void post(final ThreatAssessmentRequest newThreatAssessmentRequest, final ICallback<ThreatAssessmentRequest> callback);

    ThreatAssessmentRequest post(final ThreatAssessmentRequest newThreatAssessmentRequest) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IThreatAssessmentRequestCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IThreatAssessmentRequestCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IThreatAssessmentRequestCollectionRequest top(final int value);

}
