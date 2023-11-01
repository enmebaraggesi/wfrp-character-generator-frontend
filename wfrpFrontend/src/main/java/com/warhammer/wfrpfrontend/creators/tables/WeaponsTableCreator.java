package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

@Service
public class WeaponsTableCreator {
    
    public HorizontalLayout produceWeaponsTable() {
        Table weaponry = new Table();
        TableRow tableName = weaponry.addRow();
        TableHeaderCell tableNameCell = tableName.addHeaderCell();
        tableNameCell.setText("BROŃ");
        tableNameCell.setColSpan(6);
        
        TableRow titlesRow = weaponry.addRow();
        titlesRow.addHeaderCell().setText("Nazwa");
        titlesRow.addHeaderCell().setText("Kategoria");
        titlesRow.addHeaderCell().setText("Waga");
        titlesRow.addHeaderCell().setText("Zasięg");
        titlesRow.addHeaderCell().setText("Obrażenia");
        titlesRow.addHeaderCell().setText("Cechy");
        
        TableRow row1 = weaponry.addRow();
        TextField name1 = new TextField();
        row1.addDataCell().add(name1);
        TextField cat1 = new TextField();
        row1.addDataCell().add(cat1);
        TextField weight1 = new TextField();
        row1.addDataCell().add(weight1);
        TextField range1 = new TextField();
        row1.addDataCell().add(range1);
        TextField damage1 = new TextField();
        row1.addDataCell().add(damage1);
        TextField traits1 = new TextField();
        row1.addDataCell().add(traits1);
        
        TableRow row2 = weaponry.addRow();
        TextField name2 = new TextField();
        row2.addDataCell().add(name2);
        TextField cat2 = new TextField();
        row2.addDataCell().add(cat2);
        TextField weight2 = new TextField();
        row2.addDataCell().add(weight2);
        TextField range2 = new TextField();
        row2.addDataCell().add(range2);
        TextField damage2 = new TextField();
        row2.addDataCell().add(damage2);
        TextField traits2 = new TextField();
        row2.addDataCell().add(traits2);
        
        TableRow row3 = weaponry.addRow();
        TextField name3 = new TextField();
        row3.addDataCell().add(name3);
        TextField cat3 = new TextField();
        row3.addDataCell().add(cat3);
        TextField weight3 = new TextField();
        row3.addDataCell().add(weight3);
        TextField range3 = new TextField();
        row3.addDataCell().add(range3);
        TextField damage3 = new TextField();
        row3.addDataCell().add(damage3);
        TextField traits3 = new TextField();
        row3.addDataCell().add(traits3);
        
        TableRow row4 = weaponry.addRow();
        TextField name4 = new TextField();
        row4.addDataCell().add(name4);
        TextField cat4 = new TextField();
        row4.addDataCell().add(cat4);
        TextField weight4 = new TextField();
        row4.addDataCell().add(weight4);
        TextField range4 = new TextField();
        row4.addDataCell().add(range4);
        TextField damage4 = new TextField();
        row4.addDataCell().add(damage4);
        TextField traits4 = new TextField();
        row4.addDataCell().add(traits4);
        
        return new HorizontalLayout(weaponry);
    }
}
