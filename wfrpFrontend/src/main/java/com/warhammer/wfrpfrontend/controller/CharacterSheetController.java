package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.model.CharacterSheet;
import com.warhammer.wfrpfrontend.service.CharacterSheetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class CharacterSheetController {
    
    private final CharacterSheetService service;
    
    @GetMapping("sheets")
    public List<String> getAllCharacterSheetNames() {
        return service.getAllCharacterSheetNamesList();
    }
    
    @PostMapping("sheets")
    public void saveCharacterSheet(CharacterSheet characterSheet) {
        service.saveCharacterSheet(characterSheet);
    }
    
    @DeleteMapping("sheets")
    public void deleteCharacterSheetByName(String name) {
        service.deleteCharacterSheetByName(name);
    }
}
