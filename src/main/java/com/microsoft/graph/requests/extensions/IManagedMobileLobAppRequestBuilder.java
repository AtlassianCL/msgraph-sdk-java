// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedMobileLobAppRequest;
import com.microsoft.graph.requests.extensions.IMobileAppContentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppContentRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Mobile Lob App Request Builder.
 */
public interface IManagedMobileLobAppRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IManagedMobileLobAppRequest instance
     */
    IManagedMobileLobAppRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IManagedMobileLobAppRequest instance
     */
    IManagedMobileLobAppRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IMobileAppContentCollectionRequestBuilder contentVersions();

    IMobileAppContentRequestBuilder contentVersions(final String id);

}
