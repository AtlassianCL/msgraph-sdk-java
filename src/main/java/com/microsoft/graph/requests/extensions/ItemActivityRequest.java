// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IItemActivityRequest;
import com.microsoft.graph.requests.extensions.ItemActivityRequest;
import com.microsoft.graph.models.extensions.ItemActivity;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Activity Request.
 */
public class ItemActivityRequest extends BaseRequest implements IItemActivityRequest {
	
    /**
     * The request for the ItemActivity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemActivityRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemActivity.class);
    }

    /**
     * Gets the ItemActivity from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ItemActivity> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ItemActivity from the service
     *
     * @return the ItemActivity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemActivity get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ItemActivity> callback) {
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
     * Patches this ItemActivity with a source
     *
     * @param sourceItemActivity the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ItemActivity sourceItemActivity, final ICallback<ItemActivity> callback) {
        send(HttpMethod.PATCH, callback, sourceItemActivity);
    }

    /**
     * Patches this ItemActivity with a source
     *
     * @param sourceItemActivity the source object with updates
     * @return the updated ItemActivity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemActivity patch(final ItemActivity sourceItemActivity) throws ClientException {
        return send(HttpMethod.PATCH, sourceItemActivity);
    }

    /**
     * Creates a ItemActivity with a new object
     *
     * @param newItemActivity the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ItemActivity newItemActivity, final ICallback<ItemActivity> callback) {
        send(HttpMethod.POST, callback, newItemActivity);
    }

    /**
     * Creates a ItemActivity with a new object
     *
     * @param newItemActivity the new object to create
     * @return the created ItemActivity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemActivity post(final ItemActivity newItemActivity) throws ClientException {
        return send(HttpMethod.POST, newItemActivity);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IItemActivityRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ItemActivityRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IItemActivityRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ItemActivityRequest)this;
     }

}

