// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartFillRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartFillClearRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartFillSetSolidColorRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Fill Request Builder.
 */
public interface IWorkbookChartFillRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWorkbookChartFillRequest instance
     */
    IWorkbookChartFillRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartFillRequest instance
     */
    IWorkbookChartFillRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IWorkbookChartFillClearRequestBuilder clear();
    IWorkbookChartFillSetSolidColorRequestBuilder setSolidColor(final String color);

}
