package com.amazon.mas.kiwi.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SignatureInfo {
    private static final String VALIDITY_REQUIREMENTS_FOR_CREATING_KEYSTORE;
    private static final String VALIDITY_REQUIREMENTS_FOR_RETRIEVING_KEYSTORE;
    private String certificateId;
    private String commonName;
    private String developerId;
    private String developerName;

    static {
        Class<SignatureInfo> cls = SignatureInfo.class;
        Class<SignatureInfo> cls2 = SignatureInfo.class;
        VALIDITY_REQUIREMENTS_FOR_CREATING_KEYSTORE = String.format("A valid instance of %s is required to have at least one non-blank ID, either developerId or certificateId, and at least one non-blank name, either developerName or commonName.", new Object[]{cls.getSimpleName()});
        Class<SignatureInfo> cls3 = SignatureInfo.class;
        VALIDITY_REQUIREMENTS_FOR_RETRIEVING_KEYSTORE = String.format("A valid instance of %s is required to have a certificate ID.", new Object[]{cls.getSimpleName()});
    }

    public static String getValidityRequirementsForCreatingKeystore() {
        return VALIDITY_REQUIREMENTS_FOR_CREATING_KEYSTORE;
    }

    public static String getValidityRequirementsForRetrievingKeystore() {
        return VALIDITY_REQUIREMENTS_FOR_RETRIEVING_KEYSTORE;
    }

    public boolean isValidForCreatingKeystore() {
        return !StringUtils.isBlank(getId()) && !StringUtils.isBlank(getName());
    }

    public boolean isValidForRetrievingKeyStore() {
        return !StringUtils.isBlank(getId());
    }

    public String getId() {
        if (StringUtils.isBlank(this.certificateId)) {
            return this.developerId;
        }
        return this.certificateId;
    }

    public String getName() {
        if (StringUtils.isBlank(this.commonName)) {
            return this.developerName;
        }
        return this.commonName;
    }

    public String getDeveloperId() {
        return this.developerId;
    }

    public SignatureInfo withDeveloperId(String id) {
        this.developerId = id;
        return this;
    }

    public void setDeveloperId(String id) {
        this.developerId = id;
    }

    public String getDeveloperName() {
        return this.developerName;
    }

    public SignatureInfo withDeveloperName(String name) {
        this.developerName = name;
        return this;
    }

    public void setDeveloperName(String name) {
        this.developerName = name;
    }

    public String getCertificateId() {
        return this.certificateId;
    }

    public SignatureInfo withCertificateId(String certificateId2) {
        this.certificateId = certificateId2;
        return this;
    }

    public void setCertificateId(String certificateId2) {
        this.certificateId = certificateId2;
    }

    public String getCommonName() {
        return this.commonName;
    }

    public SignatureInfo withCommonName(String commonName2) {
        this.commonName = commonName2;
        return this;
    }

    public void setCommonName(String commonName2) {
        this.commonName = commonName2;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        SignatureInfo rhs = (SignatureInfo) obj;
        return new EqualsBuilder().append(this.certificateId, rhs.certificateId).append(this.commonName, rhs.commonName).append(this.developerId, rhs.developerId).append(this.developerName, rhs.developerName).isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(this.certificateId).append(this.commonName).append(this.developerId).append(this.developerName).toHashCode();
    }
}
