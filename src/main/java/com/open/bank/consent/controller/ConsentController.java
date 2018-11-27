package com.open.bank.consent.controller;

import com.open.bank.consent.dto.OBReadConsent;
import com.open.bank.consent.dto.OBReadConsentResponse;
import com.open.bank.consent.service.ConsentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController("/account-access-consents")
public class ConsentController {

    @Autowired
    private ConsentServiceImpl consentService;

    @GetMapping(value = "/{ConsentId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public OBReadConsentResponse  getConsentById(@PathVariable("ConsentId") String consentId){
        return consentService.getConesntById(consentId);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public OBReadConsentResponse addConsent(@RequestBody OBReadConsent obReadConsent) {
        return consentService.saveConsent(obReadConsent);
    }

    @DeleteMapping(value = "/{ConsentId}")
    public void deleteConsent(@PathVariable("ConsentId") String consentId) {
        consentService.deleteConsent(consentId);
    }
}
