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
    
    public AgeHeightCreator(AppearanceController controller) {
        ageField = new TextField("WIEK");
        ageField.setEnabled(false);
        String age = generateAge(controller, "Człowiek");
        ageField.setValue(age + " lat(a)");
        
        heightField = new TextField("WZROST");
        heightField.setEnabled(false);
        String height = generateHeight(controller, "Człowiek");
        heightField.setValue(height + " cm");
    }
    
    private String generateAge(AppearanceController controller, String race) {
        return controller.getGeneratedAge(race);
    }
    
    private String generateHeight(AppearanceController controller, String race) {
        return controller.getGeneratedHeight(race);
    }
}
