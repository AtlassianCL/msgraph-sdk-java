// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IExtensionRequest;
import com.microsoft.graph.requests.extensions.ExtensionRequest;
import com.microsoft.graph.models.extensions.Extension;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Extension Request.
 */
public class ExtensionRequest extends BaseRequest implements IExtensionRequest {
	
    /**
     * The request for the Extension
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ExtensionRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends Extension> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the Extension
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExtensionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Extension.class);
    }

    /**
     * Gets the Extension from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Extension> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Extension from the service
     *
     * @return the Extension from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Extension get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Extension> callback) {
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
     * Patches this Extension with a source
     *
     * @param sourceExtension the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Extension sourceExtension, final ICallback<Extension> callback) {
        send(HttpMethod.PATCH, callback, sourceExtension);
    }

    /**
     * Patches this Extension with a source
     *
     * @param sourceExtension the source object with updates
     * @return the updated Extension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Extension patch(final Extension sourceExtension) throws ClientException {
        return send(HttpMethod.PATCH, sourceExtension);
    }

    /**
     * Creates a Extension with a new object
     *
     * @param newExtension the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Extension newExtension, final ICallback<Extension> callback) {
        send(HttpMethod.POST, callback, newExtension);
    }

    /**
     * Creates a Extension with a new object
     *
     * @param newExtension the new object to create
     * @return the created Extension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Extension post(final Extension newExtension) throws ClientException {
        return send(HttpMethod.POST, newExtension);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IExtensionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ExtensionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IExtensionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ExtensionRequest)this;
     }

}

