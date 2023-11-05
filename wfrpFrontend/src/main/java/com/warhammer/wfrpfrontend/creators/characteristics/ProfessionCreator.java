package com.warhammer.wfrpfrontend.creators.characteristics;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.ProfessionsController;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProfessionCreator {
    
    private final ProfessionsController controller;
    
    public HorizontalLayout produceProffesionFields() {
        ComboBox<String> professionComboBox = makeProfessionComboBox();
        TextField statusField = makeStatusField();
        TextField classField = makeClassField();
        professionComboBox.addValueChangeListener(
                event -> updateValues(professionComboBox.getValue(), statusField, classField));
        return new HorizontalLayout(classField, professionComboBox, statusField);
    }
    
    private void updateValues(String name, TextField statusField, TextField classField) {
        statusField.setValue(controller.getStatus(name));
        classField.setValue(controller.getClassName(name));
    }
    
    private ComboBox<String> makeProfessionComboBox() {
        ComboBox<String> professionField = new ComboBox<>("PROFESJA");
        professionField.setItems(controller.getProfessionsNames());
        return professionField;
    }
    
    private TextField makeStatusField() {
        TextField statusField = new TextField("STATUS");
        statusField.setWidth("150");
        statusField.setEnabled(false);
        return statusField;
    }
    
    private TextField makeClassField() {
        TextField classField = new TextField("KLASA");
        classField.setWidth("200px");
        classField.setEnabled(false);
        return classField;
    }
}
