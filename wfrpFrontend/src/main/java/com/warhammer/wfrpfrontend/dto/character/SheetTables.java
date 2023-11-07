package com.warhammer.wfrpfrontend.dto.character;

import java.util.Set;

public record SheetTables(SheetAttributes sheetAttributes,
                          SheetPoints sheetPoints,
                          SheetBasicSkills sheetBasicSkills,
                          SheetAdvancedSkills sheetAdvancedSkills,
                          SheetTalents sheetTalents,
                          SheetInventory sheetInventory,
                          Set<String> sheetWeapons,
                          Set<String> sheetArmors) {
    
}
