package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.warhammer.wfrpfrontend.dto.character.SheetInventory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
    
    public SheetInventory save() {
        List<String> equipmentNames = equipmentTableCreator.save();
        List<String> hirelingsNames = hirelingsTableCreator.save();
        return new SheetInventory(equipmentNames, hirelingsNames);
    }
}
