package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.client.NameGeneratorClient;
import com.warhammer.wfrpfrontend.dto.IdDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class NamesController {
    
    private final NameGeneratorClient client;
    
    @GetMapping("name")
    public IdDto getName() {
        return client.getGeneratedIdentity();
//        return generatedIdentity.first() + " " + generatedIdentity.last();
    }
}
