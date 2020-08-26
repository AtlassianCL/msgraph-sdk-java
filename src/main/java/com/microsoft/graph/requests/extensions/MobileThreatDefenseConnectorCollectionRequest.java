// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile Threat Defense Connector Collection Request.
 */
public class MobileThreatDefenseConnectorCollectionRequest extends BaseCollectionRequest<MobileThreatDefenseConnectorCollectionResponse, IMobileThreatDefenseConnectorCollectionPage> implements IMobileThreatDefenseConnectorCollectionRequest {

    /**
     * The request builder for this collection of MobileThreatDefenseConnector
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileThreatDefenseConnectorCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileThreatDefenseConnectorCollectionResponse.class, IMobileThreatDefenseConnectorCollectionPage.class);
    }

    public void get(final ICallback<IMobileThreatDefenseConnectorCollectionPage> callback) {
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

    public IMobileThreatDefenseConnectorCollectionPage get() throws ClientException {
        final MobileThreatDefenseConnectorCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final MobileThreatDefenseConnector newMobileThreatDefenseConnector, final ICallback<MobileThreatDefenseConnector> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new MobileThreatDefenseConnectorRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newMobileThreatDefenseConnector, callback);
    }

    public MobileThreatDefenseConnector post(final MobileThreatDefenseConnector newMobileThreatDefenseConnector) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MobileThreatDefenseConnectorRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newMobileThreatDefenseConnector);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMobileThreatDefenseConnectorCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (MobileThreatDefenseConnectorCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMobileThreatDefenseConnectorCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (MobileThreatDefenseConnectorCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IMobileThreatDefenseConnectorCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (MobileThreatDefenseConnectorCollectionRequest)this;
    }

    public IMobileThreatDefenseConnectorCollectionPage buildFromResponse(final MobileThreatDefenseConnectorCollectionResponse response) {
        final IMobileThreatDefenseConnectorCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MobileThreatDefenseConnectorCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final MobileThreatDefenseConnectorCollectionPage page = new MobileThreatDefenseConnectorCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
