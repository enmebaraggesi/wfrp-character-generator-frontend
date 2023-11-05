package com.warhammer.wfrpfrontend.creators.characteristics;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.AppearanceController;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Getter
@Service
public class AgeHeightCreator {
    
    private final AppearanceController controller;
    private TextField ageField;
    private TextField heightField;
    
    public HorizontalLayout produceAgeAndHeightFields() {
        this.ageField = makeAgeField();
        this.heightField = makeHeightField();
        return new HorizontalLayout(ageField, heightField);
    }
    
    public void generateAge(String race) {
        ageField.setValue(controller.getGeneratedAge(race) + " lat(a)");
    }
    
    public void generateHeight(String race) {
        heightField.setValue(controller.getGeneratedHeight(race) + " cm");
    }
    
    private TextField makeHeightField() {
        TextField height = new TextField("WZROST");
        height.setEnabled(false);
        return height;
    }
    
    private TextField makeAgeField() {
        TextField age = new TextField("WIEK");
        age.setEnabled(false);
        return age;
    }
}
