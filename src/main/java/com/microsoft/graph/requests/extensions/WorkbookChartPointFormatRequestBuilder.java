// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointFormatRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartPointFormatRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartFillRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartFillRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Point Format Request Builder.
 */
public class WorkbookChartPointFormatRequestBuilder extends BaseRequestBuilder implements IWorkbookChartPointFormatRequestBuilder {

    /**
     * The request builder for the WorkbookChartPointFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartPointFormatRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookChartPointFormatRequest instance
     */
    public IWorkbookChartPointFormatRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartPointFormatRequest instance
     */
    public IWorkbookChartPointFormatRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WorkbookChartPointFormatRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookChartFill
     *
     * @return the IWorkbookChartFillRequestBuilder instance
     */
    public IWorkbookChartFillRequestBuilder fill() {
        return new WorkbookChartFillRequestBuilder(getRequestUrlWithAdditionalSegment("fill"), getClient(), null);
    }
}

