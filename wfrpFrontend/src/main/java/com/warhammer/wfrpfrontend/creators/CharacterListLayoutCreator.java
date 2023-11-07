package com.warhammer.wfrpfrontend.creators;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.*;
import com.warhammer.wfrpfrontend.controller.CharacterSheetController;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Getter
@RequiredArgsConstructor
public class CharacterListLayoutCreator {
    
    private final CharacterSheetController controller;
    private Button saveButton;
    private Button loadButton;
    private ComboBox<String> characterSheets;
    
    public VerticalLayout prepareCharacterListLayout() {
        makeCharacterSheets();
        makeSaveButton();
        makeLoadButton();
        HorizontalLayout horizontalLayout = new HorizontalLayout(characterSheets, saveButton, loadButton);
        horizontalLayout.setAlignItems(FlexComponent.Alignment.BASELINE);
        return new VerticalLayout(FlexComponent.Alignment.CENTER, horizontalLayout);
    }
    
    private void makeCharacterSheets() {
        characterSheets = new ComboBox<>("Karty postaci");
        characterSheets.setWidth("350px");
        characterSheets.setItems(controller.getAllCharacterSheetNames());
    }
    
    private void makeSaveButton() {
        saveButton = new Button();
        saveButton.setText("ZAPISZ");
        saveButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
    }
    
    private void makeLoadButton() {
        loadButton = new Button();
        loadButton.setText("WCZYTAJ");
        loadButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
    }
    
    
}
