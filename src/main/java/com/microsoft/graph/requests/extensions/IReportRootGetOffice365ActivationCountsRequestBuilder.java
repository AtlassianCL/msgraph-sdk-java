// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationCountsRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Office365Activation Counts Request Builder.
 */
public interface IReportRootGetOffice365ActivationCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetOffice365ActivationCountsRequest
     *
     * @return the IReportRootGetOffice365ActivationCountsRequest instance
     */
    IReportRootGetOffice365ActivationCountsRequest buildRequest();

    /**
     * Creates the IReportRootGetOffice365ActivationCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOffice365ActivationCountsRequest instance
     */
    IReportRootGetOffice365ActivationCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
