package com.api.parkingcontrol.repositories;
import com.api.parkingcontrol.models.ParkingSpotModel;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>{

    boolean existsByLicensePlateCar (String licencePlateCar);
    boolean existsByParkingSpotNumber(String parkinkgSpotNumber);
    boolean existsByApartmentAndBlock(String  apartment, String block);
}


