package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.service.TalentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class TalentsController {
    
    private final TalentsService service;
    
    public List<String> getTalentsNames() {
        return service.getTalentNameList();
    }
}
