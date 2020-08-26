// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsImAbsRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Im Abs Request Builder.
 */
public interface IWorkbookFunctionsImAbsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsImAbsRequest
     *
     * @return the IWorkbookFunctionsImAbsRequest instance
     */
    IWorkbookFunctionsImAbsRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsImAbsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImAbsRequest instance
     */
    IWorkbookFunctionsImAbsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
