package com.pms.billing_service.repository;

import com.pms.billing_service.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillingRepository extends JpaRepository<Billing, Long> {


}
