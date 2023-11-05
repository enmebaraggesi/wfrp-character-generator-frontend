package com.warhammer.wfrpfrontend.dto.name;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Name {
    
    @JsonProperty("title")
    String title;
    
    @JsonProperty("first")
    String first;
    
    @JsonProperty("last")
    String last;
}
