package com.warhammer.wfrpfrontend.ui;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.warhammer.wfrpfrontend.creators.*;
import com.warhammer.wfrpfrontend.engine.SheetSaver;

@Route("")
public class WarhammerView extends VerticalLayout {
    
    private final TablesLayoutCreator tables;
    private final CharacteristicsLayoutCreator characteristics;
    private final SheetSaver saver;
    
    public WarhammerView(CharacterListLayoutCreator list,
                         TablesLayoutCreator tablesLayoutCreator,
                         CharacteristicsLayoutCreator characteristicsLayoutCreator,
                         SheetSaver sheetSaver) {
        this.tables = tablesLayoutCreator;
        this.characteristics = characteristicsLayoutCreator;
        this.saver = sheetSaver;
        
        VerticalLayout listLayout = list.prepareCharacterListLayout();
        VerticalLayout characterDescription = characteristics.prepareCharacterDescription();
        VerticalLayout tablesLayout = tables.prepareTablesLayout();
        add(listLayout, characterDescription, tablesLayout);
        
        this.getStyle().setBackground("PapayaWhip");
        list.getSaveButton().addClickListener(event -> save(list.getCharacterSheets().getValue()));
    }

    public void save(String characterName) {
        saver.saveCharacterSheet(characterName, characteristics, tables);
    }
}
