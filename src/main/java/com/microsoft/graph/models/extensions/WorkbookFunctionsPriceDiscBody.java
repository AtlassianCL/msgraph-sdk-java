// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Price Disc Body.
 */
public class WorkbookFunctionsPriceDiscBody {

    /**
     * The settlement.
     * 
     */
    @SerializedName("settlement")
    @Expose
    public com.google.gson.JsonElement settlement;

    /**
     * The maturity.
     * 
     */
    @SerializedName("maturity")
    @Expose
    public com.google.gson.JsonElement maturity;

    /**
     * The discount.
     * 
     */
    @SerializedName("discount")
    @Expose
    public com.google.gson.JsonElement discount;

    /**
     * The redemption.
     * 
     */
    @SerializedName("redemption")
    @Expose
    public com.google.gson.JsonElement redemption;

    /**
     * The basis.
     * 
     */
    @SerializedName("basis")
    @Expose
    public com.google.gson.JsonElement basis;


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
