// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AttachmentCreateUploadSessionBody;
import com.microsoft.graph.models.extensions.UploadSession;
import com.microsoft.graph.requests.extensions.IAttachmentCreateUploadSessionRequest;
import com.microsoft.graph.requests.extensions.AttachmentCreateUploadSessionRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attachment Create Upload Session Request.
 */
public class AttachmentCreateUploadSessionRequest extends BaseRequest implements IAttachmentCreateUploadSessionRequest {
    protected final AttachmentCreateUploadSessionBody body;

    /**
     * The request for this AttachmentCreateUploadSession
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AttachmentCreateUploadSessionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UploadSession.class);
        body = new AttachmentCreateUploadSessionBody();
    }

    public void post(final ICallback<UploadSession> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public UploadSession post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAttachmentCreateUploadSessionRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AttachmentCreateUploadSessionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAttachmentCreateUploadSessionRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (AttachmentCreateUploadSessionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAttachmentCreateUploadSessionRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AttachmentCreateUploadSessionRequest)this;
    }

}
