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
 * The interface for the Base Managed Device Mobile App Configuration Device Summary Request.
 */
public interface IBaseManagedDeviceMobileAppConfigurationDeviceSummaryRequest extends IHttpRequest {

    /**
     * Gets the ManagedDeviceMobileAppConfigurationDeviceSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ManagedDeviceMobileAppConfigurationDeviceSummary> callback);

    /**
     * Gets the ManagedDeviceMobileAppConfigurationDeviceSummary from the service
     *
     * @return the ManagedDeviceMobileAppConfigurationDeviceSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedDeviceMobileAppConfigurationDeviceSummary get() throws ClientException;

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
     * Patches this ManagedDeviceMobileAppConfigurationDeviceSummary with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationDeviceSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedDeviceMobileAppConfigurationDeviceSummary sourceManagedDeviceMobileAppConfigurationDeviceSummary, final ICallback<ManagedDeviceMobileAppConfigurationDeviceSummary> callback);

    /**
     * Patches this ManagedDeviceMobileAppConfigurationDeviceSummary with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationDeviceSummary the source object with updates
     * @return the updated ManagedDeviceMobileAppConfigurationDeviceSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedDeviceMobileAppConfigurationDeviceSummary patch(final ManagedDeviceMobileAppConfigurationDeviceSummary sourceManagedDeviceMobileAppConfigurationDeviceSummary) throws ClientException;

    /**
     * Posts a ManagedDeviceMobileAppConfigurationDeviceSummary with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationDeviceSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedDeviceMobileAppConfigurationDeviceSummary newManagedDeviceMobileAppConfigurationDeviceSummary, final ICallback<ManagedDeviceMobileAppConfigurationDeviceSummary> callback);

    /**
     * Posts a ManagedDeviceMobileAppConfigurationDeviceSummary with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationDeviceSummary the new object to create
     * @return the created ManagedDeviceMobileAppConfigurationDeviceSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedDeviceMobileAppConfigurationDeviceSummary post(final ManagedDeviceMobileAppConfigurationDeviceSummary newManagedDeviceMobileAppConfigurationDeviceSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseManagedDeviceMobileAppConfigurationDeviceSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseManagedDeviceMobileAppConfigurationDeviceSummaryRequest expand(final String value);

}
