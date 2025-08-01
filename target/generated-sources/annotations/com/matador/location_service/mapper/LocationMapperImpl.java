package com.matador.location_service.mapper;

import com.matador.location_service.dto.RequestLocationDto;
import com.matador.location_service.dto.ResponseLocationDto;
import com.matador.location_service.entity.LocationEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-30T13:42:54+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.8 (Ubuntu)"
)
@Component
public class LocationMapperImpl implements LocationMapper {

    @Override
    public ResponseLocationDto mapToLocationDto(LocationEntity locationEntity) {
        if ( locationEntity == null ) {
            return null;
        }

        ResponseLocationDto responseLocationDto = new ResponseLocationDto();

        responseLocationDto.setLocationId( locationEntity.getLocationId() );
        responseLocationDto.setCity( locationEntity.getCity() );
        responseLocationDto.setZone( locationEntity.getZone() );
        responseLocationDto.setCheckpointAvailable( locationEntity.isCheckpointAvailable() );

        return responseLocationDto;
    }

    @Override
    public LocationEntity mapToLocationEntity(RequestLocationDto requestLocationDto) {
        if ( requestLocationDto == null ) {
            return null;
        }

        LocationEntity locationEntity = new LocationEntity();

        locationEntity.setCity( requestLocationDto.getCity() );
        locationEntity.setZone( requestLocationDto.getZone() );
        locationEntity.setCheckpointAvailable( requestLocationDto.isCheckpointAvailable() );

        return locationEntity;
    }
}
