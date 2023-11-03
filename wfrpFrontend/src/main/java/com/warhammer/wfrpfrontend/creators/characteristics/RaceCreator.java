package com.warhammer.wfrpfrontend.creators.characteristics;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.textfield.TextField;
import com.warhammer.wfrpfrontend.controller.AppearanceController;
import com.warhammer.wfrpfrontend.controller.NamesController;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
public class RaceCreator {
    
    private final ComboBox<String> raceField;
    private final TextField nameText;
    
    public RaceCreator(AppearanceController appearanceController, NamesController namesController) {
        raceField = new ComboBox<>("RASA");
        List<String> racesNames = appearanceController.getRaces();
        raceField.setItems(racesNames);
        
        nameText = new TextField("IMIĘ");
        nameText.setWidth("300px");
        String name = "Grzegorz Mucha";
        nameText.setValue(name);
    }
}
