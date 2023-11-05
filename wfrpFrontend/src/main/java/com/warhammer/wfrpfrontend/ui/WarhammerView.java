package com.warhammer.wfrpfrontend.ui;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.warhammer.wfrpfrontend.creators.CharacteristicsLayoutCreator;
import com.warhammer.wfrpfrontend.creators.TablesLayoutCreator;

@Route("")
public class WarhammerView extends VerticalLayout {
    
    public WarhammerView(TablesLayoutCreator tables, CharacteristicsLayoutCreator characteristics) {
        VerticalLayout characterDescription = characteristics.prepareCharacterDescription();
        characterDescription.setAlignItems(Alignment.CENTER);
        VerticalLayout tablesLayout = tables.prepareTablesLayout();
        tablesLayout.setAlignItems(Alignment.CENTER);
        add(characterDescription, tablesLayout);
        this.getStyle().setBackground("PapayaWhip");
    }
}
