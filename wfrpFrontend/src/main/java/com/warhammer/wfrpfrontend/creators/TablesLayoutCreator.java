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
        HorizontalLayout inventoryTable = inventoryTableCreator.produceInventoryAndHirelingsTables();
        
        HorizontalLayout attributesAndPointsLayout =
                new HorizontalLayout(FlexComponent.Alignment.CENTER, attributesTable, pointsTable);
        HorizontalLayout skillsLayout =
                new HorizontalLayout(FlexComponent.Alignment.CENTER, basicSkillsTables, advancedSkillsTable);
        HorizontalLayout talentsAndInventoryLayout =
                new HorizontalLayout(FlexComponent.Alignment.CENTER, talentsTable, inventoryTable);
        return new VerticalLayout(FlexComponent.JustifyContentMode.CENTER, attributesAndPointsLayout,
                                  skillsLayout, weaponsTable, armorsTable, talentsAndInventoryLayout);
    }
}
