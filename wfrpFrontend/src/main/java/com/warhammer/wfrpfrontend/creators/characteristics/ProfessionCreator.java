package com.warhammer.wfrpfrontend.creators.characteristics;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.ProfessionsController;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@Getter
@RequiredArgsConstructor
public class ProfessionCreator {
    
    private final ProfessionsController controller;
    
    private ComboBox<String> professionComboBox;
    private TextField statusField;
    private TextField classField;
    
    public HorizontalLayout produceProfessionFields() {
        makeProfessionComboBox();
        makeStatusField();
        makeClassField();
        return new HorizontalLayout(classField, professionComboBox, statusField);
    }
    
    private void updateValues(String name, TextField statusField, TextField classField) {
        statusField.setValue(controller.getStatus(name));
        classField.setValue(controller.getClassName(name));
    }
    
    private void makeProfessionComboBox() {
        professionComboBox = new ComboBox<>("PROFESJA");
        professionComboBox.setItems(controller.getProfessionsNames());
        professionComboBox.addValueChangeListener(
                event -> updateValues(professionComboBox.getValue(), statusField, classField));
    }
    
    private void makeStatusField() {
        statusField = new TextField("STATUS");
        statusField.setWidth("150");
        statusField.setEnabled(false);
    }
    
    private void makeClassField() {
        classField = new TextField("KLASA");
        classField.setWidth("200px");
        classField.setEnabled(false);
    }
}
