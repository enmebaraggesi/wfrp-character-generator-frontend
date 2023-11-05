package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.ArmorsController;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

@RequiredArgsConstructor
@Service
public class ArmorsTableCreator {
    
    private final ArmorsController controller;
    
    public HorizontalLayout produceArmorsTable() {
        Table armors = makeArmorsTableAndHeaders();
        makeTableRow(armors);
        makeTableRow(armors);
        makeTableRow(armors);
        makeTableRow(armors);
        makeTableRow(armors);
        return new HorizontalLayout(armors);
    }
    
    private Table makeArmorsTableAndHeaders() {
        Table armory = new Table();
        TableRow tableName = armory.addRow();
        TableHeaderCell tableNameCell = tableName.addHeaderCell();
        tableNameCell.setText("PANCERZ");
        tableNameCell.setColSpan(6);
        
        TableRow titlesRow = armory.addRow();
        titlesRow.addHeaderCell().setText("Nazwa");
        titlesRow.addHeaderCell().setText("Lokacja");
        titlesRow.addHeaderCell().setText("Waga");
        titlesRow.addHeaderCell().setText("Kary");
        titlesRow.addHeaderCell().setText("P. Panc.");
        titlesRow.addHeaderCell().setText("Cechy");
        return armory;
    }
    
    private void makeTableRow(Table armors) {
        TableRow armorsRow = armors.addRow();
        ComboBox<String> name = new ComboBox<>();
        name.setWidth("250px");
        name.setItems(controller.getArmorsNames());
        armorsRow.addDataCell().add(name);
        TextField location = new TextField();
        location.setEnabled(false);
        armorsRow.addDataCell().add(location);
        TextField weight = new TextField();
        weight.setEnabled(false);
        weight.setWidth("80px");
        armorsRow.addDataCell().add(weight);
        TextField penalties = new TextField();
        penalties.setEnabled(false);
        armorsRow.addDataCell().add(penalties);
        TextField points = new TextField();
        points.setEnabled(false);
        points.setWidth("80px");
        armorsRow.addDataCell().add(points);
        TextField traits = new TextField();
        traits.setEnabled(false);
        traits.setWidth("400px");
        armorsRow.addDataCell().add(traits);
        name.addValueChangeListener(event -> updateValues(name.getValue(), location, weight, penalties, points, traits));
    }
    
    private void updateValues(String name, TextField location, TextField weight, TextField penalties, TextField points, TextField traits) {
        location.setValue(controller.getLocationByName(name));
        weight.setValue(controller.getWeightByName(name));
        penalties.setValue(controller.getPenaltiesByName(name));
        points.setValue(controller.getPointsByName(name).toString());
        traits.setValue(controller.getTraitsByName(name));
    }
}
