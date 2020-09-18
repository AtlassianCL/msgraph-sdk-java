// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ComplianceState;
import com.microsoft.graph.models.extensions.ConfigurationManagerClientEnabledFeatures;
import com.microsoft.graph.models.extensions.DeviceActionResult;
import com.microsoft.graph.models.generated.DeviceEnrollmentType;
import com.microsoft.graph.models.extensions.DeviceHealthAttestationState;
import com.microsoft.graph.models.generated.DeviceRegistrationState;
import com.microsoft.graph.models.generated.DeviceManagementExchangeAccessState;
import com.microsoft.graph.models.generated.DeviceManagementExchangeAccessStateReason;
import com.microsoft.graph.models.generated.ManagedDeviceOwnerType;
import com.microsoft.graph.models.generated.ManagementAgentType;
import com.microsoft.graph.models.generated.ManagedDevicePartnerReportedHealthState;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyState;
import com.microsoft.graph.models.extensions.DeviceConfigurationState;
import com.microsoft.graph.models.extensions.DeviceCategory;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyStateCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyStateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device.
 */
public class ManagedDevice extends Entity implements IJsonBackedObject {


    /**
     * The Activation Lock Bypass Code.
     * Code that allows the Activation Lock on a device to be bypassed.
     */
    @SerializedName("activationLockBypassCode")
    @Expose
    public String activationLockBypassCode;

    /**
     * The Android Security Patch Level.
     * Android security patch level
     */
    @SerializedName("androidSecurityPatchLevel")
    @Expose
    public String androidSecurityPatchLevel;

    /**
     * The Azure ADDevice Id.
     * The unique identifier for the Azure Active Directory device. Read only.
     */
    @SerializedName("azureADDeviceId")
    @Expose
    public String azureADDeviceId;

    /**
     * The Azure ADRegistered.
     * Whether the device is Azure Active Directory registered.
     */
    @SerializedName("azureADRegistered")
    @Expose
    public Boolean azureADRegistered;

    /**
     * The Compliance Grace Period Expiration Date Time.
     * The DateTime when device compliance grace period expires
     */
    @SerializedName("complianceGracePeriodExpirationDateTime")
    @Expose
    public java.util.Calendar complianceGracePeriodExpirationDateTime;

    /**
     * The Compliance State.
     * Compliance state of the device. Possible values are: unknown, compliant, noncompliant, conflict, error, inGracePeriod, configManager.
     */
    @SerializedName("complianceState")
    @Expose
    public ComplianceState complianceState;

    /**
     * The Configuration Manager Client Enabled Features.
     * ConfigrMgr client enabled features
     */
    @SerializedName("configurationManagerClientEnabledFeatures")
    @Expose
    public ConfigurationManagerClientEnabledFeatures configurationManagerClientEnabledFeatures;

    /**
     * The Device Action Results.
     * List of ComplexType deviceActionResult objects.
     */
    @SerializedName("deviceActionResults")
    @Expose
    public java.util.List<DeviceActionResult> deviceActionResults;

    /**
     * The Device Category Display Name.
     * Device category display name
     */
    @SerializedName("deviceCategoryDisplayName")
    @Expose
    public String deviceCategoryDisplayName;

    /**
     * The Device Enrollment Type.
     * Enrollment type of the device. Possible values are: unknown, userEnrollment, deviceEnrollmentManager, appleBulkWithUser, appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment, windowsBulkAzureDomainJoin, windowsCoManagement.
     */
    @SerializedName("deviceEnrollmentType")
    @Expose
    public DeviceEnrollmentType deviceEnrollmentType;

    /**
     * The Device Health Attestation State.
     * The device health attestation state.
     */
    @SerializedName("deviceHealthAttestationState")
    @Expose
    public DeviceHealthAttestationState deviceHealthAttestationState;

    /**
     * The Device Name.
     * Name of the device
     */
    @SerializedName("deviceName")
    @Expose
    public String deviceName;

    /**
     * The Device Registration State.
     * Device registration state. Possible values are: notRegistered, registered, revoked, keyConflict, approvalPending, certificateReset, notRegisteredPendingEnrollment, unknown.
     */
    @SerializedName("deviceRegistrationState")
    @Expose
    public DeviceRegistrationState deviceRegistrationState;

    /**
     * The Eas Activated.
     * Whether the device is Exchange ActiveSync activated.
     */
    @SerializedName("easActivated")
    @Expose
    public Boolean easActivated;

    /**
     * The Eas Activation Date Time.
     * Exchange ActivationSync activation time of the device.
     */
    @SerializedName("easActivationDateTime")
    @Expose
    public java.util.Calendar easActivationDateTime;

    /**
     * The Eas Device Id.
     * Exchange ActiveSync Id of the device.
     */
    @SerializedName("easDeviceId")
    @Expose
    public String easDeviceId;

    /**
     * The Email Address.
     * Email(s) for the user associated with the device
     */
    @SerializedName("emailAddress")
    @Expose
    public String emailAddress;

    /**
     * The Enrolled Date Time.
     * Enrollment time of the device.
     */
    @SerializedName("enrolledDateTime")
    @Expose
    public java.util.Calendar enrolledDateTime;

    /**
     * The Exchange Access State.
     * The Access State of the device in Exchange. Possible values are: none, unknown, allowed, blocked, quarantined.
     */
    @SerializedName("exchangeAccessState")
    @Expose
    public DeviceManagementExchangeAccessState exchangeAccessState;

    /**
     * The Exchange Access State Reason.
     * The reason for the device's access state in Exchange. Possible values are: none, unknown, exchangeGlobalRule, exchangeIndividualRule, exchangeDeviceRule, exchangeUpgrade, exchangeMailboxPolicy, other, compliant, notCompliant, notEnrolled, unknownLocation, mfaRequired, azureADBlockDueToAccessPolicy, compromisedPassword, deviceNotKnownWithManagedApp.
     */
    @SerializedName("exchangeAccessStateReason")
    @Expose
    public DeviceManagementExchangeAccessStateReason exchangeAccessStateReason;

    /**
     * The Exchange Last Successful Sync Date Time.
     * Last time the device contacted Exchange.
     */
    @SerializedName("exchangeLastSuccessfulSyncDateTime")
    @Expose
    public java.util.Calendar exchangeLastSuccessfulSyncDateTime;

    /**
     * The Free Storage Space In Bytes.
     * Free Storage in Bytes
     */
    @SerializedName("freeStorageSpaceInBytes")
    @Expose
    public Long freeStorageSpaceInBytes;

    /**
     * The Imei.
     * IMEI
     */
    @SerializedName("imei")
    @Expose
    public String imei;

    /**
     * The Is Encrypted.
     * Device encryption status
     */
    @SerializedName("isEncrypted")
    @Expose
    public Boolean isEncrypted;

    /**
     * The Is Supervised.
     * Device supervised status
     */
    @SerializedName("isSupervised")
    @Expose
    public Boolean isSupervised;

    /**
     * The Jail Broken.
     * whether the device is jail broken or rooted.
     */
    @SerializedName("jailBroken")
    @Expose
    public String jailBroken;

    /**
     * The Last Sync Date Time.
     * The date and time that the device last completed a successful sync with Intune.
     */
    @SerializedName("lastSyncDateTime")
    @Expose
    public java.util.Calendar lastSyncDateTime;

    /**
     * The Managed Device Name.
     * Automatically generated name to identify a device. Can be overwritten to a user friendly name.
     */
    @SerializedName("managedDeviceName")
    @Expose
    public String managedDeviceName;

    /**
     * The Managed Device Owner Type.
     * Ownership of the device. Can be 'company' or 'personal'. Possible values are: unknown, company, personal.
     */
    @SerializedName("managedDeviceOwnerType")
    @Expose
    public ManagedDeviceOwnerType managedDeviceOwnerType;

    /**
     * The Management Agent.
     * Management channel of the device. Intune, EAS, etc. Possible values are: eas, mdm, easMdm, intuneClient, easIntuneClient, configurationManagerClient, configurationManagerClientMdm, configurationManagerClientMdmEas, unknown, jamf, googleCloudDevicePolicyController.
     */
    @SerializedName("managementAgent")
    @Expose
    public ManagementAgentType managementAgent;

    /**
     * The Manufacturer.
     * Manufacturer of the device
     */
    @SerializedName("manufacturer")
    @Expose
    public String manufacturer;

    /**
     * The Meid.
     * MEID
     */
    @SerializedName("meid")
    @Expose
    public String meid;

    /**
     * The Model.
     * Model of the device
     */
    @SerializedName("model")
    @Expose
    public String model;

    /**
     * The Operating System.
     * Operating system of the device. Windows, iOS, etc.
     */
    @SerializedName("operatingSystem")
    @Expose
    public String operatingSystem;

    /**
     * The Os Version.
     * Operating system version of the device.
     */
    @SerializedName("osVersion")
    @Expose
    public String osVersion;

    /**
     * The Partner Reported Threat State.
     * Indicates the threat state of a device when a Mobile Threat Defense partner is in use by the account and device. Read Only. Possible values are: unknown, activated, deactivated, secured, lowSeverity, mediumSeverity, highSeverity, unresponsive, compromised, misconfigured.
     */
    @SerializedName("partnerReportedThreatState")
    @Expose
    public ManagedDevicePartnerReportedHealthState partnerReportedThreatState;

    /**
     * The Phone Number.
     * Phone number of the device
     */
    @SerializedName("phoneNumber")
    @Expose
    public String phoneNumber;

    /**
     * The Remote Assistance Session Error Details.
     * An error string that identifies issues when creating Remote Assistance session objects.
     */
    @SerializedName("remoteAssistanceSessionErrorDetails")
    @Expose
    public String remoteAssistanceSessionErrorDetails;

    /**
     * The Remote Assistance Session Url.
     * Url that allows a Remote Assistance session to be established with the device.
     */
    @SerializedName("remoteAssistanceSessionUrl")
    @Expose
    public String remoteAssistanceSessionUrl;

    /**
     * The Serial Number.
     * SerialNumber
     */
    @SerializedName("serialNumber")
    @Expose
    public String serialNumber;

    /**
     * The Subscriber Carrier.
     * Subscriber Carrier
     */
    @SerializedName("subscriberCarrier")
    @Expose
    public String subscriberCarrier;

    /**
     * The Total Storage Space In Bytes.
     * Total Storage in Bytes
     */
    @SerializedName("totalStorageSpaceInBytes")
    @Expose
    public Long totalStorageSpaceInBytes;

    /**
     * The User Display Name.
     * User display name
     */
    @SerializedName("userDisplayName")
    @Expose
    public String userDisplayName;

    /**
     * The User Id.
     * Unique Identifier for the user associated with the device
     */
    @SerializedName("userId")
    @Expose
    public String userId;

    /**
     * The User Principal Name.
     * Device user principal name
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Wi Fi Mac Address.
     * Wi-Fi MAC
     */
    @SerializedName("wiFiMacAddress")
    @Expose
    public String wiFiMacAddress;

    /**
     * The Device Compliance Policy States.
     * Device compliance policy states for this device.
     */
    @SerializedName("deviceCompliancePolicyStates")
    @Expose
    public DeviceCompliancePolicyStateCollectionPage deviceCompliancePolicyStates;

    /**
     * The Device Configuration States.
     * Device configuration states for this device.
     */
    @SerializedName("deviceConfigurationStates")
    @Expose
    public DeviceConfigurationStateCollectionPage deviceConfigurationStates;

    /**
     * The Device Category.
     * Device category
     */
    @SerializedName("deviceCategory")
    @Expose
    public DeviceCategory deviceCategory;


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


        if (json.has("deviceCompliancePolicyStates")) {
            final DeviceCompliancePolicyStateCollectionResponse response = new DeviceCompliancePolicyStateCollectionResponse();
            if (json.has("deviceCompliancePolicyStates@odata.nextLink")) {
                response.nextLink = json.get("deviceCompliancePolicyStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceCompliancePolicyStates").toString(), JsonObject[].class);
            final DeviceCompliancePolicyState[] array = new DeviceCompliancePolicyState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceCompliancePolicyState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceCompliancePolicyStates = new DeviceCompliancePolicyStateCollectionPage(response, null);
        }

        if (json.has("deviceConfigurationStates")) {
            final DeviceConfigurationStateCollectionResponse response = new DeviceConfigurationStateCollectionResponse();
            if (json.has("deviceConfigurationStates@odata.nextLink")) {
                response.nextLink = json.get("deviceConfigurationStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceConfigurationStates").toString(), JsonObject[].class);
            final DeviceConfigurationState[] array = new DeviceConfigurationState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceConfigurationState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceConfigurationStates = new DeviceConfigurationStateCollectionPage(response, null);
        }
    }
}
