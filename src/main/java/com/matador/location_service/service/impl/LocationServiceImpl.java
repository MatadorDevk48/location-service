package com.matador.location_service.service.impl;


import com.matador.location_service.entity.LocationEntity;
import com.matador.location_service.repository.LocationRepository;
import com.matador.location_service.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    @Override
    public LocationEntity createLocation(LocationEntity locationEntity) {
        return locationRepository.save(locationEntity);
    }

    @Override
    public List<LocationEntity> getAllLocation() {
        return locationRepository.findAll();
    }

    @Override
    public LocationEntity getLocationById(String locationId) {
        return locationRepository.findById(locationId)
                .orElseThrow(() -> new IllegalArgumentException("Package with Id"+locationId+" Not found.")) ;
    }
}
