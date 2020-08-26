// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsWeibull_DistRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Weibull_Dist Request Builder.
 */
public interface IWorkbookFunctionsWeibull_DistRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsWeibull_DistRequest
     *
     * @return the IWorkbookFunctionsWeibull_DistRequest instance
     */
    IWorkbookFunctionsWeibull_DistRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsWeibull_DistRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsWeibull_DistRequest instance
     */
    IWorkbookFunctionsWeibull_DistRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
