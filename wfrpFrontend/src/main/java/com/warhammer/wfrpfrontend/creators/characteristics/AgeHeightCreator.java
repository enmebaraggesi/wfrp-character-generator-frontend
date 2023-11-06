package com.warhammer.wfrpfrontend.creators.characteristics;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.AppearanceController;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@Getter
@RequiredArgsConstructor
public class AgeHeightCreator {
    
    private final AppearanceController controller;
    private TextField ageField;
    private TextField heightField;
    
    public HorizontalLayout produceAgeAndHeightFields() {
        makeAgeField();
        makeHeightField();
        return new HorizontalLayout(ageField, heightField);
    }
    
    public void generateAge(String race) {
        ageField.setValue(controller.getGeneratedAge(race) + " lat(a)");
    }
    
    public void generateHeight(String race) {
        heightField.setValue(controller.getGeneratedHeight(race) + " cm");
    }
    
    private void makeHeightField() {
        heightField = new TextField("WZROST");
        heightField.setEnabled(false);
    }
    
    private void makeAgeField() {
        ageField = new TextField("WIEK");
        ageField.setEnabled(false);
    }
}

