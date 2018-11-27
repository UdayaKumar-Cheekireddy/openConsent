package com.open.bank.consent.controller;

import com.open.bank.consent.dto.OBReadConsent;
import com.open.bank.consent.dto.OBReadConsentResponse;
import com.open.bank.consent.service.ConsentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/account-access-consents")
public class ConsentController {

    @Autowired
    private ConsentServiceImpl consentService;

    @GetMapping(value = "/{ConsentId}")
    public OBReadConsentResponse  getConsentById(@PathVariable("ConsentId") String consentId){
        return consentService.getConesntById(consentId);
    }

    @PostMapping
    public OBReadConsentResponse addConsent(@RequestBody OBReadConsent obReadConsent) {
        return consentService.saveConsent(obReadConsent);
    }

    @DeleteMapping(value = "/{ConsentId}")
    public void deleteConsent(@PathVariable("ConsentId") String consentId) {
        consentService.deleteConsent(consentId);
    }
}
