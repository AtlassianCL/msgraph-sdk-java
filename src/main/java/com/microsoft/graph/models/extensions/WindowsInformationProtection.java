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
import com.microsoft.graph.models.generated.WindowsInformationProtectionEnforcementLevel;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionResourceCollection;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionDataRecoveryCertificate;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionApp;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionProxiedDomainCollection;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionIPRangeCollection;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionAppLockerFile;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.models.extensions.ManagedAppPolicy;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLockerFileCollectionResponse;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLockerFileCollectionPage;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection.
 */
public class WindowsInformationProtection extends ManagedAppPolicy implements IJsonBackedObject {


    /**
     * The Enforcement Level.
     * WIP enforcement level.See the Enum definition for supported values. Possible values are: noProtection, encryptAndAuditOnly, encryptAuditAndPrompt, encryptAuditAndBlock.
     */
    @SerializedName("enforcementLevel")
    @Expose
    public WindowsInformationProtectionEnforcementLevel enforcementLevel;

    /**
     * The Enterprise Domain.
     * Primary enterprise domain
     */
    @SerializedName("enterpriseDomain")
    @Expose
    public String enterpriseDomain;

    /**
     * The Enterprise Protected Domain Names.
     * List of enterprise domains to be protected
     */
    @SerializedName("enterpriseProtectedDomainNames")
    @Expose
    public java.util.List<WindowsInformationProtectionResourceCollection> enterpriseProtectedDomainNames;

    /**
     * The Protection Under Lock Config Required.
     * Specifies whether the protection under lock feature (also known as encrypt under pin) should be configured
     */
    @SerializedName("protectionUnderLockConfigRequired")
    @Expose
    public Boolean protectionUnderLockConfigRequired;

    /**
     * The Data Recovery Certificate.
     * Specifies a recovery certificate that can be used for data recovery of encrypted files. This is the same as the data recovery agent(DRA) certificate for encrypting file system(EFS)
     */
    @SerializedName("dataRecoveryCertificate")
    @Expose
    public WindowsInformationProtectionDataRecoveryCertificate dataRecoveryCertificate;

    /**
     * The Revoke On Unenroll Disabled.
     * This policy controls whether to revoke the WIP keys when a device unenrolls from the management service. If set to 1 (Don't revoke keys), the keys will not be revoked and the user will continue to have access to protected files after unenrollment. If the keys are not revoked, there will be no revoked file cleanup subsequently.
     */
    @SerializedName("revokeOnUnenrollDisabled")
    @Expose
    public Boolean revokeOnUnenrollDisabled;

    /**
     * The Rights Management Services Template Id.
     * TemplateID GUID to use for RMS encryption. The RMS template allows the IT admin to configure the details about who has access to RMS-protected file and how long they have access
     */
    @SerializedName("rightsManagementServicesTemplateId")
    @Expose
    public java.util.UUID rightsManagementServicesTemplateId;

    /**
     * The Azure Rights Management Services Allowed.
     * Specifies whether to allow Azure RMS encryption for WIP
     */
    @SerializedName("azureRightsManagementServicesAllowed")
    @Expose
    public Boolean azureRightsManagementServicesAllowed;

    /**
     * The Icons Visible.
     * Determines whether overlays are added to icons for WIP protected files in Explorer and enterprise only app tiles in the Start menu. Starting in Windows 10, version 1703 this setting also configures the visibility of the WIP icon in the title bar of a WIP-protected app
     */
    @SerializedName("iconsVisible")
    @Expose
    public Boolean iconsVisible;

    /**
     * The Protected Apps.
     * Protected applications can access enterprise data and the data handled by those applications are protected with encryption
     */
    @SerializedName("protectedApps")
    @Expose
    public java.util.List<WindowsInformationProtectionApp> protectedApps;

    /**
     * The Exempt Apps.
     * Exempt applications can also access enterprise data, but the data handled by those applications are not protected. This is because some critical enterprise applications may have compatibility problems with encrypted data.
     */
    @SerializedName("exemptApps")
    @Expose
    public java.util.List<WindowsInformationProtectionApp> exemptApps;

    /**
     * The Enterprise Network Domain Names.
     * This is the list of domains that comprise the boundaries of the enterprise. Data from one of these domains that is sent to a device will be considered enterprise data and protected These locations will be considered a safe destination for enterprise data to be shared to
     */
    @SerializedName("enterpriseNetworkDomainNames")
    @Expose
    public java.util.List<WindowsInformationProtectionResourceCollection> enterpriseNetworkDomainNames;

    /**
     * The Enterprise Proxied Domains.
     * Contains a list of Enterprise resource domains hosted in the cloud that need to be protected. Connections to these resources are considered enterprise data. If a proxy is paired with a cloud resource, traffic to the cloud resource will be routed through the enterprise network via the denoted proxy server (on Port 80). A proxy server used for this purpose must also be configured using the EnterpriseInternalProxyServers policy
     */
    @SerializedName("enterpriseProxiedDomains")
    @Expose
    public java.util.List<WindowsInformationProtectionProxiedDomainCollection> enterpriseProxiedDomains;

    /**
     * The Enterprise IPRanges.
     * Sets the enterprise IP ranges that define the computers in the enterprise network. Data that comes from those computers will be considered part of the enterprise and protected. These locations will be considered a safe destination for enterprise data to be shared to
     */
    @SerializedName("enterpriseIPRanges")
    @Expose
    public java.util.List<WindowsInformationProtectionIPRangeCollection> enterpriseIPRanges;

    /**
     * The Enterprise IPRanges Are Authoritative.
     * Boolean value that tells the client to accept the configured list and not to use heuristics to attempt to find other subnets. Default is false
     */
    @SerializedName("enterpriseIPRangesAreAuthoritative")
    @Expose
    public Boolean enterpriseIPRangesAreAuthoritative;

    /**
     * The Enterprise Proxy Servers.
     * This is a list of proxy servers. Any server not on this list is considered non-enterprise
     */
    @SerializedName("enterpriseProxyServers")
    @Expose
    public java.util.List<WindowsInformationProtectionResourceCollection> enterpriseProxyServers;

    /**
     * The Enterprise Internal Proxy Servers.
     * This is the comma-separated list of internal proxy servers. For example, '157.54.14.28, 157.54.11.118, 10.202.14.167, 157.53.14.163, 157.69.210.59'. These proxies have been configured by the admin to connect to specific resources on the Internet. They are considered to be enterprise network locations. The proxies are only leveraged in configuring the EnterpriseProxiedDomains policy to force traffic to the matched domains through these proxies
     */
    @SerializedName("enterpriseInternalProxyServers")
    @Expose
    public java.util.List<WindowsInformationProtectionResourceCollection> enterpriseInternalProxyServers;

    /**
     * The Enterprise Proxy Servers Are Authoritative.
     * Boolean value that tells the client to accept the configured list of proxies and not try to detect other work proxies. Default is false
     */
    @SerializedName("enterpriseProxyServersAreAuthoritative")
    @Expose
    public Boolean enterpriseProxyServersAreAuthoritative;

    /**
     * The Neutral Domain Resources.
     * List of domain names that can used for work or personal resource
     */
    @SerializedName("neutralDomainResources")
    @Expose
    public java.util.List<WindowsInformationProtectionResourceCollection> neutralDomainResources;

    /**
     * The Indexing Encrypted Stores Or Items Blocked.
     * This switch is for the Windows Search Indexer, to allow or disallow indexing of items
     */
    @SerializedName("indexingEncryptedStoresOrItemsBlocked")
    @Expose
    public Boolean indexingEncryptedStoresOrItemsBlocked;

    /**
     * The Smb Auto Encrypted File Extensions.
     * Specifies a list of file extensions, so that files with these extensions are encrypted when copying from an SMB share within the corporate boundary
     */
    @SerializedName("smbAutoEncryptedFileExtensions")
    @Expose
    public java.util.List<WindowsInformationProtectionResourceCollection> smbAutoEncryptedFileExtensions;

    /**
     * The Is Assigned.
     * Indicates if the policy is deployed to any inclusion groups or not.
     */
    @SerializedName("isAssigned")
    @Expose
    public Boolean isAssigned;

    /**
     * The Protected App Locker Files.
     * Another way to input protected apps through xml files
     */
    public WindowsInformationProtectionAppLockerFileCollectionPage protectedAppLockerFiles;

    /**
     * The Exempt App Locker Files.
     * Another way to input exempt apps through xml files
     */
    public WindowsInformationProtectionAppLockerFileCollectionPage exemptAppLockerFiles;

    /**
     * The Assignments.
     * Navigation property to list of security groups targeted for policy.
     */
    public TargetedManagedAppPolicyAssignmentCollectionPage assignments;


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


        if (json.has("protectedAppLockerFiles")) {
            final WindowsInformationProtectionAppLockerFileCollectionResponse response = new WindowsInformationProtectionAppLockerFileCollectionResponse();
            if (json.has("protectedAppLockerFiles@odata.nextLink")) {
                response.nextLink = json.get("protectedAppLockerFiles@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("protectedAppLockerFiles").toString(), JsonObject[].class);
            final WindowsInformationProtectionAppLockerFile[] array = new WindowsInformationProtectionAppLockerFile[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WindowsInformationProtectionAppLockerFile.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            protectedAppLockerFiles = new WindowsInformationProtectionAppLockerFileCollectionPage(response, null);
        }

        if (json.has("exemptAppLockerFiles")) {
            final WindowsInformationProtectionAppLockerFileCollectionResponse response = new WindowsInformationProtectionAppLockerFileCollectionResponse();
            if (json.has("exemptAppLockerFiles@odata.nextLink")) {
                response.nextLink = json.get("exemptAppLockerFiles@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("exemptAppLockerFiles").toString(), JsonObject[].class);
            final WindowsInformationProtectionAppLockerFile[] array = new WindowsInformationProtectionAppLockerFile[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WindowsInformationProtectionAppLockerFile.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            exemptAppLockerFiles = new WindowsInformationProtectionAppLockerFileCollectionPage(response, null);
        }

        if (json.has("assignments")) {
            final TargetedManagedAppPolicyAssignmentCollectionResponse response = new TargetedManagedAppPolicyAssignmentCollectionResponse();
            if (json.has("assignments@odata.nextLink")) {
                response.nextLink = json.get("assignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("assignments").toString(), JsonObject[].class);
            final TargetedManagedAppPolicyAssignment[] array = new TargetedManagedAppPolicyAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TargetedManagedAppPolicyAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            assignments = new TargetedManagedAppPolicyAssignmentCollectionPage(response, null);
        }
    }
}
