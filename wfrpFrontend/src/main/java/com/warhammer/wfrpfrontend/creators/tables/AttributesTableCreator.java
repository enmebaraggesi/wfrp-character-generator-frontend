package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import lombok.Getter;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

import java.util.*;

@Getter
@Service
public class AttributesTableCreator {
    
    private final List<String> finalAttributes = new ArrayList<>();
    
    public HorizontalLayout produceAttributesTable(BasicSkillsTableCreator basicSkills) {
        Table attributes = new Table();
        TableRow attrTitles = attributes.addRow();
        TableHeaderCell attr = attrTitles.addHeaderCell();
        attr.setText("CECHY");
        attr.setColSpan(11);
        setAttributesHeaders(attributes);
        List<TextField> startingValues = setStartingValues(attributes);
        List<TextField> developments = setDevelopments(attributes);
        List<TextField> finalValues = setFinalValues(attributes);
        updateFinalCell(finalValues, startingValues, developments);
        startingValues.forEach(startingValue -> startingValue.addValueChangeListener(event -> {
            updateFinalCell(finalValues, startingValues, developments);
            basicSkills.updateBasicSkillsValues(finalAttributes);
        }));
        developments.forEach(development -> development.addValueChangeListener(event -> {
            updateFinalCell(finalValues, startingValues, developments);
            basicSkills.updateBasicSkillsValues(finalAttributes);
        }));
        return new HorizontalLayout(attributes);
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
    
    private List<TextField> setStartingValues(Table attributes) {
        Random randomizer = new Random();
        TableRow attrCellsStart = attributes.addRow();
        attrCellsStart.addHeaderCell().setText("Początkowe");
        
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
        List<TextField> fieldList = List.of(wwStart, usStart, sStart, wtStart, iStart, zwStart, zrStart, inStart, swStart,
                                            ogdStart);
        fieldList.forEach(attrCellsStart::addCells);
        
        return fieldList;
    }
    
    private TextField getStartingCell(Random random) {
        TextField startingCell = new TextField();
        startingCell.setWidth("50px");
        startingCell.setValue(String.valueOf(random.nextInt(60)));
        return startingCell;
    }
    
    private List<TextField> setDevelopments(Table attributes) {
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
        List<TextField> fieldList = List.of(wwDevelop, usDevelop, sDevelop, wtDevelop, iDevelop, zwDevelop, zrDevelop,
                                            inDevelop, swDevelop, ogdDevelop);
        fieldList.forEach(attrCellsDevelop::addCells);
        
        return fieldList;
    }
    
    private TextField getDevelopmentCell() {
        TextField developmentCell = new TextField();
        developmentCell.setWidth("50px");
        developmentCell.setValue("0");
        return developmentCell;
    }
    
    private List<TextField> setFinalValues(Table attributes) {
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
        List<TextField> fieldList = List.of(wwFinal, usFinal, sFinal, wtFinal, iFinal, zwFinal, zrFinal, inFinal,
                                            swFinal, ogdFinal);
        fieldList.forEach(attrCellsFinal::addCells);
        
        return fieldList;
    }
    
    private TextField getFinalCell() {
        TextField finalCell = new TextField();
        finalCell.setEnabled(false);
        finalCell.setWidth("50px");
        return finalCell;
    }
    
    private void updateFinalCell(List<TextField> finalCells, List<TextField> starting, List<TextField> development) {
        for (int i = 0; i < finalCells.size(); i++) {
            int value = Integer.parseInt(starting.get(i).getValue()) + Integer.parseInt(development.get(i).getValue());
            finalCells.get(i).setValue(String.valueOf(value));
            finalAttributes.add(String.valueOf(value));
        }
    }
    
}
