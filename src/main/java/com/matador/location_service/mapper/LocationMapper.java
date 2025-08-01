package com.matador.location_service.mapper;


import com.matador.location_service.dto.RequestLocationDto;
import com.matador.location_service.dto.ResponseLocationDto;
import com.matador.location_service.entity.LocationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LocationMapper {
   // LocationMapper MAPPER = Mappers.getMapper(LocationMapper.class);
    ResponseLocationDto mapToLocationDto(LocationEntity locationEntity);
   // List<ResponseLocationDto> mapToLocationDtoList(List<LocationEntity> LocationList);
    LocationEntity mapToLocationEntity(RequestLocationDto requestLocationDto);
}
