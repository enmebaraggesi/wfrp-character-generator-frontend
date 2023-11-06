package com.warhammer.wfrpfrontend.creators.characteristics;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.AppearanceController;
import com.warhammer.wfrpfrontend.controller.NamesController;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Getter
@RequiredArgsConstructor
public class RaceCreator {
    
    private final AppearanceController appearanceController;
    private final NamesController namesController;
    private final AgeHeightCreator ageHeightCreator;
    private final HairColorsCreator hairColorsCreator;
    private final EyeColorsCreator eyeColorsCreator;
    
    private TextField nameField;
    private ComboBox<String> raceComboBox;
    
    public HorizontalLayout produceNameAndRaceLayout() {
        makeNameField();
        makeRaceComboBox(nameField);
        return new HorizontalLayout(nameField, raceComboBox);
    }
    
    private void generateName(TextField nameField) {
        nameField.setValue(namesController.getName());
    }
    
    private void makeNameField() {
        nameField = new TextField("IMIĘ");
        nameField.setWidth("300px");
    }
    
    private void makeRaceComboBox(TextField nameField) {
        raceComboBox = new ComboBox<>("RASA");
        List<String> racesNames = appearanceController.getRaces();
        raceComboBox.setItems(racesNames);
        raceComboBox.addValueChangeListener(event -> {
            ageHeightCreator.generateHeight(raceComboBox.getValue());
            ageHeightCreator.generateAge(raceComboBox.getValue());
            hairColorsCreator.setHairColorsByRace(raceComboBox.getValue());
            eyeColorsCreator.setEyeColorsByRace(raceComboBox.getValue());
            generateName(nameField);
        });
    }
}
