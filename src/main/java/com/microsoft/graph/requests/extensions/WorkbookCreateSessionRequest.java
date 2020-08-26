// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookCreateSessionBody;
import com.microsoft.graph.models.extensions.WorkbookSessionInfo;
import com.microsoft.graph.requests.extensions.IWorkbookCreateSessionRequest;
import com.microsoft.graph.requests.extensions.WorkbookCreateSessionRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Create Session Request.
 */
public class WorkbookCreateSessionRequest extends BaseRequest implements IWorkbookCreateSessionRequest {
    protected final WorkbookCreateSessionBody body;

    /**
     * The request for this WorkbookCreateSession
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookCreateSessionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookSessionInfo.class);
        body = new WorkbookCreateSessionBody();
    }

    public void post(final ICallback<WorkbookSessionInfo> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public WorkbookSessionInfo post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookCreateSessionRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WorkbookCreateSessionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWorkbookCreateSessionRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (WorkbookCreateSessionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookCreateSessionRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookCreateSessionRequest)this;
    }

}
