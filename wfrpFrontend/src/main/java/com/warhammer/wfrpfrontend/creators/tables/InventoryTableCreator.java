package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.InventoryController;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

@RequiredArgsConstructor
@Service
public class InventoryTableCreator {
    
    private final InventoryController controller;
    
    public HorizontalLayout produceInventoryAndHirelingsTables() {
        Table inventoryTable = produceInventoryTable();
        Table hirelingsTable = produceHirelingsTable();
        return new HorizontalLayout(inventoryTable, hirelingsTable);
    }
    
    public Table produceHirelingsTable() {
        Table hirelings = makeHirelingsTableWithHeaders();
        makeHirelingsTableRow(hirelings);
        makeHirelingsTableRow(hirelings);
        makeHirelingsTableRow(hirelings);
        makeHirelingsTableRow(hirelings);
        makeHirelingsTableRow(hirelings);
        makeHirelingsTableRow(hirelings);
        makeHirelingsTableRow(hirelings);
        makeHirelingsTableRow(hirelings);
        return hirelings;
    }
    
    private Table makeHirelingsTableWithHeaders() {
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
    
    private void makeHirelingsTableRow(Table hirelings) {
        TableRow hirelingsRow = hirelings.addRow();
        ComboBox<String> types = new ComboBox<>();
        types.setWidth("250px");
        types.setItems(controller.getHirelingsNames());
        hirelingsRow.addDataCell().add(types);
        TextField name = new TextField();
        name.setWidth("100px");
        hirelingsRow.addDataCell().add(name);
        TextField cost = new TextField();
        cost.setEnabled(false);
        cost.setWidth("200px");
        hirelingsRow.addDataCell().add(cost);
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
        name.setValue("Jasio");
    }
    
    public Table produceInventoryTable() {
        Table inventory = makeInventoryTableWithHeaders();
        makeInventoryTableRow(inventory);
        makeInventoryTableRow(inventory);
        makeInventoryTableRow(inventory);
        makeInventoryTableRow(inventory);
        makeInventoryTableRow(inventory);
        makeInventoryTableRow(inventory);
        makeInventoryTableRow(inventory);
        makeInventoryTableRow(inventory);
        return inventory;
    }
    
    private Table makeInventoryTableWithHeaders() {
        Table inventory = new Table();
        TableRow tableName = inventory.addRow();
        TableHeaderCell tableNameCell = tableName.addHeaderCell();
        tableNameCell.setText("WYPOSAŻENIE");
        tableNameCell.setColSpan(2);
        
        TableRow titlesRow = inventory.addRow();
        titlesRow.addHeaderCell().setText("Nazwa");
        titlesRow.addHeaderCell().setText("Waga");
        return inventory;
    }
    
    private void makeInventoryTableRow(Table inventory) {
        TableRow inventoryRow = inventory.addRow();
        ComboBox<String> items = new ComboBox<>();
        items.setWidth("250px");
        items.setItems(controller.getInventoryNames());
        inventoryRow.addDataCell().add(items);
        TextField weight = new TextField();
        weight.setEnabled(false);
        weight.setWidth("50px");
        inventoryRow.addDataCell().add(weight);
        items.addValueChangeListener(event -> updateWeightValue(items.getValue(), weight));
    }
    
    private void updateWeightValue(String name, TextField weight) {
        String weightByName = controller.getInventoryWeightByName(name);
        weight.setValue(weightByName);
    }
}
