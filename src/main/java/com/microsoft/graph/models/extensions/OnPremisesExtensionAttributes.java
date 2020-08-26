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


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the On Premises Extension Attributes.
 */
public class OnPremisesExtensionAttributes implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Extension Attribute1.
     * First customizable extension attribute.
     */
    @SerializedName("extensionAttribute1")
    @Expose
    public String extensionAttribute1;

    /**
     * The Extension Attribute2.
     * Second customizable extension attribute.
     */
    @SerializedName("extensionAttribute2")
    @Expose
    public String extensionAttribute2;

    /**
     * The Extension Attribute3.
     * Third customizable extension attribute.
     */
    @SerializedName("extensionAttribute3")
    @Expose
    public String extensionAttribute3;

    /**
     * The Extension Attribute4.
     * Fourth customizable extension attribute.
     */
    @SerializedName("extensionAttribute4")
    @Expose
    public String extensionAttribute4;

    /**
     * The Extension Attribute5.
     * Fifth customizable extension attribute.
     */
    @SerializedName("extensionAttribute5")
    @Expose
    public String extensionAttribute5;

    /**
     * The Extension Attribute6.
     * Sixth customizable extension attribute.
     */
    @SerializedName("extensionAttribute6")
    @Expose
    public String extensionAttribute6;

    /**
     * The Extension Attribute7.
     * Seventh customizable extension attribute.
     */
    @SerializedName("extensionAttribute7")
    @Expose
    public String extensionAttribute7;

    /**
     * The Extension Attribute8.
     * Eighth customizable extension attribute.
     */
    @SerializedName("extensionAttribute8")
    @Expose
    public String extensionAttribute8;

    /**
     * The Extension Attribute9.
     * Ninth customizable extension attribute.
     */
    @SerializedName("extensionAttribute9")
    @Expose
    public String extensionAttribute9;

    /**
     * The Extension Attribute10.
     * Tenth customizable extension attribute.
     */
    @SerializedName("extensionAttribute10")
    @Expose
    public String extensionAttribute10;

    /**
     * The Extension Attribute11.
     * Eleventh customizable extension attribute.
     */
    @SerializedName("extensionAttribute11")
    @Expose
    public String extensionAttribute11;

    /**
     * The Extension Attribute12.
     * Twelfth customizable extension attribute.
     */
    @SerializedName("extensionAttribute12")
    @Expose
    public String extensionAttribute12;

    /**
     * The Extension Attribute13.
     * Thirteenth customizable extension attribute.
     */
    @SerializedName("extensionAttribute13")
    @Expose
    public String extensionAttribute13;

    /**
     * The Extension Attribute14.
     * Fourteenth customizable extension attribute.
     */
    @SerializedName("extensionAttribute14")
    @Expose
    public String extensionAttribute14;

    /**
     * The Extension Attribute15.
     * Fifteenth customizable extension attribute.
     */
    @SerializedName("extensionAttribute15")
    @Expose
    public String extensionAttribute15;


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

    }
}
