package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.dto.character.SheetBasicSkills;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

import java.util.Arrays;
import java.util.List;

@Service
public class BasicSkillsTableCreator extends SkillTableCreator {
    
    private final TextField[][] valueRowsLeft = new TextField[13][4];
    private final TextField[][] valueRowsRight = new TextField[13][4];
    
    public HorizontalLayout produceTable() {
        Table left = produceLeftHalfTable();
        Table right = produceRightHalfTable();
        updateBasicSkillsValues();
        return new HorizontalLayout(left, right);
    }
    
    private Table produceLeftHalfTable() {
        Table basicSkillsLeft = makeTableWithHeaders();
        valueRowsLeft[0] = makeTableRow(basicSkillsLeft, "Atletyka", "Zw");
        valueRowsLeft[1] = makeTableRow(basicSkillsLeft, "Broń Biała (Podstawowa)", "WW");
        valueRowsLeft[2] = makeTableRow(basicSkillsLeft, "Broń Biała (...)", "WW");
        valueRowsLeft[3] = makeTableRow(basicSkillsLeft, "Charyzma", "Ogd");
        valueRowsLeft[4] = makeTableRow(basicSkillsLeft, "Dowodzenie", "Ogd");
        valueRowsLeft[5] = makeTableRow(basicSkillsLeft, "Hazard", "Int");
        valueRowsLeft[6] = makeTableRow(basicSkillsLeft, "Intuicja", "I");
        valueRowsLeft[7] = makeTableRow(basicSkillsLeft, "Jeździectwo", "Zw");
        valueRowsLeft[8] = makeTableRow(basicSkillsLeft, "Mocna głowa", "Wt");
        valueRowsLeft[9] = makeTableRow(basicSkillsLeft, "Nawigacja", "I");
        valueRowsLeft[10] = makeTableRow(basicSkillsLeft, "Odporność", "Wt");
        valueRowsLeft[11] = makeTableRow(basicSkillsLeft, "Opanowanie", "SW");
        valueRowsLeft[12] = makeTableRow(basicSkillsLeft, "Oswajanie", "SW");
        return basicSkillsLeft;
    }
    
    private Table produceRightHalfTable() {
        Table basicSkillsRight = makeTableWithHeaders();
        valueRowsRight[0] = makeTableRow(basicSkillsRight, "Percepcja", "I");
        valueRowsRight[1] = makeTableRow(basicSkillsRight, "Plotkowanie", "Ogd");
        valueRowsRight[2] = makeTableRow(basicSkillsRight, "Powożenie", "Zw");
        valueRowsRight[3] = makeTableRow(basicSkillsRight, "Przekupstwo", "Ogd");
        valueRowsRight[4] = makeTableRow(basicSkillsRight, "Skradanie", "Zw");
        valueRowsRight[5] = makeTableRow(basicSkillsRight, "Sztuka", "Zr");
        valueRowsRight[6] = makeTableRow(basicSkillsRight, "Sztuka Przetrwania", "Int");
        valueRowsRight[7] = makeTableRow(basicSkillsRight, "Targowanie", "Ogd");
        valueRowsRight[8] = makeTableRow(basicSkillsRight, "Unik", "Zw");
        valueRowsRight[9] = makeTableRow(basicSkillsRight, "Wioślarstwo", "S");
        valueRowsRight[10] = makeTableRow(basicSkillsRight, "Wspinaczka", "S");
        valueRowsRight[11] = makeTableRow(basicSkillsRight, "Występy", "Ogd");
        valueRowsRight[12] = makeTableRow(basicSkillsRight, "Zastraszanie", "S");
        return basicSkillsRight;
    }
    
    private Table makeTableWithHeaders() {
        Table basicSkills = new Table();
        TableRow basicSkillsTitle = basicSkills.addRow();
        TableHeaderCell skillsTitle = basicSkillsTitle.addHeaderCell();
        skillsTitle.setColSpan(5);
        skillsTitle.setText("UMIEJĘTNOŚCI PODSTAWOWE");
        
        TableRow basicSkillsNames = basicSkills.addRow();
        basicSkillsNames.addHeaderCell().setText("Nazwa");
        TableHeaderCell attributeName = basicSkillsNames.addHeaderCell();
        attributeName.setColSpan(2);
        attributeName.setText("Cecha");
        basicSkillsNames.addHeaderCell().setText("Roz");
        basicSkillsNames.addHeaderCell().setText("Suma");
        return basicSkills;
    }
    
    private TextField[] makeTableRow(Table basicSkills, String skillName, String attribute) {
        TextField[] rowValues = new TextField[4];
        TableRow basicSkillsTableRow = basicSkills.addRow();
        basicSkillsTableRow.addHeaderCell().setText(skillName);
        basicSkillsTableRow.addHeaderCell().setText(attribute);
        rowValues[0] = new TextField();
        rowValues[0].setValue(attribute);
        
        TextField attributeValue = new TextField();
        attributeValue.setEnabled(false);
        attributeValue.setWidth("50px");
        basicSkillsTableRow.addDataCell().add(attributeValue);
        rowValues[1] = attributeValue;
        TextField developmentValue = new TextField();
        developmentValue.setWidth("50px");
        developmentValue.setValue("0");
        developmentValue.addValueChangeListener(event -> updateBasicSkillsValues());
        basicSkillsTableRow.addDataCell().add(developmentValue);
        rowValues[2] = developmentValue;
        TextField sum = new TextField();
        sum.setEnabled(false);
        sum.setWidth("50px");
        basicSkillsTableRow.addDataCell().add(sum);
        rowValues[3] = sum;
        return rowValues;
    }
    
    public void updateBasicSkillsValues() {
        updateRows(valueRowsLeft);
        updateRows(valueRowsRight);
    }
    
    private void updateRows(TextField[][] tableRows) {
        for (TextField[] textFields : tableRows) {
            String attributeIndex = getFinalAttributeValue(textFields[0].getValue());
            textFields[1].setValue(attributeIndex);
            textFields[3].setValue(String.valueOf(Integer.parseInt(attributeIndex)
                                                          + Integer.parseInt(textFields[2].getValue())));
        }
    }
    
    public SheetBasicSkills save() {
        List<String> developmentValuesLeft = Arrays.stream(valueRowsLeft)
                                                   .map(row -> row[2].getValue())
                                                   .toList();
        List<String> developmentValuesRight = Arrays.stream(valueRowsRight)
                                                    .map(row -> row[2].getValue())
                                                    .toList();
        return new SheetBasicSkills(developmentValuesLeft, developmentValuesRight);
    }
}
