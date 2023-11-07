package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.SkillsController;
import com.warhammer.wfrpfrontend.dto.character.SheetAdvancedSkills;
import com.warhammer.wfrpfrontend.dto.skill.SkillDto;
import lombok.Getter;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

import java.util.*;

@Service
@Getter
public class AdvancedSkillsTableCreator extends SkillTableCreator {
    
    private final List<SkillDto> advancedSkills;
    private final List<ComboBox<String>> skillNameComboBoxes = new ArrayList<>();
    private final TextField[][] skillTextFields = new TextField[13][4];
    
    public AdvancedSkillsTableCreator(SkillsController controller) {
        this.advancedSkills = controller.getAdvancedSkills();
    }
    
    public HorizontalLayout produceTable() {
        Table advancedSkillsTable = makeTableAndHeaders();
        for (int i = 0; i < 13; i++) {
            makeTableRow(advancedSkillsTable, i);
        }
        return new HorizontalLayout(advancedSkillsTable);
    }
    
    private Table makeTableAndHeaders() {
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
    
    private void makeTableRow(Table advancedSkillsTable, int i) {
        TableRow tableRow = advancedSkillsTable.addRow();
        List<String> skillNames = advancedSkills.stream()
                                                .map(SkillDto::name)
                                                .toList();
        ComboBox<String> skillName = new ComboBox<>();
        skillName.setItems(skillNames);
        skillName.setWidth("250px");
        tableRow.addDataCell().add(skillName);
        skillNameComboBoxes.add(skillName);
        TextField skillAttribute = new TextField();
        skillAttribute.setEnabled(false);
        skillAttribute.setWidth("50px");
        tableRow.addDataCell().add(skillAttribute);
        skillTextFields[i][0] = skillAttribute;
        TextField skillValue = new TextField();
        skillValue.setEnabled(false);
        skillValue.setWidth("50px");
        tableRow.addDataCell().add(skillValue);
        skillTextFields[i][1] = skillValue;
        TextField skillDevelopment = new TextField();
        skillDevelopment.setValue("0");
        skillDevelopment.setWidth("50px");
        tableRow.addDataCell().add(skillDevelopment);
        skillTextFields[i][2] = skillDevelopment;
        TextField skillSum = new TextField();
        skillSum.setEnabled(false);
        skillSum.setWidth("50px");
        tableRow.addDataCell().add(skillSum);
        skillTextFields[i][3] = skillSum;
        
        skillName.addValueChangeListener(
                event -> updateRowValues(skillName.getValue(), skillAttribute, skillValue, skillDevelopment, skillSum));
        skillDevelopment.addValueChangeListener(
                event -> updateRowValues(skillName.getValue(), skillAttribute, skillValue, skillDevelopment, skillSum));
    }
    
    private void updateRowValues(String skillName, TextField skillAttribute, TextField skillValue,
                                 TextField skillDevelopment, TextField skillSum) {
        for (SkillDto skillDto : advancedSkills) {
            if (skillDto.name().equals(skillName)) {
                skillAttribute.setValue(skillDto.attribute());
                skillValue.setValue(getFinalAttributeValue(skillDto.attribute()));
                int sum = Integer.parseInt(skillValue.getValue()) + Integer.parseInt(skillDevelopment.getValue());
                skillSum.setValue(String.valueOf(sum));
            }
        }
    }
    
    public SheetAdvancedSkills save() {
        List<String> advancedSkillsNames = skillNameComboBoxes.stream()
                                                              .map(ComboBox::getValue)
                                                              .toList();
        List<String> developmentValues = Arrays.stream(skillTextFields)
                                               .map(row -> row[2].getValue())
                                               .toList();
        return new SheetAdvancedSkills(advancedSkillsNames, developmentValues);
    }
}
