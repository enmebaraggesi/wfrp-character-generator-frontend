package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.InventoryController;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class EquipmentTableCreator extends Tables {
    
    private final InventoryController controller;
    private final List<ComboBox<String>> equipmentNameComboBoxes;
    private final List<TextField> equipmentTextFields;
    
    @Override
    public HorizontalLayout produceTable() {
        Table equipment = makeTableAndHeaders();
        makeNumberOfTableRows(equipment, 8);
        return new HorizontalLayout(equipment);
    }
    
    @Override
    protected Table makeTableAndHeaders() {
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
    
    @Override
    protected void makeTableRow(Table table, int times) {
        TableRow inventoryRow = table.addRow();
        ComboBox<String> items = new ComboBox<>();
        items.setWidth("250px");
        items.setItems(controller.getInventoryNames());
        inventoryRow.addDataCell().add(items);
        equipmentNameComboBoxes.add(items);
        TextField weight = new TextField();
        weight.setEnabled(false);
        weight.setWidth("50px");
        inventoryRow.addDataCell().add(weight);
        equipmentTextFields.add(weight);
        items.addValueChangeListener(event -> updateWeightValue(items.getValue(), weight));
    }
    
    private void updateWeightValue(String name, TextField weight) {
        String weightByName = controller.getInventoryWeightByName(name);
        weight.setValue(weightByName);
    }
    
    public List<String> save() {
        return equipmentNameComboBoxes.stream()
                                      .map(ComboBox::getValue)
                                      .toList();
    }
}
