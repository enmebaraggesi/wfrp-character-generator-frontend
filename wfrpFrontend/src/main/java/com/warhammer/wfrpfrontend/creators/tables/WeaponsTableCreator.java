package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.WeaponsController;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class WeaponsTableCreator extends Tables {
    
    private final WeaponsController controller;
    private final List<ComboBox<String>> weaponsNameComboBoxes = new ArrayList<>();
    private final TextField[][] weaponsTextFields = new TextField[4][5];
    
    @Override
    public HorizontalLayout produceTable() {
        Table weaponry = makeTableAndHeaders();
        makeNumberOfTableRows(weaponry, 4);
        return new HorizontalLayout(weaponry);
    }
    
    @Override
    protected Table makeTableAndHeaders() {
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
    
    @Override
    protected void makeTableRow(Table table, int times) {
        TableRow tableRow = table.addRow();
        ComboBox<String> name = new ComboBox<>();
        name.setWidth("250px");
        name.setItems(controller.getWeaponsNames());
        tableRow.addDataCell().add(name);
        weaponsNameComboBoxes.add(name);
        TextField category = new TextField();
        category.setWidth("150px");
        category.setEnabled(false);
        tableRow.addDataCell().add(category);
        weaponsTextFields[times][0] = category;
        TextField weight = new TextField();
        weight.setEnabled(false);
        weight.setWidth("80px");
        tableRow.addDataCell().add(weight);
        weaponsTextFields[times][1] = weight;
        TextField range = new TextField();
        range.setEnabled(false);
        range.setWidth("80px");
        tableRow.addDataCell().add(range);
        weaponsTextFields[times][2] = range;
        TextField damage = new TextField();
        damage.setEnabled(false);
        damage.setWidth("100px");
        tableRow.addDataCell().add(damage);
        weaponsTextFields[times][3] = damage;
        TextField traits = new TextField();
        traits.setEnabled(false);
        traits.setWidth("400px");
        tableRow.addDataCell().add(traits);
        weaponsTextFields[times][4] = traits;
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
