package com.project2.fleetApplication.repositories;

import com.project2.fleetApplication.models.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMaintainceRepository extends JpaRepository<VehicleMaintenance, Integer> {
}
