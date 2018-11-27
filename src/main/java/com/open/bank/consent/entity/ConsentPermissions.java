package com.open.bank.consent.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BANK_CONSENT_PERM")
public class ConsentPermissions implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PId")
    private int pId;

    @Column(name = "PName",nullable = false)
    private String pName;

    @ManyToOne
    @JoinColumn(name="consentId", nullable=false)
    private ConsentData consentData;


    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public ConsentData getConsentData() {
        return consentData;
    }

    public void setConsentData(ConsentData consentData) {
        this.consentData = consentData;
    }
}
