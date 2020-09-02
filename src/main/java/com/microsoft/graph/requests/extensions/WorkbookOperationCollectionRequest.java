// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Workbook;
import com.microsoft.graph.models.extensions.WorkbookOperation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IWorkbookOperationCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookOperationCollectionResponse;
import com.microsoft.graph.requests.extensions.IWorkbookOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookOperationCollectionRequest;
import com.microsoft.graph.requests.extensions.WorkbookOperationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Operation Collection Request.
 */
public class WorkbookOperationCollectionRequest extends BaseCollectionRequest<WorkbookOperationCollectionResponse, IWorkbookOperationCollectionPage> implements IWorkbookOperationCollectionRequest {

    /**
     * The request builder for this collection of WorkbookOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookOperationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookOperationCollectionResponse.class, IWorkbookOperationCollectionPage.class);
    }

    public void get(final ICallback<IWorkbookOperationCollectionPage> callback) {
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

    public IWorkbookOperationCollectionPage get() throws ClientException {
        final WorkbookOperationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WorkbookOperation newWorkbookOperation, final ICallback<WorkbookOperation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WorkbookOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWorkbookOperation, callback);
    }

    public WorkbookOperation post(final WorkbookOperation newWorkbookOperation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WorkbookOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWorkbookOperation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookOperationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookOperationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookOperationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WorkbookOperationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWorkbookOperationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (WorkbookOperationCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IWorkbookOperationCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (WorkbookOperationCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IWorkbookOperationCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IWorkbookOperationCollectionRequest)this;
    }
    public IWorkbookOperationCollectionPage buildFromResponse(final WorkbookOperationCollectionResponse response) {
        final IWorkbookOperationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WorkbookOperationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WorkbookOperationCollectionPage page = new WorkbookOperationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
