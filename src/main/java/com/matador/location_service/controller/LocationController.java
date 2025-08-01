package com.matador.location_service.controller;


import com.matador.location_service.dto.RequestLocationDto;
import com.matador.location_service.dto.ResponseLocationDto;
import com.matador.location_service.dto.ResponsePackageDto;
import com.matador.location_service.entity.LocationEntity;
import com.matador.location_service.feignClient.PackageClient;
import com.matador.location_service.mapper.LocationMapper;
import com.matador.location_service.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/locations")
public class LocationController {

    private final LocationService locationService;
    private final LocationMapper locationMapper;
    private final PackageClient packageClient;

    @PostMapping
    public ResponseEntity<ResponseLocationDto> createLocation(@RequestBody RequestLocationDto requestLocationDto){
        LocationEntity locationEntity = locationMapper.mapToLocationEntity(requestLocationDto);
        ResponseLocationDto responseLocationDto = locationMapper.mapToLocationDto(locationService.createLocation(locationEntity));
        return ResponseEntity.ok(responseLocationDto);
    }

    @GetMapping
    public  ResponseEntity<List<ResponseLocationDto>> getAllLocation(){
        List<LocationEntity> locationEntities = locationService.getAllLocation();

        List<ResponseLocationDto> responseLocationDtoList = locationEntities.stream().map(locationEntity->{
            ResponseLocationDto responseLocationDto = locationMapper.mapToLocationDto(locationEntity);
            List<ResponsePackageDto> packageDtoList = packageClient.findByLocationId(locationEntity.getLocationId());
            responseLocationDto.setPackageDto(packageDtoList);
            return responseLocationDto;
        }).toList();
        return ResponseEntity.ok(responseLocationDtoList);

//        List<ResponseLocationDto> responseLocationDtoList = locationMapper.mapToLocationDtoList(locationService.getAllLocation());
//        return ResponseEntity.ok(responseLocationDtoList);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ResponseLocationDto> getLocationById(@PathVariable("id") String locationId){
        LocationEntity locationEntity = locationService.getLocationById(locationId);
        List<ResponsePackageDto> packageDto = packageClient.findByLocationId(locationId);
        ResponseLocationDto responseLocationDto = locationMapper.mapToLocationDto(locationEntity);
        responseLocationDto.setPackageDto(packageDto);
        return ResponseEntity.ok(responseLocationDto);
    }





}
