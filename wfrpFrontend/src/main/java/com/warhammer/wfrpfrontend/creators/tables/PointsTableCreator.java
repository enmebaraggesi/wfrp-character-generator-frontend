package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

@Service
public class PointsTableCreator {
    
    public VerticalLayout producePointsTable() {
        Table points = new Table();
        TableRow pointsTitles = points.addRow();
        TableHeaderCell hero = pointsTitles.addHeaderCell();
        hero.setText("BOHATER");
        hero.setColSpan(2);
        TableHeaderCell destiny = pointsTitles.addHeaderCell();
        destiny.setText("PRZEZNACZENIE");
        destiny.setColSpan(2);
        TableRow pointsNames = points.addRow();
        pointsNames.addHeaderCell().setText("Punkty Bohatera");
        pointsNames.addHeaderCell().setText("Punkty Determinacji");
        pointsNames.addHeaderCell().setText("Punkty Przeznaczenia");
        pointsNames.addHeaderCell().setText("Punkty Szczęścia");
        TableRow pointsValues = points.addRow();
        TextField heroPoints = new TextField();
        pointsValues.addHeaderCell().add(heroPoints);
        TextField determinationPoints = new TextField();
        pointsValues.addHeaderCell().add(determinationPoints);
        TextField destinyPoints = new TextField();
        pointsValues.addHeaderCell().add(destinyPoints);
        TextField luckPoints = new TextField();
        pointsValues.addHeaderCell().add(luckPoints);
        
        Table speed = new Table();
        TableRow speedTitle = speed.addRow();
        TableHeaderCell speedName = speedTitle.addHeaderCell();
        speedName.setColSpan(6);
        speedName.setText("SZYBKOŚĆ");
        TableRow speedValue = speed.addRow();
        speedValue.addHeaderCell().setText("Szybkość:");
        TextField sz = new TextField();
        speedValue.addDataCell().add(sz);
        speedValue.addHeaderCell().setText("Chód:");
        TextField ch = new TextField();
        speedValue.addDataCell().add(ch);
        speedValue.addHeaderCell().setText("Bieg:");
        TextField bg = new TextField();
        speedValue.addDataCell().add(bg);
        return new VerticalLayout(points, speed);
    }
}
