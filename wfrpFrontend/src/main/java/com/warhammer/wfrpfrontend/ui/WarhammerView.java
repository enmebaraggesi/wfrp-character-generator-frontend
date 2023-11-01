package com.warhammer.wfrpfrontend.ui;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.warhammer.wfrpfrontend.creators.CharacteristicsLayoutCreator;
import com.warhammer.wfrpfrontend.creators.TablesLayoutCreator;

@Route("")
public class WarhammerView extends VerticalLayout {
    
    public WarhammerView(TablesLayoutCreator tables, CharacteristicsLayoutCreator characteristics) {
        VerticalLayout characterDescription = characteristics.prepareCharacterDescription();
        VerticalLayout tablesLayout = tables.prepareTablesLayout();
        add(characterDescription, tablesLayout);
    }
}
