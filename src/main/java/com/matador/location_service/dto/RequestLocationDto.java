package com.matador.location_service.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestLocationDto {

   // @NotNull
    private String city;


    private String zone;

    private boolean checkpointAvailable;


}
