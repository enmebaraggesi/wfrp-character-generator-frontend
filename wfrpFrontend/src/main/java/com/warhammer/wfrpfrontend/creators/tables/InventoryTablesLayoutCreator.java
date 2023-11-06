package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryTablesLayoutCreator {
    
    private final EquipmentTableCreator equipmentTableCreator;
    private final HirelingsTableCreator hirelingsTableCreator;
    
    public HorizontalLayout produceTable() {
        HorizontalLayout inventoryTable = equipmentTableCreator.produceTable();
        HorizontalLayout hirelingsTable = hirelingsTableCreator.produceTable();
        return new HorizontalLayout(inventoryTable, hirelingsTable);
    }
}
