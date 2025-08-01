package com.matador.location_service.feignClient;

import com.matador.location_service.dto.ResponsePackageDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "logistics-onboarding",url = "http://localhost:8082")
public interface PackageClient {
    @GetMapping("packages/location/{locationId}")
    List<ResponsePackageDto> findByLocationId(@PathVariable("locationId") String locationId);

}
