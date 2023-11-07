package com.warhammer.wfrpfrontend.mapper;

import com.warhammer.wfrpfrontend.dto.character.SheetNamesDto;
import com.warhammer.wfrpfrontend.dto.character.CharacterSheetDto;
import com.warhammer.wfrpfrontend.model.CharacterSheet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterSheetMapper {
    
    public CharacterSheetDto mapCharacterSheetToCharacterSheetDto(CharacterSheet characterSheet) {
        return new CharacterSheetDto(characterSheet.getCharacterName(),
                                     characterSheet.getSheetCharacteristics().name(),
                                     characterSheet.getSheetCharacteristics().race(),
                                     characterSheet.getSheetCharacteristics().eyes(),
                                     characterSheet.getSheetCharacteristics().hair(),
                                     characterSheet.getSheetCharacteristics().profession(),
                                     characterSheet.getSheetCharacteristics().age(),
                                     characterSheet.getSheetCharacteristics().height(),
                                     characterSheet.getSheetTables().sheetAttributes(),
                                     characterSheet.getSheetTables().sheetPoints(),
                                     characterSheet.getSheetTables().sheetBasicSkills(),
                                     characterSheet.getSheetTables().sheetAdvancedSkills(),
                                     characterSheet.getSheetTables().sheetTalents(),
                                     characterSheet.getSheetTables().sheetInventory(),
                                     characterSheet.getSheetTables().sheetWeapons(),
                                     characterSheet.getSheetTables().sheetArmors());
    }
    
    public List<String> mapCharacterSheetsNamesToNamesList(SheetNamesDto characterSheetsNames) {
        return characterSheetsNames.sheetNames();
    }
}
