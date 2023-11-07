package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.ArmorsController;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Getter
@RequiredArgsConstructor
public class ArmorsTableCreator extends Tables {
    
    private final ArmorsController controller;
    private final List<ComboBox<String>> armorNameComboBoxes;
    private final TextField[][] armorsTextFields = new TextField[5][5];
    
    @Override
    public HorizontalLayout produceTable() {
        Table armors = makeTableAndHeaders();
        makeNumberOfTableRows(armors, 5);
        return new HorizontalLayout(armors);
    }
    
    @Override
    protected Table makeTableAndHeaders() {
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
    
    @Override
    protected void makeTableRow(Table armors, int times) {
        TableRow armorsRow = armors.addRow();
        ComboBox<String> name = new ComboBox<>();
        name.setWidth("250px");
        name.setItems(controller.getArmorsNames());
        armorsRow.addDataCell().add(name);
        armorNameComboBoxes.add(name);
        TextField location = new TextField();
        location.setEnabled(false);
        armorsRow.addDataCell().add(location);
        armorsTextFields[times][0] = location;
        TextField weight = new TextField();
        weight.setEnabled(false);
        weight.setWidth("80px");
        armorsRow.addDataCell().add(weight);
        armorsTextFields[times][1] = weight;
        TextField penalties = new TextField();
        penalties.setEnabled(false);
        armorsRow.addDataCell().add(penalties);
        armorsTextFields[times][2] = penalties;
        TextField points = new TextField();
        points.setEnabled(false);
        points.setWidth("80px");
        armorsRow.addDataCell().add(points);
        armorsTextFields[times][3] = points;
        TextField traits = new TextField();
        traits.setEnabled(false);
        traits.setWidth("400px");
        armorsRow.addDataCell().add(traits);
        armorsTextFields[times][4] = traits;
        name.addValueChangeListener(
                event -> updateValues(name.getValue(), location, weight, penalties, points, traits));
    }
    
    private void updateValues(String name, TextField location, TextField weight, TextField penalties,
                              TextField points, TextField traits) {
        location.setValue(controller.getLocationByName(name));
        weight.setValue(controller.getWeightByName(name));
        penalties.setValue(controller.getPenaltiesByName(name));
        points.setValue(controller.getPointsByName(name).toString());
        traits.setValue(controller.getTraitsByName(name));
    }
    
    public Set<String> save() {
        return armorNameComboBoxes.stream()
                                  .map(ComboBox::getValue)
                                  .collect(Collectors.toSet());
    }
}
