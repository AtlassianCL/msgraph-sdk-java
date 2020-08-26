// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityUserCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsUserActivityUserCountsRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Teams User Activity User Counts Request Builder.
 */
public class ReportRootGetTeamsUserActivityUserCountsRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetTeamsUserActivityUserCountsRequestBuilder {

    /**
     * The request builder for this ReportRootGetTeamsUserActivityUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetTeamsUserActivityUserCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetTeamsUserActivityUserCountsRequest
     *
     * @return the IReportRootGetTeamsUserActivityUserCountsRequest instance
     */
    public IReportRootGetTeamsUserActivityUserCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetTeamsUserActivityUserCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetTeamsUserActivityUserCountsRequest instance
     */
    public IReportRootGetTeamsUserActivityUserCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetTeamsUserActivityUserCountsRequest request = new ReportRootGetTeamsUserActivityUserCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
