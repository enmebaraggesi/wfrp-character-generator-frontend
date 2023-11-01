package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

@Service
public class ArmorsTableCreator {
    
    public HorizontalLayout produceArmorsTable() {
        Table armory = new Table();
        TableRow tableName = armory.addRow();
        TableHeaderCell tableNameCell = tableName.addHeaderCell();
        tableNameCell.setText("PANCERZ");
        tableNameCell.setColSpan(5);
        
        TableRow titlesRow = armory.addRow();
        titlesRow.addHeaderCell().setText("Nazwa");
        titlesRow.addHeaderCell().setText("Lokacja");
        titlesRow.addHeaderCell().setText("Waga");
        titlesRow.addHeaderCell().setText("Punkty Pancerza");
        titlesRow.addHeaderCell().setText("Cechy");
        
        TableRow row1 = armory.addRow();
        TextField name1 = new TextField();
        row1.addDataCell().add(name1);
        TextField loc1 = new TextField();
        row1.addDataCell().add(loc1);
        TextField weight1 = new TextField();
        row1.addDataCell().add(weight1);
        TextField points1 = new TextField();
        row1.addDataCell().add(points1);
        TextField traits1 = new TextField();
        row1.addDataCell().add(traits1);
        
        TableRow row2 = armory.addRow();
        TextField name2 = new TextField();
        row2.addDataCell().add(name2);
        TextField loc2 = new TextField();
        row2.addDataCell().add(loc2);
        TextField weight2 = new TextField();
        row2.addDataCell().add(weight2);
        TextField points2 = new TextField();
        row2.addDataCell().add(points2);
        TextField traits2 = new TextField();
        row2.addDataCell().add(traits2);
        
        TableRow row3 = armory.addRow();
        TextField name3 = new TextField();
        row3.addDataCell().add(name3);
        TextField loc3 = new TextField();
        row3.addDataCell().add(loc3);
        TextField weight3 = new TextField();
        row3.addDataCell().add(weight3);
        TextField points3 = new TextField();
        row3.addDataCell().add(points3);
        TextField traits3 = new TextField();
        row3.addDataCell().add(traits3);
        
        TableRow row4 = armory.addRow();
        TextField name4 = new TextField();
        row4.addDataCell().add(name4);
        TextField loc4 = new TextField();
        row4.addDataCell().add(loc4);
        TextField weight4 = new TextField();
        row4.addDataCell().add(weight4);
        TextField points4 = new TextField();
        row4.addDataCell().add(points4);
        TextField traits4 = new TextField();
        row4.addDataCell().add(traits4);
        
        TableRow row5 = armory.addRow();
        TextField name5 = new TextField();
        row5.addDataCell().add(name5);
        TextField loc5 = new TextField();
        row5.addDataCell().add(loc5);
        TextField weight5 = new TextField();
        row5.addDataCell().add(weight5);
        TextField points5 = new TextField();
        row5.addDataCell().add(points5);
        TextField traits5 = new TextField();
        row5.addDataCell().add(traits5);
        
        return new HorizontalLayout(armory);
    }
}
