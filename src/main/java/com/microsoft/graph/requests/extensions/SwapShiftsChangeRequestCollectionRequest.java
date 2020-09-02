// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Schedule;
import com.microsoft.graph.models.extensions.SwapShiftsChangeRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ISwapShiftsChangeRequestCollectionPage;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestCollectionResponse;
import com.microsoft.graph.requests.extensions.ISwapShiftsChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISwapShiftsChangeRequestCollectionRequest;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Swap Shifts Change Request Collection Request.
 */
public class SwapShiftsChangeRequestCollectionRequest extends BaseCollectionRequest<SwapShiftsChangeRequestCollectionResponse, ISwapShiftsChangeRequestCollectionPage> implements ISwapShiftsChangeRequestCollectionRequest {

    /**
     * The request builder for this collection of SwapShiftsChangeRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SwapShiftsChangeRequestCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SwapShiftsChangeRequestCollectionResponse.class, ISwapShiftsChangeRequestCollectionPage.class);
    }

    public void get(final ICallback<ISwapShiftsChangeRequestCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ISwapShiftsChangeRequestCollectionPage get() throws ClientException {
        final SwapShiftsChangeRequestCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final SwapShiftsChangeRequest newSwapShiftsChangeRequest, final ICallback<SwapShiftsChangeRequest> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SwapShiftsChangeRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newSwapShiftsChangeRequest, callback);
    }

    public SwapShiftsChangeRequest post(final SwapShiftsChangeRequest newSwapShiftsChangeRequest) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SwapShiftsChangeRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newSwapShiftsChangeRequest);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISwapShiftsChangeRequestCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SwapShiftsChangeRequestCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISwapShiftsChangeRequestCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SwapShiftsChangeRequestCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISwapShiftsChangeRequestCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (SwapShiftsChangeRequestCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ISwapShiftsChangeRequestCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (SwapShiftsChangeRequestCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ISwapShiftsChangeRequestCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ISwapShiftsChangeRequestCollectionRequest)this;
    }
    public ISwapShiftsChangeRequestCollectionPage buildFromResponse(final SwapShiftsChangeRequestCollectionResponse response) {
        final ISwapShiftsChangeRequestCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SwapShiftsChangeRequestCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SwapShiftsChangeRequestCollectionPage page = new SwapShiftsChangeRequestCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
