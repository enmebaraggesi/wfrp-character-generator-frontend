package com.warhammer.wfrpfrontend.creators.characteristics;

import com.vaadin.flow.component.combobox.ComboBox;
import com.warhammer.wfrpfrontend.controller.AppearanceController;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
public class HairColorsCreator {
    
    private final ComboBox<String> hairColorsField;
    private final List<String> humansHairColors;
    private final List<String> dwarfsHairColors;
    private final List<String> halflingsHairColors;
    private final List<String> highElvesHairColors;
    private final List<String> woodElvesHairColors;
    
    public HairColorsCreator(AppearanceController controller) {
        humansHairColors = controller.getHairColors("Człowiek");
        dwarfsHairColors = controller.getHairColors("Krasnolud");
        halflingsHairColors = controller.getHairColors("Niziołek");
        highElvesHairColors = controller.getHairColors("Wysoki elf");
        woodElvesHairColors = controller.getHairColors("Leśny elf");
        hairColorsField = new ComboBox<>("KOLOR WŁOSÓW");
    }
    
    public void setHairColorsByRace(String race) {
        switch (race) {
            default -> hairColorsField.setItems(humansHairColors);
            case "Krasnolud" -> hairColorsField.setItems(dwarfsHairColors);
            case "Niziołek" -> hairColorsField.setItems(halflingsHairColors);
            case "Wysoki elf" -> hairColorsField.setItems(highElvesHairColors);
            case "Leśny elf" -> hairColorsField.setItems(woodElvesHairColors);
        }
    }
}
