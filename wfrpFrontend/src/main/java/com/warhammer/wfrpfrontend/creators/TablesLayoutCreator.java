package com.warhammer.wfrpfrontend.creators;

import com.vaadin.flow.component.orderedlayout.*;
import com.warhammer.wfrpfrontend.creators.tables.*;
import com.warhammer.wfrpfrontend.dto.character.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class TablesLayoutCreator {
    
    private final AttributesTableCreator attributesTableCreator;
    private final PointsTableCreator pointsTableCreator;
    private final BasicSkillsTableCreator basicSkillsTableCreator;
    private final AdvancedSkillsTableCreator advancedSkillsTableCreator;
    private final TalentsTableCreator talentsTableCreator;
    private final WeaponsTableCreator weaponsTableCreator;
    private final ArmorsTableCreator armorsTableCreator;
    private final InventoryTablesLayoutCreator inventoryTablesLayoutCreator;
    
    public VerticalLayout prepareTablesLayout() {
        HorizontalLayout attributesTable = attributesTableCreator.produceAttributesTable(basicSkillsTableCreator);
        HorizontalLayout pointsTable = pointsTableCreator.producePointsTable();
        basicSkillsTableCreator.setFinalAttributes(attributesTableCreator.getFinalAttributesList());
        HorizontalLayout basicSkillsTables = basicSkillsTableCreator.produceTable();
        advancedSkillsTableCreator.setFinalAttributes(attributesTableCreator.getFinalAttributesList());
        HorizontalLayout advancedSkillsTable = advancedSkillsTableCreator.produceTable();
        HorizontalLayout talentsTable = talentsTableCreator.produceTable();
        HorizontalLayout weaponsTable = weaponsTableCreator.produceTable();
        HorizontalLayout armorsTable = armorsTableCreator.produceTable();
        HorizontalLayout inventoryTable = inventoryTablesLayoutCreator.produceTable();
        
        HorizontalLayout attributesAndPointsLayout = new HorizontalLayout(FlexComponent.Alignment.CENTER,
                                                                          attributesTable, pointsTable);
        HorizontalLayout skillsLayout = new HorizontalLayout(FlexComponent.Alignment.CENTER,
                                                             basicSkillsTables, advancedSkillsTable);
        HorizontalLayout talentsAndInventoryLayout = new HorizontalLayout(FlexComponent.Alignment.CENTER,
                                                                          talentsTable, inventoryTable);
        VerticalLayout layout = new VerticalLayout(FlexComponent.JustifyContentMode.CENTER,
                                                   attributesAndPointsLayout, skillsLayout, weaponsTable,
                                                   armorsTable, talentsAndInventoryLayout);
        layout.setAlignItems(FlexComponent.Alignment.CENTER);
        return layout;
    }
    
    public SheetTables save() {
        SheetAttributes sheetAttributes = attributesTableCreator.save();
        SheetPoints sheetPoints = pointsTableCreator.save();
        SheetBasicSkills sheetBasicSkills = basicSkillsTableCreator.save();
        SheetAdvancedSkills sheetAdvancedSkills = advancedSkillsTableCreator.save();
        SheetTalents sheetTalents = talentsTableCreator.save();
        Set<String> sheetWeapons = weaponsTableCreator.save();
        Set<String> sheetArmors = armorsTableCreator.save();
        SheetInventory sheetInventory = inventoryTablesLayoutCreator.save();
        return new SheetTables(sheetAttributes, sheetPoints, sheetBasicSkills, sheetAdvancedSkills, sheetTalents,
                               sheetInventory, sheetWeapons, sheetArmors);
    }
}
