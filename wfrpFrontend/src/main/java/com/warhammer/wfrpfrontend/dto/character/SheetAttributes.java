package com.warhammer.wfrpfrontend.dto.character;

import java.util.List;

public record SheetAttributes(List<String> startingValues,
                              List<String> developmentValues,
                              List<String> finalAttributesList) {
    
}
