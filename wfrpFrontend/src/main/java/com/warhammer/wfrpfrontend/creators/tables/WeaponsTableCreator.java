package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.WeaponsController;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

@RequiredArgsConstructor
@Service
public class WeaponsTableCreator {
    
    private final WeaponsController controller;
    
    public HorizontalLayout produceWeaponsTable() {
        Table weaponry = makeWeaponsTableAndHeaders();
        makeTableRow(weaponry);
        makeTableRow(weaponry);
        makeTableRow(weaponry);
        makeTableRow(weaponry);
        return new HorizontalLayout(weaponry);
    }
    
    private Table makeWeaponsTableAndHeaders() {
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
        return weaponry;
    }
    
    private void makeTableRow(Table weaponry) {
        TableRow row1 = weaponry.addRow();
        ComboBox<String> name = new ComboBox<>();
        name.setWidth("250px");
        name.setItems(controller.getWeaponsNames());
        row1.addDataCell().add(name);
        TextField category = new TextField();
        category.setWidth("150px");
        category.setEnabled(false);
        row1.addDataCell().add(category);
        TextField weight = new TextField();
        weight.setEnabled(false);
        weight.setWidth("80px");
        row1.addDataCell().add(weight);
        TextField range = new TextField();
        range.setEnabled(false);
        range.setWidth("80px");
        row1.addDataCell().add(range);
        TextField damage = new TextField();
        damage.setEnabled(false);
        damage.setWidth("100px");
        row1.addDataCell().add(damage);
        TextField traits = new TextField();
        traits.setEnabled(false);
        traits.setWidth("400px");
        row1.addDataCell().add(traits);
        name.addValueChangeListener(event -> updateValues(name.getValue(), category, weight, range, damage, traits));
    }
    
    private void updateValues(String name, TextField category, TextField weight, TextField range, TextField damage,
                              TextField traits) {
        category.setValue(controller.getCategoryByName(name));
        weight.setValue(controller.getWeightByName(name));
        range.setValue(controller.getRangeByName(name));
        damage.setValue(controller.getDamageByName(name));
        traits.setValue(controller.getTraitsByName(name));
    }
}
