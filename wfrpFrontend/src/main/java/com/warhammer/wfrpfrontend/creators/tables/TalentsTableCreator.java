package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.TalentsController;
import com.warhammer.wfrpfrontend.dto.character.SheetTalents;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class TalentsTableCreator extends Tables {
    
    private final TalentsController controller;
    private final List<ComboBox<String>> talentNameComboBoxes = new ArrayList<>();
    private final List<TextField> talentTextFields = new ArrayList<>();
    
    @Override
    public HorizontalLayout produceTable() {
        Table talents = makeTableAndHeaders();
        makeNumberOfTableRows(talents, 8);
        return new HorizontalLayout(talents);
    }
    
    @Override
    protected Table makeTableAndHeaders() {
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
    
    @Override
    protected void makeTableRow(Table table, int times) {
        TableRow talentRow = table.addRow();
        ComboBox<String> name = new ComboBox<>();
        name.setWidth("250px");
        name.setItems(controller.getTalentsNames());
        talentRow.addDataCell().add(name);
        talentNameComboBoxes.add(name);
        TextField level = new TextField();
        level.setWidth("50px");
        talentRow.addDataCell().add(level);
        talentTextFields.add(level);
    }
    
    public SheetTalents save() {
        List<String> talentsNames = talentNameComboBoxes.stream()
                                                        .map(ComboBox::getValue)
                                                        .toList();
        List<String> talentPoints = talentTextFields.stream()
                                                    .map(TextField::getValue)
                                                    .toList();
        return new SheetTalents(talentsNames, talentPoints);
    }
}
