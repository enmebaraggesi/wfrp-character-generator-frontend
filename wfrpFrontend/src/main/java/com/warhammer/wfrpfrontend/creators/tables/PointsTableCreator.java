package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import lombok.Getter;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

import java.util.*;

@Service
@Getter
public class PointsTableCreator {
    
    private final List<TextField> heroPointsTextFields = new ArrayList<>();
    private final List<TextField> destinyPointsTextFields = new ArrayList<>();
    private TextField speedTextField;
    
    public HorizontalLayout producePointsTable() {
        Table points = getPoints();
        Table speed = getSpeed();
        return new HorizontalLayout(FlexComponent.Alignment.CENTER, points, speed);
    }
    
    private Table getPoints() {
        Random random = new Random();
        Table points = new Table();
        TableRow pointsTitles1 = points.addRow();
        TableHeaderCell hero = pointsTitles1.addHeaderCell();
        hero.setText("BOHATER");
        hero.setColSpan(2);
        
        TableRow pointsNames1 = points.addRow();
        pointsNames1.addHeaderCell().setText("Punkty Bohatera");
        pointsNames1.addHeaderCell().setText("Punkty Determinacji");
        
        TableRow pointsValues1 = points.addRow();
        TextField heroPoints = new TextField();
        heroPoints.setWidth("50px");
        heroPoints.setValue(String.valueOf(random.nextInt(4)));
        heroPointsTextFields.add(heroPoints);
        TextField determinationPoints = new TextField();
        determinationPoints.setWidth("50px");
        determinationPoints.setValue(String.valueOf(random.nextInt(4)));
        heroPointsTextFields.add(determinationPoints);
        pointsValues1.addHeaderCells(heroPoints, determinationPoints);
        
        TableRow pointsTitles2 = points.addRow();
        TableHeaderCell destiny = pointsTitles2.addHeaderCell();
        destiny.setText("PRZEZNACZENIE");
        destiny.setColSpan(2);
        
        TableRow pointsNames2 = points.addRow();
        pointsNames2.addHeaderCell().setText("Punkty Przeznaczenia");
        pointsNames2.addHeaderCell().setText("Punkty Szczęścia");
        
        TableRow pointsValues2 = points.addRow();
        TextField destinyPoints = new TextField();
        destinyPoints.setWidth("50px");
        destinyPoints.setEnabled(false);
        destinyPoints.setValue(heroPoints.getValue());
        destinyPointsTextFields.add(destinyPoints);
        TextField luckPoints = new TextField();
        luckPoints.setWidth("50px");
        luckPoints.setEnabled(false);
        luckPoints.setValue(determinationPoints.getValue());
        destinyPointsTextFields.add(luckPoints);
        pointsValues2.addHeaderCells(destinyPoints, luckPoints);
        
        heroPoints.addValueChangeListener(event -> destinyPoints.setValue(heroPoints.getValue()));
        determinationPoints.addValueChangeListener(event -> luckPoints.setValue(determinationPoints.getValue()));
        return points;
    }
    
    private Table getSpeed() {
        int baseSpeed = 4;
        Table speed = new Table();
        TableRow speedHeaderRow = speed.addRow();
        TableHeaderCell speedHeader = speedHeaderRow.addHeaderCell();
        speedHeader.setColSpan(6);
        speedHeader.setText("SZYBKOŚĆ");
        
        TableRow speedRow = speed.addRow();
        speedRow.addHeaderCell().setText("Szybkość:");
        TextField sz = new TextField();
        sz.setWidth("50px");
        sz.setEnabled(false);
        sz.setValue(String.valueOf(baseSpeed));
        speedRow.addDataCell().add(sz);
        speedTextField = sz;
        speedRow.addHeaderCell().setText("Chód:");
        TextField ch = new TextField();
        ch.setWidth("50px");
        ch.setEnabled(false);
        ch.setValue(String.valueOf(baseSpeed * 2));
        speedRow.addDataCell().add(ch);
        speedRow.addHeaderCell().setText("Bieg:");
        TextField bg = new TextField();
        bg.setWidth("50px");
        bg.setEnabled(false);
        bg.setValue(String.valueOf(baseSpeed * 4));
        speedRow.addDataCell().add(bg);
        return speed;
    }
}
