// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Mobile App Category Request.
 */
public interface IBaseMobileAppCategoryRequest extends IHttpRequest {

    /**
     * Gets the MobileAppCategory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MobileAppCategory> callback);

    /**
     * Gets the MobileAppCategory from the service
     *
     * @return the MobileAppCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppCategory get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MobileAppCategory with a source
     *
     * @param sourceMobileAppCategory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MobileAppCategory sourceMobileAppCategory, final ICallback<MobileAppCategory> callback);

    /**
     * Patches this MobileAppCategory with a source
     *
     * @param sourceMobileAppCategory the source object with updates
     * @return the updated MobileAppCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppCategory patch(final MobileAppCategory sourceMobileAppCategory) throws ClientException;

    /**
     * Posts a MobileAppCategory with a new object
     *
     * @param newMobileAppCategory the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MobileAppCategory newMobileAppCategory, final ICallback<MobileAppCategory> callback);

    /**
     * Posts a MobileAppCategory with a new object
     *
     * @param newMobileAppCategory the new object to create
     * @return the created MobileAppCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppCategory post(final MobileAppCategory newMobileAppCategory) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseMobileAppCategoryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseMobileAppCategoryRequest expand(final String value);

}
