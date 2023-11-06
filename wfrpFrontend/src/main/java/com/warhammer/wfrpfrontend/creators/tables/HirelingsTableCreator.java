package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.InventoryController;
import com.warhammer.wfrpfrontend.controller.NamesController;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class HirelingsTableCreator extends Tables {
    
    private final InventoryController controller;
    private final NamesController namesController;
    private final List<ComboBox<String>> hirelingsNameComboBoxes = new ArrayList<>();
    private final TextField[][] hirelingsTextFields = new TextField[8][2];
    
    @Override
    public HorizontalLayout produceTable() {
        Table hirelings = makeTableAndHeaders();
        makeNumberOfTableRows(hirelings, 8);
        return new HorizontalLayout(hirelings);
    }
    
    @Override
    protected Table makeTableAndHeaders() {
        Table hirelings = new Table();
        TableRow tableName = hirelings.addRow();
        TableHeaderCell tableNameCell = tableName.addHeaderCell();
        tableNameCell.setText("NAJEMNICY");
        tableNameCell.setColSpan(3);
        
        TableRow titlesRow = hirelings.addRow();
        titlesRow.addHeaderCell().setText("Typ");
        titlesRow.addHeaderCell().setText("Imię");
        titlesRow.addHeaderCell().setText("Koszt");
        return hirelings;
    }
    
    @Override
    protected void makeTableRow(Table table, int times) {
        TableRow hirelingsRow = table.addRow();
        ComboBox<String> types = new ComboBox<>();
        types.setWidth("250px");
        types.setItems(controller.getHirelingsNames());
        hirelingsRow.addDataCell().add(types);
        hirelingsNameComboBoxes.add(types);
        TextField name = new TextField();
        name.setWidth("100px");
        hirelingsRow.addDataCell().add(name);
        hirelingsTextFields[times][0] = name;
        TextField cost = new TextField();
        cost.setEnabled(false);
        cost.setWidth("200px");
        hirelingsRow.addDataCell().add(cost);
        hirelingsTextFields[times][1] = cost;
        
        types.addValueChangeListener(event -> {
            updateHirelingName(name);
            updateCostValue(types.getValue(), cost);
        });
    }
    
    private void updateCostValue(String name, TextField cost) {
        String costByName = controller.getHirelingCostByName(name);
        cost.setValue(costByName);
    }
    
    private void updateHirelingName(TextField name) {
        name.setValue(namesController.getFirstName());
    }
}
