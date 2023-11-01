package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

@Service
public class InventoryTableCreator {
    
    public HorizontalLayout produceInventoryTable() {
        Table inventory = new Table();
        TableRow tableName = inventory.addRow();
        TableHeaderCell tableNameCell = tableName.addHeaderCell();
        tableNameCell.setText("WYPOSAŻENIE");
        tableNameCell.setColSpan(2);
        
        TableRow titlesRow = inventory.addRow();
        titlesRow.addHeaderCell().setText("Nazwa");
        titlesRow.addHeaderCell().setText("Waga");
        
        TableRow inventoryRow = inventory.addRow();
        TextField items = new TextField();
        items.setHeightFull();
        inventoryRow.addDataCell().add(items);
        TextField weight = new TextField();
        weight.setHeightFull();
        inventoryRow.addDataCell().add(weight);
        
        return new HorizontalLayout(inventory);
    }
}
