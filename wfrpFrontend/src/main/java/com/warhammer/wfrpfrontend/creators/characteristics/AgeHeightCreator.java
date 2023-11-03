package com.warhammer.wfrpfrontend.creators.characteristics;

import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.AppearanceController;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
public class AgeHeightCreator {
    
    private final TextField ageField;
    private final TextField heightField;
    private final AppearanceController controller;
    
    public AgeHeightCreator(AppearanceController controller) {
        this.controller = controller;
        ageField = new TextField("WIEK");
        ageField.setEnabled(false);
        heightField = new TextField("WZROST");
        heightField.setEnabled(false);
    }
    
    public void generateAge(String race) {
        ageField.setValue(controller.getGeneratedAge(race) + " lat(a)");
    }
    
    public void generateHeight(String race) {
        heightField.setValue(controller.getGeneratedHeight(race) + " cm");
    }
}
