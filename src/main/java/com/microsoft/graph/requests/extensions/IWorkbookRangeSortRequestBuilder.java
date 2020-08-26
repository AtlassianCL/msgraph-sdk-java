// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeSortRequest;
import com.microsoft.graph.models.extensions.WorkbookSortField;
import com.microsoft.graph.requests.extensions.IWorkbookRangeSortApplyRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range Sort Request Builder.
 */
public interface IWorkbookRangeSortRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWorkbookRangeSortRequest instance
     */
    IWorkbookRangeSortRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookRangeSortRequest instance
     */
    IWorkbookRangeSortRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IWorkbookRangeSortApplyRequestBuilder apply(final java.util.List<WorkbookSortField> fields, final Boolean matchCase, final Boolean hasHeaders, final String orientation, final String method);

}
