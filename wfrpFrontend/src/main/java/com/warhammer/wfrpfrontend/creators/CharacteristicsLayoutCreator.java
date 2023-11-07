package com.warhammer.wfrpfrontend.creators;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.*;
import com.warhammer.wfrpfrontend.creators.characteristics.*;
import com.warhammer.wfrpfrontend.dto.character.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@Service
@RequiredArgsConstructor
public class CharacteristicsLayoutCreator {
    
    private final RaceCreator raceCreator;
    private final EyeColorsCreator eyeColorsCreator;
    private final HairColorsCreator hairColorsCreator;
    private final ProfessionCreator professionCreator;
    private final AgeHeightCreator ageHeightCreator;
    
    public VerticalLayout prepareCharacterDescription() {
        HorizontalLayout nameAndRace = raceCreator.produceNameAndRaceLayout();
        HorizontalLayout proffesionFields = professionCreator.produceProfessionFields();
        HorizontalLayout upperSide =
                new HorizontalLayout(FlexComponent.Alignment.CENTER, nameAndRace, proffesionFields);
        HorizontalLayout andHeightFields = ageHeightCreator.produceAgeAndHeightFields();
        ComboBox<String> eyeColorsField = eyeColorsCreator.getEyeColorsField();
        ComboBox<String> hairColorsField = hairColorsCreator.getHairColorsField();
        HorizontalLayout lowerSide =
                new HorizontalLayout(FlexComponent.Alignment.CENTER, andHeightFields, eyeColorsField, hairColorsField);
        return new VerticalLayout(FlexComponent.Alignment.CENTER, upperSide, lowerSide);
    }
    
    public SheetCharacteristics save() {
        SheetNameAndRace nameAndRace = raceCreator.save();
        String eyes = eyeColorsCreator.save();
        String hair = hairColorsCreator.save();
        String profession = professionCreator.save();
        SheetAgeAndHeight ageAndHeight = ageHeightCreator.save();
        return new SheetCharacteristics(nameAndRace.name(),
                                        nameAndRace.race(),
                                        eyes,
                                        hair,
                                        profession,
                                        ageAndHeight.age(),
                                        ageAndHeight.height());
    }
}
