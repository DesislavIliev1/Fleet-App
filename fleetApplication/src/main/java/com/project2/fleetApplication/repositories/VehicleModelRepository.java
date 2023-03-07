package com.project2.fleetApplication.repositories;

import com.project2.fleetApplication.models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel,Integer> {
}
