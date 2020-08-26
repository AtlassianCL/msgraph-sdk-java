// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITeamCloneRequest;
import com.microsoft.graph.requests.extensions.TeamCloneRequest;
import com.microsoft.graph.models.generated.TeamVisibilityType;
import com.microsoft.graph.models.generated.ClonableTeamParts;
import java.util.EnumSet;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Clone Request Builder.
 */
public class TeamCloneRequestBuilder extends BaseActionRequestBuilder implements ITeamCloneRequestBuilder {

    /**
     * The request builder for this TeamClone
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param displayName the displayName
     * @param description the description
     * @param mailNickname the mailNickname
     * @param classification the classification
     * @param visibility the visibility
     * @param partsToClone the partsToClone
     */
    public TeamCloneRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String displayName, final String description, final String mailNickname, final String classification, final TeamVisibilityType visibility, final EnumSet<ClonableTeamParts> partsToClone) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("displayName", displayName);
        bodyParams.put("description", description);
        bodyParams.put("mailNickname", mailNickname);
        bodyParams.put("classification", classification);
        bodyParams.put("visibility", visibility);
        bodyParams.put("partsToClone", partsToClone);
    }

    /**
     * Creates the ITeamCloneRequest
     *
     * @return the ITeamCloneRequest instance
     */
    public ITeamCloneRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the ITeamCloneRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ITeamCloneRequest instance
     */
    public ITeamCloneRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        TeamCloneRequest request = new TeamCloneRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("displayName")) {
            request.body.displayName = getParameter("displayName");
        }

        if (hasParameter("description")) {
            request.body.description = getParameter("description");
        }

        if (hasParameter("mailNickname")) {
            request.body.mailNickname = getParameter("mailNickname");
        }

        if (hasParameter("classification")) {
            request.body.classification = getParameter("classification");
        }

        if (hasParameter("visibility")) {
            request.body.visibility = getParameter("visibility");
        }

        if (hasParameter("partsToClone")) {
            request.body.partsToClone = getParameter("partsToClone");
        }

        return request;
    }
}
