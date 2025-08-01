package com.matador.location_service.entity;



import com.matador.location_service.dto.ResponsePackageDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "location-service")
public class LocationEntity {
    @Id
    private String locationId;
    private String city;
    private String zone;
    private boolean checkpointAvailable;
}