package com.warhammer.wfrpfrontend.dto.character;

import java.util.Set;

public record CharacterSheetDto(String characterName,
                                String name,
                                String race,
                                String eyes,
                                String hair,
                                String profession,
                                String age,
                                String height,
                                SheetAttributes sheetAttributes,
                                SheetPoints sheetPoints,
                                SheetBasicSkills sheetBasicSkills,
                                SheetAdvancedSkills sheetAdvancedSkills,
                                SheetTalents sheetTalents,
                                SheetInventory sheetInventory,
                                Set<String> armorsNames,
                                Set<String> weaponsNames) {
    
}
