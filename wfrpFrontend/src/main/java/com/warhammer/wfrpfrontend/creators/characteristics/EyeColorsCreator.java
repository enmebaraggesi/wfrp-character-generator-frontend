package com.warhammer.wfrpfrontend.creators.characteristics;

import com.vaadin.flow.component.combobox.ComboBox;
import com.warhammer.wfrpfrontend.controller.AppearanceController;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
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
        setEyeColorsByRace(humansEyeColors);
    }
    
    public void setEyeColorsByRace(List<String> eyesColors) {
        eyeColorsField.setItems(eyesColors);
    }
}
