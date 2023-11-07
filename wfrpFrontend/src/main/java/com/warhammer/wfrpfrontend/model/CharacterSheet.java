package com.warhammer.wfrpfrontend.model;

import com.warhammer.wfrpfrontend.dto.character.SheetCharacteristics;
import com.warhammer.wfrpfrontend.dto.character.SheetTables;
import lombok.Data;

@Data
public class CharacterSheet {
    
    private String characterName;
    private SheetCharacteristics sheetCharacteristics;
    private SheetTables sheetTables;
    
    public CharacterSheet(String characterName, SheetCharacteristics sheetCharacteristics, SheetTables sheetTables) {
        this.characterName = characterName;
        this.sheetCharacteristics = sheetCharacteristics;
        this.sheetTables = sheetTables;
    }
}
