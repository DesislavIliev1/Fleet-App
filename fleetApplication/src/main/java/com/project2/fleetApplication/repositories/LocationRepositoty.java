package com.project2.fleetApplication.repositories;

import com.project2.fleetApplication.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepositoty extends JpaRepository<Location, Integer> {
}
