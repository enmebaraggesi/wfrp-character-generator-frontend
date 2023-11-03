package com.warhammer.wfrpfrontend.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record IdDto(@JsonProperty("first") String first,
                    @JsonProperty("last") String last) {
    
}
