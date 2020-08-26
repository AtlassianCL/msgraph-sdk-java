// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEBookInstallSummaryRequest;
import com.microsoft.graph.requests.extensions.EBookInstallSummaryRequest;
import com.microsoft.graph.models.extensions.EBookInstallSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the EBook Install Summary Request.
 */
public class EBookInstallSummaryRequest extends BaseRequest implements IEBookInstallSummaryRequest {
	
    /**
     * The request for the EBookInstallSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EBookInstallSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EBookInstallSummary.class);
    }

    /**
     * Gets the EBookInstallSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<EBookInstallSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EBookInstallSummary from the service
     *
     * @return the EBookInstallSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EBookInstallSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<EBookInstallSummary> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EBookInstallSummary with a source
     *
     * @param sourceEBookInstallSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EBookInstallSummary sourceEBookInstallSummary, final ICallback<EBookInstallSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceEBookInstallSummary);
    }

    /**
     * Patches this EBookInstallSummary with a source
     *
     * @param sourceEBookInstallSummary the source object with updates
     * @return the updated EBookInstallSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EBookInstallSummary patch(final EBookInstallSummary sourceEBookInstallSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceEBookInstallSummary);
    }

    /**
     * Creates a EBookInstallSummary with a new object
     *
     * @param newEBookInstallSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EBookInstallSummary newEBookInstallSummary, final ICallback<EBookInstallSummary> callback) {
        send(HttpMethod.POST, callback, newEBookInstallSummary);
    }

    /**
     * Creates a EBookInstallSummary with a new object
     *
     * @param newEBookInstallSummary the new object to create
     * @return the created EBookInstallSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EBookInstallSummary post(final EBookInstallSummary newEBookInstallSummary) throws ClientException {
        return send(HttpMethod.POST, newEBookInstallSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEBookInstallSummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EBookInstallSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEBookInstallSummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EBookInstallSummaryRequest)this;
     }

}

