package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.TalentsController;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

@RequiredArgsConstructor
@Service
public class TalentsTableCreator {
    
    private final TalentsController controller;
    
    public HorizontalLayout produceTalentsTable() {
        Table talents = makeTalentsTableWithHeaders();
        makeTableRow(talents);
        makeTableRow(talents);
        makeTableRow(talents);
        makeTableRow(talents);
        makeTableRow(talents);
        makeTableRow(talents);
        makeTableRow(talents);
        makeTableRow(talents);
        return new HorizontalLayout(talents);
    }
    
    private Table makeTalentsTableWithHeaders() {
        Table talents = new Table();
        TableRow talentTitle = talents.addRow();
        TableHeaderCell talentTitleCell = talentTitle.addHeaderCell();
        talentTitleCell.setText("TALENTY");
        talentTitleCell.setColSpan(2);
        
        TableRow talentNames = talents.addRow();
        talentNames.addHeaderCell().setText("Talent");
        talentNames.addHeaderCell().setText("Poz.");
        return talents;
    }
    
    private void makeTableRow(Table talents) {
        TableRow talentRow = talents.addRow();
        ComboBox<String> name = new ComboBox<>();
        name.setWidth("250px");
        name.setItems(controller.getTalentsNames());
        talentRow.addDataCell().add(name);
        TextField level = new TextField();
        level.setWidth("50px");
        talentRow.addDataCell().add(level);
    }
}
