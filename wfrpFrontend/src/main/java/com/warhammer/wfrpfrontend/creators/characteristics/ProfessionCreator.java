package com.warhammer.wfrpfrontend.creators.characteristics;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.ProfessionsController;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
public class ProfessionCreator {
    
    private final ProfessionsController controller;
    private final ComboBox<String> professionField;
    private final TextField statusField;
    private final TextField classField;
    
    public ProfessionCreator(ProfessionsController controller) {
        this.controller = controller;
        professionField = new ComboBox<>("PROFESJA");
        List<String> professionsNames = controller.getProfessionsNames();
        professionField.setItems(professionsNames);
    
        statusField = new TextField("STATUS");
        statusField.setWidth("150");
        statusField.setEnabled(false);
        
        classField = new TextField("KLASA");
        classField.setWidth("200px");
        classField.setEnabled(false);
    }
    
    public void updateStatus(String name) {
        statusField.setValue(controller.getStatus(name));
    }
    
    public void updateClass(String name) {
        classField.setValue(controller.getClassName(name));
    }
}
