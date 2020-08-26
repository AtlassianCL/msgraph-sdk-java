// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsT_DistRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions T_Dist Request Builder.
 */
public interface IWorkbookFunctionsT_DistRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsT_DistRequest
     *
     * @return the IWorkbookFunctionsT_DistRequest instance
     */
    IWorkbookFunctionsT_DistRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsT_DistRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsT_DistRequest instance
     */
    IWorkbookFunctionsT_DistRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
