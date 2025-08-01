package com.matador.location_service.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponsePackageDto {
    private long packageId;
    private String description;
    private double weight;
    private boolean fragile;
    private Status status;
    private String locationId;
}
