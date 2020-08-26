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
 * The class for the Targeted Managed App Policy Assignment Collection Request Builder.
 */
public class TargetedManagedAppPolicyAssignmentCollectionRequestBuilder extends BaseRequestBuilder implements ITargetedManagedAppPolicyAssignmentCollectionRequestBuilder {

    /**
     * The request builder for this collection of WindowsInformationProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TargetedManagedAppPolicyAssignmentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ITargetedManagedAppPolicyAssignmentCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ITargetedManagedAppPolicyAssignmentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TargetedManagedAppPolicyAssignmentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ITargetedManagedAppPolicyAssignmentRequestBuilder byId(final String id) {
        return new TargetedManagedAppPolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
