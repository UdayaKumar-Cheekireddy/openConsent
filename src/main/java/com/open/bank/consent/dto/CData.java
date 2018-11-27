package com.open.bank.consent.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class CData implements Serializable {

    private String consentId;

    private String status;

    private Date statusUpdateDateTime;

    private Date creationDateTime;

    private Date expirationDateTime;

    private Date transactionFromDateTime;

    private Date transactionToDateTime;

    private List<String> permissions;

    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(Date statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public Date getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public Date getExpirationDateTime() {
        return expirationDateTime;
    }

    public void setExpirationDateTime(Date expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }

    public Date getTransactionFromDateTime() {
        return transactionFromDateTime;
    }

    public void setTransactionFromDateTime(Date transactionFromDateTime) {
        this.transactionFromDateTime = transactionFromDateTime;
    }

    public Date getTransactionToDateTime() {
        return transactionToDateTime;
    }

    public void setTransactionToDateTime(Date transactionToDateTime) {
        this.transactionToDateTime = transactionToDateTime;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
}
