package com.matador.location_service.repository;

import com.matador.location_service.entity.LocationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends MongoRepository<LocationEntity,String> {
}
