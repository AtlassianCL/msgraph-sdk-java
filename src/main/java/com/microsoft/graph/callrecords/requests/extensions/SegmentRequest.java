// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.requests.extensions;
import com.microsoft.graph.callrecords.requests.extensions.ISegmentRequest;
import com.microsoft.graph.callrecords.requests.extensions.SegmentRequest;
import com.microsoft.graph.callrecords.models.extensions.Segment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Segment Request.
 */
public class SegmentRequest extends BaseRequest implements ISegmentRequest {
	
    /**
     * The request for the Segment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SegmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Segment.class);
    }

    /**
     * Gets the Segment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Segment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Segment from the service
     *
     * @return the Segment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Segment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Segment> callback) {
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
     * Patches this Segment with a source
     *
     * @param sourceSegment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Segment sourceSegment, final ICallback<Segment> callback) {
        send(HttpMethod.PATCH, callback, sourceSegment);
    }

    /**
     * Patches this Segment with a source
     *
     * @param sourceSegment the source object with updates
     * @return the updated Segment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Segment patch(final Segment sourceSegment) throws ClientException {
        return send(HttpMethod.PATCH, sourceSegment);
    }

    /**
     * Creates a Segment with a new object
     *
     * @param newSegment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Segment newSegment, final ICallback<Segment> callback) {
        send(HttpMethod.POST, callback, newSegment);
    }

    /**
     * Creates a Segment with a new object
     *
     * @param newSegment the new object to create
     * @return the created Segment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Segment post(final Segment newSegment) throws ClientException {
        return send(HttpMethod.POST, newSegment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISegmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SegmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISegmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SegmentRequest)this;
     }

}

