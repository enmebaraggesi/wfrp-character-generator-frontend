package com.warhammer.wfrpfrontend.dto.name;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NameDto {

    @JsonProperty("results")
    List<ResultDto> results;
}