package com.open.bank.consent.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class OBReadConsent implements Serializable {

    @JsonProperty("Data")
    private CData data;

    @JsonProperty("Risk")
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
