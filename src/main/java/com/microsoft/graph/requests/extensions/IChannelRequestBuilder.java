// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IChannelRequest;
import com.microsoft.graph.requests.extensions.IChatMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatMessageRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTabCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTabRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Channel Request Builder.
 */
public interface IChannelRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IChannelRequest instance
     */
    IChannelRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IChannelRequest instance
     */
    IChannelRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IChatMessageCollectionRequestBuilder messages();

    IChatMessageRequestBuilder messages(final String id);

    ITeamsTabCollectionRequestBuilder tabs();

    ITeamsTabRequestBuilder tabs(final String id);

    /**
     * Gets the request builder for DriveItem
     *
     * @return the IDriveItemRequestBuilder instance
     */
    IDriveItemRequestBuilder filesFolder();

}
