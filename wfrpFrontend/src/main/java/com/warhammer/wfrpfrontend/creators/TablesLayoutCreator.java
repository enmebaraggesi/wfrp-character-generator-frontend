package com.warhammer.wfrpfrontend.creators;

import com.vaadin.flow.component.orderedlayout.*;
import com.warhammer.wfrpfrontend.creators.tables.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
    private final InventoryTableCreator inventoryTableCreator;
    
    public VerticalLayout prepareTablesLayout() {
        HorizontalLayout attributesTable = attributesTableCreator.produceAttributesTable(basicSkillsTableCreator);
        List<String> finalAttributes = attributesTableCreator.getFinalAttributes();
        HorizontalLayout pointsTable = pointsTableCreator.producePointsTable();
        HorizontalLayout basicSkillsTables = basicSkillsTableCreator.produceBasicSkillsTables(finalAttributes);
        HorizontalLayout advancedSkillsTable = advancedSkillsTableCreator.produceAdvancedSkillsTable(finalAttributes);
        HorizontalLayout talentsTable = talentsTableCreator.produceTalentsTable();
        HorizontalLayout weaponsTable = weaponsTableCreator.produceWeaponsTable();
        HorizontalLayout armorsTable = armorsTableCreator.produceArmorsTable();
        HorizontalLayout inventoryTable = inventoryTableCreator.produceInventoryTable();
        
        HorizontalLayout attributesAndPoints = new HorizontalLayout(FlexComponent.Alignment.CENTER,
                                                                    attributesTable, pointsTable);
        attributesAndPoints.setSizeFull();
        basicSkillsTables.setSizeFull();
        HorizontalLayout advancedSkillsAndTalents = new HorizontalLayout(FlexComponent.Alignment.CENTER,
                                                                         advancedSkillsTable, talentsTable);
        advancedSkillsAndTalents.setSizeFull();
        weaponsTable.setSizeFull();
        armorsTable.setSizeFull();
        inventoryTable.setSizeFull();
        
        return new VerticalLayout(FlexComponent.JustifyContentMode.CENTER, attributesAndPoints, basicSkillsTables,
                                  advancedSkillsAndTalents, weaponsTable, armorsTable, inventoryTable);
    }
}
