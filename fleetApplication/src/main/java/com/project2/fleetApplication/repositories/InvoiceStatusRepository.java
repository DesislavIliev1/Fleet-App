package com.project2.fleetApplication.repositories;

import com.project2.fleetApplication.models.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus,Integer> {
}
