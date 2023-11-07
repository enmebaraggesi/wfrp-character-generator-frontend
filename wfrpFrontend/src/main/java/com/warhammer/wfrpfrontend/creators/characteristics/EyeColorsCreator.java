package com.warhammer.wfrpfrontend.creators.characteristics;

import com.vaadin.flow.component.combobox.ComboBox;
import com.warhammer.wfrpfrontend.controller.AppearanceController;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
public class EyeColorsCreator {
    
    private final ComboBox<String> eyeColorsField;
    private final List<String> humansEyeColors;
    private final List<String> dwarfsEyeColors;
    private final List<String> halflingsEyeColors;
    private final List<String> highElvesEyeColors;
    private final List<String> woodElvesEyeColors;
    
    public EyeColorsCreator(AppearanceController controller) {
        humansEyeColors = controller.getEyeColors("Człowiek");
        dwarfsEyeColors = controller.getEyeColors("Krasnolud");
        halflingsEyeColors = controller.getEyeColors("Niziołek");
        highElvesEyeColors = controller.getEyeColors("Wysoki elf");
        woodElvesEyeColors = controller.getEyeColors("Leśny elf");
        eyeColorsField = new ComboBox<>("KOLOR OCZU");
    }
    
    public void setEyeColorsByRace(String race) {
        switch (race) {
            default -> eyeColorsField.setItems(humansEyeColors);
            case "Krasnolud" -> eyeColorsField.setItems(dwarfsEyeColors);
            case "Niziołek" -> eyeColorsField.setItems(halflingsEyeColors);
            case "Wysoki elf" -> eyeColorsField.setItems(highElvesEyeColors);
            case "Leśny elf" -> eyeColorsField.setItems(woodElvesEyeColors);
        }
    }
    
    public String save() {
        return eyeColorsField.getValue();
    }
}
