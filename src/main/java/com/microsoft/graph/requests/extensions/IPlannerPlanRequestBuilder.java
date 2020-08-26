// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPlannerPlanRequest;
import com.microsoft.graph.requests.extensions.IPlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerBucketRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanDetailsRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Plan Request Builder.
 */
public interface IPlannerPlanRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IPlannerPlanRequest instance
     */
    IPlannerPlanRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IPlannerPlanRequest instance
     */
    IPlannerPlanRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IPlannerTaskCollectionRequestBuilder tasks();

    IPlannerTaskRequestBuilder tasks(final String id);

    IPlannerBucketCollectionRequestBuilder buckets();

    IPlannerBucketRequestBuilder buckets(final String id);

    /**
     * Gets the request builder for PlannerPlanDetails
     *
     * @return the IPlannerPlanDetailsRequestBuilder instance
     */
    IPlannerPlanDetailsRequestBuilder details();

}
