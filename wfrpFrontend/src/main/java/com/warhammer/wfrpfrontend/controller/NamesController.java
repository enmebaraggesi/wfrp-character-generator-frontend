package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.service.NamesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class NamesController {
    
    private final NamesService service;
    
    @GetMapping("name")
    public String getName() {
        return service.getGeneratedName();
    }
    
    public String getFirstName() {
        return service.getGeneratedFirstName();
    }
}
