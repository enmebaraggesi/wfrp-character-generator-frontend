package com.warhammer.wfrpfrontend.creators.characteristics;

import com.vaadin.flow.component.combobox.ComboBox;
import com.warhammer.wfrpfrontend.controller.AppearanceController;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
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
        setHairColorsByRace(humansHairColors);
    }
    
    public void setHairColorsByRace(List<String> hairColors) {
        hairColorsField.setItems(hairColors);
    }
}
