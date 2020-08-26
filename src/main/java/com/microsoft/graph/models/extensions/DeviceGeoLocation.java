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
 * The class for the Device Geo Location.
 */
public class DeviceGeoLocation implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Last Collected Date Time.
     * Time at which location was recorded, relative to UTC
     */
    @SerializedName("lastCollectedDateTime")
    @Expose
    public java.util.Calendar lastCollectedDateTime;

    /**
     * The Longitude.
     * Longitude coordinate of the device's location
     */
    @SerializedName("longitude")
    @Expose
    public Double longitude;

    /**
     * The Latitude.
     * Latitude coordinate of the device's location
     */
    @SerializedName("latitude")
    @Expose
    public Double latitude;

    /**
     * The Altitude.
     * Altitude, given in meters above sea level
     */
    @SerializedName("altitude")
    @Expose
    public Double altitude;

    /**
     * The Horizontal Accuracy.
     * Accuracy of longitude and latitude in meters
     */
    @SerializedName("horizontalAccuracy")
    @Expose
    public Double horizontalAccuracy;

    /**
     * The Vertical Accuracy.
     * Accuracy of altitude in meters
     */
    @SerializedName("verticalAccuracy")
    @Expose
    public Double verticalAccuracy;

    /**
     * The Heading.
     * Heading in degrees from true north
     */
    @SerializedName("heading")
    @Expose
    public Double heading;

    /**
     * The Speed.
     * Speed the device is traveling in meters per second
     */
    @SerializedName("speed")
    @Expose
    public Double speed;


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
