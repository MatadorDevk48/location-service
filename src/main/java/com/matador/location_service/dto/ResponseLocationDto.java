package com.matador.location_service.dto;

import com.matador.location_service.feignClient.PackageClient;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseLocationDto {

    private String locationId;
    private String city;
    private String zone;
    private boolean checkpointAvailable;
    private List<ResponsePackageDto> packageDto;
}