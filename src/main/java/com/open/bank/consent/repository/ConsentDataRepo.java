package com.open.bank.consent.repository;

import com.open.bank.consent.entity.ConsentData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsentDataRepo extends JpaRepository<ConsentData,String> {

    ConsentData findByConsentId(String consentId);
}
