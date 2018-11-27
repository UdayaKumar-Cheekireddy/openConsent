package com.open.bank.consent.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


public class CMeta implements Serializable {

    @JsonProperty("TotalPages")
    private int totalPages;

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
