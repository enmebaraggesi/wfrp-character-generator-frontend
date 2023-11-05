package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.SkillsController;
import com.warhammer.wfrpfrontend.dto.SkillDto;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

import java.util.List;

@Service
public class AdvancedSkillsTableCreator {
    
    private List<String> finalAttributes;
    private final List<SkillDto> advancedSkills;
    
    public AdvancedSkillsTableCreator(SkillsController controller) {
        advancedSkills = controller.getAdvancedSkills();
    }
    
    public HorizontalLayout produceAdvancedSkillsTable(List<String> finalAttributes) {
        this.finalAttributes = finalAttributes;
        Table advancedSkillsTable = makeTableWithHeaders();
        makeTableRow(advancedSkillsTable);
        makeTableRow(advancedSkillsTable);
        makeTableRow(advancedSkillsTable);
        makeTableRow(advancedSkillsTable);
        makeTableRow(advancedSkillsTable);
        makeTableRow(advancedSkillsTable);
        makeTableRow(advancedSkillsTable);
        makeTableRow(advancedSkillsTable);
        makeTableRow(advancedSkillsTable);
        makeTableRow(advancedSkillsTable);
        makeTableRow(advancedSkillsTable);
        makeTableRow(advancedSkillsTable);
        makeTableRow(advancedSkillsTable);
        
        return new HorizontalLayout(advancedSkillsTable);
    }
    
    private Table makeTableWithHeaders() {
        Table advancedSkillsTable = new Table();
        TableRow advancedSkillsTitle = advancedSkillsTable.addRow();
        TableHeaderCell skillsTitle = advancedSkillsTitle.addHeaderCell();
        skillsTitle.setColSpan(5);
        skillsTitle.setText("UMIEJĘTNOŚCI ZAAWANSOWANE");
        
        TableRow advancedSkillsName = advancedSkillsTable.addRow();
        advancedSkillsName.addHeaderCell().setText("Nazwa");
        TableHeaderCell attributeName = advancedSkillsName.addHeaderCell();
        attributeName.setColSpan(2);
        attributeName.setText("Cecha");
        advancedSkillsName.addHeaderCell().setText("Roz");
        advancedSkillsName.addHeaderCell().setText("Suma");
        return advancedSkillsTable;
    }
    
    private void makeTableRow(Table advancedSkillsTable) {
        TableRow tableRow = advancedSkillsTable.addRow();
        ComboBox<String> skillName = new ComboBox<>();
        List<String> names = advancedSkills.stream()
                                           .map(SkillDto::name)
                                           .toList();
        skillName.setItems(names);
        skillName.setWidth("250px");
        tableRow.addDataCell().add(skillName);
        TextField skillAttribute = new TextField();
        skillAttribute.setEnabled(false);
        skillAttribute.setWidth("50px");
        tableRow.addDataCell().add(skillAttribute);
        TextField skillValue = new TextField();
        skillValue.setEnabled(false);
        skillValue.setWidth("50px");
        tableRow.addDataCell().add(skillValue);
        TextField skillDevelopment = new TextField();
        skillDevelopment.setValue("0");
        skillDevelopment.setWidth("50px");
        tableRow.addDataCell().add(skillDevelopment);
        TextField skillSum = new TextField();
        skillSum.setEnabled(false);
        skillSum.setWidth("50px");
        tableRow.addDataCell().add(skillSum);
        skillName.addValueChangeListener(event -> updateRowValues(skillName.getValue(), skillAttribute, skillValue, skillDevelopment, skillSum));
        skillDevelopment.addValueChangeListener(event -> updateRowValues(skillName.getValue(), skillAttribute, skillValue, skillDevelopment, skillSum));
    }
    
    private void updateRowValues(String skillName, TextField skillAttribute, TextField skillValue, TextField skillDevelopment, TextField skillSum) {
        for (SkillDto dto : advancedSkills) {
            if (dto.name().equals(skillName)) {
                skillAttribute.setValue(dto.attribute());
                String finalAttributeValue = getFinalAttributeValue(dto.attribute().toLowerCase());
                skillValue.setValue(finalAttributeValue);
                String developmentValue = skillDevelopment.getValue();
                int sum = Integer.parseInt(finalAttributeValue) + Integer.parseInt(developmentValue);
                skillSum.setValue(String.valueOf(sum));
            }
        }
    }
    
    private String getFinalAttributeValue(String attribute) {
        switch (attribute) {
            default -> {
                return finalAttributes.get(0);
            }
            case "us" -> {
                return finalAttributes.get(1);
            }
            case "s" -> {
                return finalAttributes.get(2);
            }
            case "wt" -> {
                return finalAttributes.get(3);
            }
            case "i" -> {
                return finalAttributes.get(4);
            }
            case "zw" -> {
                return finalAttributes.get(5);
            }
            case "zr" -> {
                return finalAttributes.get(6);
            }
            case "int" -> {
                return finalAttributes.get(7);
            }
            case "sw" -> {
                return finalAttributes.get(8);
            }
            case "ogd" -> {
                return finalAttributes.get(9);
            }
        }
    }
    
}
