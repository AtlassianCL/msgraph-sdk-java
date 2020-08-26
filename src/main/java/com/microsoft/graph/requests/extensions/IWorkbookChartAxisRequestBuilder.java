// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartAxisRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartAxisFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartGridlinesRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartGridlinesRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartAxisTitleRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Axis Request Builder.
 */
public interface IWorkbookChartAxisRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWorkbookChartAxisRequest instance
     */
    IWorkbookChartAxisRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartAxisRequest instance
     */
    IWorkbookChartAxisRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for WorkbookChartAxisFormat
     *
     * @return the IWorkbookChartAxisFormatRequestBuilder instance
     */
    IWorkbookChartAxisFormatRequestBuilder format();

    /**
     * Gets the request builder for WorkbookChartGridlines
     *
     * @return the IWorkbookChartGridlinesRequestBuilder instance
     */
    IWorkbookChartGridlinesRequestBuilder majorGridlines();

    /**
     * Gets the request builder for WorkbookChartGridlines
     *
     * @return the IWorkbookChartGridlinesRequestBuilder instance
     */
    IWorkbookChartGridlinesRequestBuilder minorGridlines();

    /**
     * Gets the request builder for WorkbookChartAxisTitle
     *
     * @return the IWorkbookChartAxisTitleRequestBuilder instance
     */
    IWorkbookChartAxisTitleRequestBuilder title();

}
