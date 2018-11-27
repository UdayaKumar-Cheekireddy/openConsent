package com.open.bank.consent.repository;

import com.open.bank.consent.entity.ConsentPermissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsentPermissionsRepo extends JpaRepository<ConsentPermissions,Integer> {
    
}
