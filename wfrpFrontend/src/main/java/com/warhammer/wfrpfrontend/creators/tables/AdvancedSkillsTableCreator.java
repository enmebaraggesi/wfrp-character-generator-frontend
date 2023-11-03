package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.SkillsController;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdvancedSkillsTableCreator {
    
    private List<String> attributesList = new ArrayList<>();
    private final List<String> advancedSkillsNames;
    
    public AdvancedSkillsTableCreator(SkillsController controller) {
        advancedSkillsNames = controller.getAdvancedSkillsNames();
    }
    
    public HorizontalLayout produceAdvancedSkillsTable(List<String> finalAttributes) {
        this.attributesList = finalAttributes;
        Table advancedSkills = makeAdvancedSkillsTableNames();
        makeTableRow(advancedSkills);
        makeTableRow(advancedSkills);
        makeTableRow(advancedSkills);
        makeTableRow(advancedSkills);
        makeTableRow(advancedSkills);
        makeTableRow(advancedSkills);
        makeTableRow(advancedSkills);
        makeTableRow(advancedSkills);
        makeTableRow(advancedSkills);
        makeTableRow(advancedSkills);
        makeTableRow(advancedSkills);
        makeTableRow(advancedSkills);
        makeTableRow(advancedSkills);
        
        return new HorizontalLayout(advancedSkills);
    }
    
    private Table makeAdvancedSkillsTableNames() {
        Table advancedSkills = new Table();
        TableRow advancedSkillsTitle = advancedSkills.addRow();
        TableHeaderCell skillsTitle = advancedSkillsTitle.addHeaderCell();
        skillsTitle.setColSpan(5);
        skillsTitle.setText("UMIEJĘTNOŚCI ZAAWANSOWANE");
        
        TableRow advancedSkillsName = advancedSkills.addRow();
        advancedSkillsName.addHeaderCell().setText("Nazwa");
        TableHeaderCell attributeName = advancedSkillsName.addHeaderCell();
        attributeName.setColSpan(2);
        attributeName.setText("Cecha");
        advancedSkillsName.addHeaderCell().setText("Roz");
        advancedSkillsName.addHeaderCell().setText("Suma");
        return advancedSkills;
    }
    
    private void makeTableRow(Table advancedSkills) {
        TableRow tableRow = advancedSkills.addRow();
        TextField skillName = new TextField();
        tableRow.addDataCell().add(skillName);
        TextField skillAttribute = new TextField();
        tableRow.addDataCell().add(skillAttribute);
        TextField skillValue = new TextField();
        tableRow.addDataCell().add(skillValue);
        TextField skillDevelopment = new TextField();
        tableRow.addDataCell().add(skillDevelopment);
        TextField skillSum = new TextField();
        tableRow.addDataCell().add(skillSum);
    }
}
