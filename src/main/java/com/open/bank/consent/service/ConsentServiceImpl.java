package com.open.bank.consent.service;

import com.open.bank.consent.dto.CData;
import com.open.bank.consent.dto.OBReadConsent;
import com.open.bank.consent.dto.OBReadConsentResponse;
import com.open.bank.consent.entity.ConsentData;
import com.open.bank.consent.entity.ConsentPermissions;
import com.open.bank.consent.repository.ConsentDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional
public class ConsentServiceImpl {

    @Autowired
    private ConsentDataRepo consentDataRepo;

    public OBReadConsentResponse getConesntById(String consentId) {
        OBReadConsentResponse consentResponse = new OBReadConsentResponse();
        ConsentData consentData = consentDataRepo.findByConsentId(consentId);
        mappingToDTO(consentResponse, consentData);

        return consentResponse;

    }

    private void mappingToDTO(OBReadConsentResponse consentResponse, ConsentData consentData) {
        if(null != consentData) {
            CData data= new CData();
            data.setConsentId(consentData.getConsentId());
            data.setCreationDateTime(consentData.getCreationDateTime());
            data.setExpirationDateTime(consentData.getExpirationDateTime());
            data.setStatusUpdateDateTime(consentData.getStatusUpdateDateTime());
            data.setTransactionFromDateTime(consentData.getTransactionFromDateTime());
            data.setTransactionToDateTime(consentData.getTransactionToDateTime());
            List<ConsentPermissions> permissions = consentData.getPermissions();
            if(null!= permissions){
                List<String> permissionList = permissions.stream().map(p -> p.getpName()).collect(Collectors.toList());
                data.setPermissions(permissionList);
            }
            consentResponse.setData(data);
        }
    }


    public OBReadConsentResponse saveConsent(OBReadConsent  obReadConsent) {
        OBReadConsentResponse consentResponse = new OBReadConsentResponse();
        ConsentData consentData = new ConsentData();
        CData data = obReadConsent.getData();
        if(null !=data) {
            List<String> permissions = data.getPermissions();
            List<ConsentPermissions> consentPermissions = new ArrayList<>();
            if (null != permissions) {
                permissions.stream().forEach(p -> {
                    ConsentPermissions consentPermissions1 = new ConsentPermissions();
                    consentPermissions1.setpName(p);
                    consentPermissions1.setConsentData(consentData);
                    consentPermissions.add(consentPermissions1);
                });
                consentData.setPermissions(consentPermissions);
            }
            consentData.setConsentId(UUID.randomUUID().toString());
            consentData.setCreationDateTime(new Date());
            consentData.setStatus("Authorized");
            consentData.setStatusUpdateDateTime(new Date());
            ConsentData save = consentDataRepo.save(consentData);
            mappingToDTO(consentResponse, save);
        }

        return consentResponse;

    }

    public void deleteConsent(String consentId){
        ConsentData consentData = consentDataRepo.findByConsentId(consentId);
        if(null != consentData) {
            consentDataRepo.delete(consentData);
        }

    }


}
