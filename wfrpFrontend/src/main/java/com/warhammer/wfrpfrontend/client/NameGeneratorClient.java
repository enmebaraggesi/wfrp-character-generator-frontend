package com.warhammer.wfrpfrontend.client;

import com.warhammer.wfrpfrontend.dto.IdDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
@RequiredArgsConstructor
public class NameGeneratorClient {
    
    private final RestTemplate restTemplate;
    
    @Value("${identity.generator.api.url}")
    private String url;
    
    public IdDto getGeneratedIdentity() {
        URI uri = UriComponentsBuilder.fromHttpUrl(url)
                                      .queryParam("nat", "de")
                                      .queryParam("inc", "name")
                                      .build()
                                      .encode()
                                      .toUri();
        return restTemplate.getForObject(uri, IdDto.class);
    }
}
