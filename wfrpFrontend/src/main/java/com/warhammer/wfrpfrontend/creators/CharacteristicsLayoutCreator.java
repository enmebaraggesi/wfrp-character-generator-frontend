package com.warhammer.wfrpfrontend.creators;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.*;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.creators.characteristics.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@Service
@RequiredArgsConstructor
public class CharacteristicsLayoutCreator {
    
    private final RaceCreator raceCreator;
    private final EyeColorsCreator eyeColorsCreator;
    private final HairColorsCreator hairColorsCreator;
    private final ProfessionCreator professionCreator;
    private final AgeHeightCreator ageHeightCreator;
    
    private TextField nameField;
    private TextField classField;
    private TextField statusField;
    private TextField ageField;
    private TextField heightField;
    private ComboBox<String> raceField;
    private ComboBox<String> eyeColorsField;
    private ComboBox<String> hairColorsField;
    private ComboBox<String> professionsField;
    
    public VerticalLayout prepareCharacterDescription() {
        nameField = raceCreator.getNameText();
        raceField = raceCreator.getRaceField();
        classField = professionCreator.getClassField();
        professionsField = professionCreator.getProfessionField();
        statusField = professionCreator.getStatusField();
        HorizontalLayout upperSide = new HorizontalLayout(FlexComponent.Alignment.CENTER, nameField, raceField,
                                                          classField, professionsField, statusField);
        ageField = ageHeightCreator.getAgeField();
        heightField = ageHeightCreator.getHeightField();
        eyeColorsField = eyeColorsCreator.getEyeColorsField();
        hairColorsField = hairColorsCreator.getHairColorsField();
        HorizontalLayout lowerSide = new HorizontalLayout(FlexComponent.Alignment.CENTER, ageField, heightField,
                                                          eyeColorsField, hairColorsField);
        raceField.addValueChangeListener(event -> {
            ageHeightCreator.generateAge(raceField.getValue());
            ageHeightCreator.generateHeight(raceField.getValue());
        });
        professionsField.addValueChangeListener(event -> {
            professionCreator.updateClass(professionsField.getValue());
            professionCreator.updateStatus(professionsField.getValue());
        });
        return new VerticalLayout(upperSide, lowerSide);
    }
}
