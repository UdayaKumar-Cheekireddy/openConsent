package com.open.bank.consent.dto;

import java.io.Serializable;

public class OBReadConsent implements Serializable {

    private CData data;

    private CRisk risk;

    public CData getData() {
        return data;
    }

    public void setData(CData data) {
        this.data = data;
    }

    public CRisk getRisk() {
        return risk;
    }

    public void setRisk(CRisk risk) {
        this.risk = risk;
    }
}
