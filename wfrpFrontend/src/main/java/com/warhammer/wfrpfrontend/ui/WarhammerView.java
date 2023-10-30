package com.warhammer.wfrpfrontend.ui;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.warhammer.wfrpfrontend.creators.TableCreator;

@Route("")
public class WarhammerView extends VerticalLayout {
    
    public WarhammerView(TableCreator tableCreator) {
        VerticalLayout firstSection = getFirstSection();
        HorizontalLayout secondSection = tableCreator.getAttributesAndPointsTable();
        VerticalLayout thirdSection = tableCreator.getPointsTable();
        HorizontalLayout fourthSection = tableCreator.getBasicSkillsTables();
        HorizontalLayout fifthSection = tableCreator.getAdvancedSkillsAndTalentsTables();
        HorizontalLayout sixthSection = tableCreator.getWeaponsTable();
        HorizontalLayout seventhSection = tableCreator.getArmorsTable();
        add(firstSection, secondSection, thirdSection, fourthSection, fifthSection, sixthSection, seventhSection);
    }
    
    private static VerticalLayout getFirstSection() {
        Paragraph name = new Paragraph("Imię:");
        Paragraph race = new Paragraph("Rasa:");
        TextField nameText = new TextField();
        TextField raceText = new TextField();
        HorizontalLayout upperSide = new HorizontalLayout(Alignment.CENTER, name, nameText, race, raceText);
        
        Paragraph age = new Paragraph("Wiek:");
        TextField ageText = new TextField();
        Paragraph height = new Paragraph("Wzrost:");
        TextField heightText = new TextField();
        Paragraph eyes = new Paragraph("Kolor oczu:");
        TextField eyesText = new TextField();
        Paragraph hair = new Paragraph("Kolor włosów:");
        TextField hairText = new TextField();
        HorizontalLayout lowerSide = new HorizontalLayout(Alignment.CENTER, age, ageText, height, heightText, eyes, eyesText,
                                                          hair, hairText);
        return new VerticalLayout(upperSide, lowerSide);
    }
}
