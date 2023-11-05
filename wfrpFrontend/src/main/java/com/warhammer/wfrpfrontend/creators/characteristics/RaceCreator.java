package com.warhammer.wfrpfrontend.creators.characteristics;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.AppearanceController;
import com.warhammer.wfrpfrontend.controller.NamesController;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RaceCreator {
    
    private final AppearanceController appearanceController;
    private final NamesController namesController;
    
    public HorizontalLayout produceNameAndRace(AgeHeightCreator ageHeightCreator) {
        TextField nameField = makeNameField();
        ComboBox<String> raceComboBox = makeRaceComboBox();
        raceComboBox.addValueChangeListener(event -> {
            ageHeightCreator.generateHeight(raceComboBox.getValue());
            ageHeightCreator.generateAge(raceComboBox.getValue());
            generateName(nameField);
        });
        return new HorizontalLayout(nameField, raceComboBox);
    }
    
    private void generateName(TextField nameField) {
        nameField.setValue(namesController.getName());
    }
    
    private TextField makeNameField() {
        TextField nameField = new TextField("IMIĘ");
        nameField.setWidth("300px");
        return nameField;
    }
    
    private ComboBox<String> makeRaceComboBox() {
        ComboBox<String> raceField = new ComboBox<>("RASA");
        List<String> racesNames = appearanceController.getRaces();
        raceField.setItems(racesNames);
        return raceField;
    }
}
