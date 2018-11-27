package com.open.bank.consent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "BANK_CONSENT_DATA")
public class ConsentData implements Serializable {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "Id")
//    private int id;

    @Id
    @Column(name = "ConsentId",unique = true,nullable = false)
    private String consentId;

    @Column(name="StatusVal")
    private String status;

    @Column(name="StatusUpdateDateTime")
    private Date statusUpdateDateTime;

    @Column(name="CreationDateTime")
    private Date creationDateTime;

    @Column(name="ExpirationDateTime")
    private Date expirationDateTime;

    @Column(name="TransactionFromDateTime")
    private Date transactionFromDateTime;

    @Column(name="TransactionToDateTime")
    private Date transactionToDateTime;

    @OneToMany(mappedBy = "consentData",cascade = CascadeType.ALL)
    private List<ConsentPermissions> permissions;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

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

    public List<ConsentPermissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<ConsentPermissions> permissions) {
        this.permissions = permissions;
    }
}
