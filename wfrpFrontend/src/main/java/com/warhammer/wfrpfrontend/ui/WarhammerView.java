package com.warhammer.wfrpfrontend.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.vaadin.stefan.table.Table;
import org.vaadin.stefan.table.TableRow;

@Route("")
public class WarhammerView extends VerticalLayout {
    
    public WarhammerView() {
        HorizontalLayout firstLine = getFirstLine();
        firstLine.setSizeFull();
        HorizontalLayout secondLine = getSecondLine();
        secondLine.setSizeFull();
        HorizontalLayout thirdLine = getThirdLine();
        thirdLine.setSizeFull();
        add(firstLine, secondLine, thirdLine);
    }
    
    private static HorizontalLayout getFirstLine() {
        Paragraph name = new Paragraph("Imię:");
        Paragraph race = new Paragraph("Rasa:");
        TextField nameText = new TextField();
        TextField raceText = new TextField();
        Button gRace = new Button("G");
        return new HorizontalLayout(Alignment.CENTER, name, nameText, race, raceText, gRace);
    }
    
    private static HorizontalLayout getSecondLine() {
        Paragraph age = new Paragraph("Wiek:");
        Paragraph height = new Paragraph("Wzrost:");
        Paragraph eyes = new Paragraph("Kolor oczu:");
        Paragraph hair = new Paragraph("Kolor włosów:");
        TextField ageText = new TextField();
        TextField heightText = new TextField();
        TextField eyesText = new TextField();
        TextField hairText = new TextField();
        Button gAge = new Button("G");
        Button gHeight = new Button("G");
        Button gEyes = new Button("G");
        Button gHair = new Button("G");
        return new HorizontalLayout(Alignment.CENTER, age, ageText, gAge,
                                    height, heightText, gHeight,
                                    eyes, eyesText, gEyes,
                                    hair, hairText, gHair);
    }
    
    private HorizontalLayout getThirdLine() {
        Table attributes = new Table();
        TableRow attrNames = attributes.addRow();
        attrNames.addHeaderCell().setText("WW");
        attrNames.addHeaderCell().setText("US");
        attrNames.addHeaderCell().setText("S");
        attrNames.addHeaderCell().setText("Wt");
        attrNames.addHeaderCell().setText("I");
        attrNames.addHeaderCell().setText("Zw");
        attrNames.addHeaderCell().setText("Zr");
        attrNames.addHeaderCell().setText("Int");
        TableRow attrCells = attributes.addRow();
        TextField ww = new TextField();
        attrCells.addDataCell().add(ww);
        TextField us = new TextField();
        attrCells.addDataCell().add(us);
        TextField s = new TextField();
        attrCells.addDataCell().add(s);
        TextField wt = new TextField();
        attrCells.addDataCell().add(wt);
        TextField i = new TextField();
        attrCells.addDataCell().add(i);
        TextField zw = new TextField();
        attrCells.addDataCell().add(zw);
        TextField zr = new TextField();
        attrCells.addDataCell().add(zr);
        TextField in = new TextField();
        attrCells.addDataCell().add(in);
        return new HorizontalLayout(attributes);
    }
}
