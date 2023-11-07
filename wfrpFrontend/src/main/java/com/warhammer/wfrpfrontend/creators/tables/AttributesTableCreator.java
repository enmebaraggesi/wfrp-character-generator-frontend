package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.dto.character.SheetAttributes;
import lombok.Getter;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

import java.util.*;

@Service
public class AttributesTableCreator {
    
    @Getter
    private final List<String> finalAttributesList = new ArrayList<>();
    private List<TextField> startingValuesRow;
    private List<TextField> developments;
    private List<TextField> finalValues;
    
    public HorizontalLayout produceAttributesTable(BasicSkillsTableCreator basicSkills) {
        Table attributes = makeAttributesTable();
        setAttributesHeaders(attributes);
        startingValuesRow = setupStartingValuesRow(attributes);
        developments = makeDevelopmentsRow(attributes);
        finalValues = makeFinalValuesRow(attributes);
        updateFinalCellsRow();
        
        startingValuesRow.forEach(startingValue -> startingValue.addValueChangeListener(event -> {
            updateFinalCellsRow();
            basicSkills.updateBasicSkillsValues();
        }));
        developments.forEach(development -> development.addValueChangeListener(event -> {
            updateFinalCellsRow();
            basicSkills.updateBasicSkillsValues();
        }));
        return new HorizontalLayout(attributes);
    }
    
    private static Table makeAttributesTable() {
        Table attributes = new Table();
        TableRow attributesHeaderRow = attributes.addRow();
        TableHeaderCell attributesTitle = attributesHeaderRow.addHeaderCell();
        attributesTitle.setText("CECHY");
        attributesTitle.setColSpan(11);
        return attributes;
    }
    
    private void setAttributesHeaders(Table attributes) {
        TableRow attrNames = attributes.addRow();
        attrNames.addHeaderCell();
        attrNames.addHeaderCell().setText("WW");
        attrNames.addHeaderCell().setText("US");
        attrNames.addHeaderCell().setText("S");
        attrNames.addHeaderCell().setText("Wt");
        attrNames.addHeaderCell().setText("I");
        attrNames.addHeaderCell().setText("Zw");
        attrNames.addHeaderCell().setText("Zr");
        attrNames.addHeaderCell().setText("Int");
        attrNames.addHeaderCell().setText("SW");
        attrNames.addHeaderCell().setText("Ogd");
    }
    
    private List<TextField> setupStartingValuesRow(Table attributes) {
        Random randomizer = new Random();
        TableRow startingValuesRow = attributes.addRow();
        startingValuesRow.addHeaderCell().setText("Początkowe");
        TextField wwStart = getStartingCell(randomizer);
        TextField usStart = getStartingCell(randomizer);
        TextField sStart = getStartingCell(randomizer);
        TextField wtStart = getStartingCell(randomizer);
        TextField iStart = getStartingCell(randomizer);
        TextField zwStart = getStartingCell(randomizer);
        TextField zrStart = getStartingCell(randomizer);
        TextField inStart = getStartingCell(randomizer);
        TextField swStart = getStartingCell(randomizer);
        TextField ogdStart = getStartingCell(randomizer);
        List<TextField> fieldList = List.of(wwStart, usStart, sStart, wtStart, iStart,
                                            zwStart, zrStart, inStart, swStart, ogdStart);
        fieldList.forEach(startingValuesRow::addCells);
        return fieldList;
    }
    
    private TextField getStartingCell(Random random) {
        TextField startingCell = new TextField();
        startingCell.setWidth("50px");
        startingCell.setValue(String.valueOf(random.nextInt(2, 61)));
        return startingCell;
    }
    
    private List<TextField> makeDevelopmentsRow(Table attributes) {
        TableRow attrCellsDevelop = attributes.addRow();
        attrCellsDevelop.addHeaderCell().setText("Rozwinięcia");
        
        TextField wwDevelop = getDevelopmentCell();
        TextField usDevelop = getDevelopmentCell();
        TextField sDevelop = getDevelopmentCell();
        TextField wtDevelop = getDevelopmentCell();
        TextField iDevelop = getDevelopmentCell();
        TextField zwDevelop = getDevelopmentCell();
        TextField zrDevelop = getDevelopmentCell();
        TextField inDevelop = getDevelopmentCell();
        TextField swDevelop = getDevelopmentCell();
        TextField ogdDevelop = getDevelopmentCell();
        List<TextField> fieldList = List.of(wwDevelop, usDevelop, sDevelop, wtDevelop, iDevelop,
                                            zwDevelop, zrDevelop, inDevelop, swDevelop, ogdDevelop);
        fieldList.forEach(attrCellsDevelop::addCells);
        
        return fieldList;
    }
    
    private TextField getDevelopmentCell() {
        TextField developmentCell = new TextField();
        developmentCell.setWidth("50px");
        developmentCell.setValue("0");
        return developmentCell;
    }
    
    private List<TextField> makeFinalValuesRow(Table attributes) {
        TableRow attrCellsFinal = attributes.addRow();
        attrCellsFinal.addHeaderCell().setText("Aktualne");
        
        TextField wwFinal = getFinalCell();
        TextField usFinal = getFinalCell();
        TextField sFinal = getFinalCell();
        TextField wtFinal = getFinalCell();
        TextField iFinal = getFinalCell();
        TextField zwFinal = getFinalCell();
        TextField zrFinal = getFinalCell();
        TextField inFinal = getFinalCell();
        TextField swFinal = getFinalCell();
        TextField ogdFinal = getFinalCell();
        List<TextField> fieldList = List.of(wwFinal, usFinal, sFinal, wtFinal, iFinal,
                                            zwFinal, zrFinal, inFinal, swFinal, ogdFinal);
        fieldList.forEach(attrCellsFinal::addCells);
        
        return fieldList;
    }
    
    private TextField getFinalCell() {
        TextField finalCell = new TextField();
        finalCell.setEnabled(false);
        finalCell.setWidth("50px");
        return finalCell;
    }
    
    private void updateFinalCellsRow() {
        for (int i = 0; i < finalValues.size(); i++) {
            int value = Integer.parseInt(startingValuesRow.get(i).getValue()) + Integer.parseInt(developments.get(i).getValue());
            finalValues.get(i).setValue(String.valueOf(value));
            finalAttributesList.add(String.valueOf(value));
        }
    }
    
    public SheetAttributes save() {
        List<String> startingValues = startingValuesRow.stream()
                                                       .map(TextField::getValue)
                                                       .toList();
        List<String> developmentValues = developments.stream()
                                                     .map(TextField::getValue)
                                                     .toList();
        return new SheetAttributes(startingValues, developmentValues, finalAttributesList);
    }
}
