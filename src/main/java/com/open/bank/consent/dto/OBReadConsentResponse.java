package com.open.bank.consent.dto;

import java.io.Serializable;

public class OBReadConsentResponse implements Serializable {

    private CData data;

    private CRisk risk;

    private CMeta meta;

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

    public CMeta getMeta() {
        return meta;
    }

    public void setMeta(CMeta meta) {
        this.meta = meta;
    }
}
