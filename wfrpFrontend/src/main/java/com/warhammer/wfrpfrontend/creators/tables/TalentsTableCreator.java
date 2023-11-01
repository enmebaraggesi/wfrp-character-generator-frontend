package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

@Service
public class TalentsTableCreator {
    
    public HorizontalLayout produceTalentsTable() {
        Table talents = new Table();
        TableRow talentTitle = talents.addRow();
        TableHeaderCell talentTitleCell = talentTitle.addHeaderCell();
        talentTitleCell.setText("TALENTY");
        talentTitleCell.setColSpan(3);
        
        TableRow talentNames = talents.addRow();
        talentNames.addHeaderCell().setText("Talent");
        talentNames.addHeaderCell().setText("Poziom Talentu");
        talentNames.addHeaderCell().setText("Opis");
        
        TableRow talent1 = talents.addRow();
        TextField name1 = new TextField();
        talent1.addDataCell().add(name1);
        TextField level1 = new TextField();
        talent1.addDataCell().add(level1);
        TextField descr1 = new TextField();
        talent1.addDataCell().add(descr1);
        
        TableRow talent2 = talents.addRow();
        TextField name2 = new TextField();
        talent2.addDataCell().add(name2);
        TextField level2 = new TextField();
        talent2.addDataCell().add(level2);
        TextField descr2 = new TextField();
        talent2.addDataCell().add(descr2);
        
        TableRow talent3 = talents.addRow();
        TextField name3 = new TextField();
        talent3.addDataCell().add(name3);
        TextField level3 = new TextField();
        talent3.addDataCell().add(level3);
        TextField descr3 = new TextField();
        talent3.addDataCell().add(descr3);
        
        TableRow talent4 = talents.addRow();
        TextField name4 = new TextField();
        talent4.addDataCell().add(name4);
        TextField level4 = new TextField();
        talent4.addDataCell().add(level4);
        TextField descr4 = new TextField();
        talent4.addDataCell().add(descr4);
        
        TableRow talent5 = talents.addRow();
        TextField name5 = new TextField();
        talent5.addDataCell().add(name5);
        TextField level5 = new TextField();
        talent5.addDataCell().add(level5);
        TextField descr5 = new TextField();
        talent5.addDataCell().add(descr5);
        
        TableRow talent6 = talents.addRow();
        TextField name6 = new TextField();
        talent6.addDataCell().add(name6);
        TextField level6 = new TextField();
        talent6.addDataCell().add(level6);
        TextField descr6 = new TextField();
        talent6.addDataCell().add(descr6);
        
        TableRow talent7 = talents.addRow();
        TextField name7 = new TextField();
        talent7.addDataCell().add(name7);
        TextField level7 = new TextField();
        talent7.addDataCell().add(level7);
        TextField descr7 = new TextField();
        talent7.addDataCell().add(descr7);
        
        TableRow talent8 = talents.addRow();
        TextField name8 = new TextField();
        talent8.addDataCell().add(name8);
        TextField level8 = new TextField();
        talent8.addDataCell().add(level8);
        TextField descr8 = new TextField();
        talent8.addDataCell().add(descr8);
        
        return new HorizontalLayout(talents);
    }
}
