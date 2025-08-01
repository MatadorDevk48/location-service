package com.matador.location_service.service;


import com.matador.location_service.entity.LocationEntity;

import java.util.List;

public interface LocationService {
    LocationEntity createLocation(LocationEntity locationEntity);
    List<LocationEntity> getAllLocation();
    LocationEntity getLocationById(String locationId);



}
