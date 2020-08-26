// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ContentTypeInfo;
import com.microsoft.graph.models.extensions.SharepointIds;
import com.microsoft.graph.models.extensions.ItemAnalytics;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.FieldValueSet;
import com.microsoft.graph.models.extensions.ListItemVersion;
import com.microsoft.graph.models.extensions.BaseItem;
import com.microsoft.graph.requests.extensions.ListItemVersionCollectionResponse;
import com.microsoft.graph.requests.extensions.ListItemVersionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Item.
 */
public class ListItem extends BaseItem implements IJsonBackedObject {


    /**
     * The Content Type.
     * The content type of this list item
     */
    @SerializedName("contentType")
    @Expose
    public ContentTypeInfo contentType;

    /**
     * The Sharepoint Ids.
     * Returns identifiers useful for SharePoint REST compatibility. Read-only.
     */
    @SerializedName("sharepointIds")
    @Expose
    public SharepointIds sharepointIds;

    /**
     * The Analytics.
     * Analytics about the view activities that took place on this item.
     */
    @SerializedName("analytics")
    @Expose
    public ItemAnalytics analytics;

    /**
     * The Drive Item.
     * For document libraries, the driveItem relationship exposes the listItem as a [driveItem][]
     */
    @SerializedName("driveItem")
    @Expose
    public DriveItem driveItem;

    /**
     * The Fields.
     * The values of the columns set on this list item.
     */
    @SerializedName("fields")
    @Expose
    public FieldValueSet fields;

    /**
     * The Versions.
     * The list of previous versions of the list item.
     */
    public ListItemVersionCollectionPage versions;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("versions")) {
            final ListItemVersionCollectionResponse response = new ListItemVersionCollectionResponse();
            if (json.has("versions@odata.nextLink")) {
                response.nextLink = json.get("versions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("versions").toString(), JsonObject[].class);
            final ListItemVersion[] array = new ListItemVersion[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ListItemVersion.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            versions = new ListItemVersionCollectionPage(response, null);
        }
    }
}
