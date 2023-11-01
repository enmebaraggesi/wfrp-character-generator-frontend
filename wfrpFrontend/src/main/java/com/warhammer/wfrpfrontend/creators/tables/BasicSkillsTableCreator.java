package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

@Service
public class BasicSkillsTableCreator {
    
    public HorizontalLayout produceBasicSkillsTables() {
        Table left = produceLeftHalfTable();
        Table right = produceRightHalfTable();
        return new HorizontalLayout(left, right);
    }
    
    private Table produceLeftHalfTable() {
        Table basicSkillsLeft = new Table();
        TableRow basicSkillsTitle = basicSkillsLeft.addRow();
        TableHeaderCell skillsTitle = basicSkillsTitle.addHeaderCell();
        skillsTitle.setColSpan(5);
        skillsTitle.setText("UMIEJĘTNOŚCI PODSTAWOWE");
        TableRow basicSkillsNames = basicSkillsLeft.addRow();
        basicSkillsNames.addHeaderCell().setText("Nazwa");
        TableHeaderCell attributeName = basicSkillsNames.addHeaderCell();
        attributeName.setColSpan(2);
        attributeName.setText("Cecha");
        basicSkillsNames.addHeaderCell().setText("Roz");
        basicSkillsNames.addHeaderCell().setText("Suma");
        
        TableRow leftTableRow1 = basicSkillsLeft.addRow();
        leftTableRow1.addHeaderCell().setText("Atletyka");
        leftTableRow1.addHeaderCell().setText("(Zw)");
        TextField l11 = new TextField();
        leftTableRow1.addDataCell().add(l11);
        TextField l12 = new TextField();
        leftTableRow1.addDataCell().add(l12);
        TextField l13 = new TextField();
        leftTableRow1.addDataCell().add(l13);
        
        TableRow leftTableRow2 = basicSkillsLeft.addRow();
        leftTableRow2.addHeaderCell().setText("Broń Biała (Podstawowa)");
        leftTableRow2.addHeaderCell().setText("(WW)");
        TextField l21 = new TextField();
        leftTableRow2.addDataCell().add(l21);
        TextField l22 = new TextField();
        leftTableRow2.addDataCell().add(l22);
        TextField l23 = new TextField();
        leftTableRow2.addDataCell().add(l23);
        
        TableRow leftTableRow3 = basicSkillsLeft.addRow();
        leftTableRow3.addHeaderCell().setText("Broń Biała (...)");
        leftTableRow3.addHeaderCell().setText("(WW)");
        TextField l31 = new TextField();
        leftTableRow3.addDataCell().add(l31);
        TextField l32 = new TextField();
        leftTableRow3.addDataCell().add(l32);
        TextField l33 = new TextField();
        leftTableRow3.addDataCell().add(l33);
        
        TableRow leftTableRow4 = basicSkillsLeft.addRow();
        leftTableRow4.addHeaderCell().setText("Charyzma");
        leftTableRow4.addHeaderCell().setText("(Ogd)");
        TextField l41 = new TextField();
        leftTableRow4.addDataCell().add(l41);
        TextField l42 = new TextField();
        leftTableRow4.addDataCell().add(l42);
        TextField l43 = new TextField();
        leftTableRow4.addDataCell().add(l43);
        
        TableRow leftTableRow5 = basicSkillsLeft.addRow();
        leftTableRow5.addHeaderCell().setText("Dowodzenie");
        leftTableRow5.addHeaderCell().setText("(Ogd)");
        TextField l51 = new TextField();
        leftTableRow5.addDataCell().add(l51);
        TextField l52 = new TextField();
        leftTableRow5.addDataCell().add(l52);
        TextField l53 = new TextField();
        leftTableRow5.addDataCell().add(l53);
        
        TableRow leftTableRow6 = basicSkillsLeft.addRow();
        leftTableRow6.addHeaderCell().setText("Hazard");
        leftTableRow6.addHeaderCell().setText("(Int)");
        TextField l61 = new TextField();
        leftTableRow6.addDataCell().add(l61);
        TextField l62 = new TextField();
        leftTableRow6.addDataCell().add(l62);
        TextField l63 = new TextField();
        leftTableRow6.addDataCell().add(l63);
        
        TableRow leftTableRow7 = basicSkillsLeft.addRow();
        leftTableRow7.addHeaderCell().setText("Intuicja");
        leftTableRow7.addHeaderCell().setText("(I)");
        TextField l71 = new TextField();
        leftTableRow7.addDataCell().add(l71);
        TextField l72 = new TextField();
        leftTableRow7.addDataCell().add(l72);
        TextField l73 = new TextField();
        leftTableRow7.addDataCell().add(l73);
        
        TableRow leftTableRow8 = basicSkillsLeft.addRow();
        leftTableRow8.addHeaderCell().setText("Jeździectwo");
        leftTableRow8.addHeaderCell().setText("(Zw)");
        TextField l81 = new TextField();
        leftTableRow8.addDataCell().add(l81);
        TextField l82 = new TextField();
        leftTableRow8.addDataCell().add(l82);
        TextField l83 = new TextField();
        leftTableRow8.addDataCell().add(l83);
        
        TableRow leftTableRow9 = basicSkillsLeft.addRow();
        leftTableRow9.addHeaderCell().setText("Mocna głowa");
        leftTableRow9.addHeaderCell().setText("(Wt)");
        TextField l91 = new TextField();
        leftTableRow9.addDataCell().add(l91);
        TextField l92 = new TextField();
        leftTableRow9.addDataCell().add(l92);
        TextField l93 = new TextField();
        leftTableRow9.addDataCell().add(l93);
        
        TableRow leftTableRow10 = basicSkillsLeft.addRow();
        leftTableRow10.addHeaderCell().setText("Nawigacja");
        leftTableRow10.addHeaderCell().setText("(I)");
        TextField l101 = new TextField();
        leftTableRow10.addDataCell().add(l101);
        TextField l102 = new TextField();
        leftTableRow10.addDataCell().add(l102);
        TextField l103 = new TextField();
        leftTableRow10.addDataCell().add(l103);
        
        TableRow leftTableRow11 = basicSkillsLeft.addRow();
        leftTableRow11.addHeaderCell().setText("Odporność");
        leftTableRow11.addHeaderCell().setText("(Wt)");
        TextField l111 = new TextField();
        leftTableRow11.addDataCell().add(l111);
        TextField l112 = new TextField();
        leftTableRow11.addDataCell().add(l112);
        TextField l113 = new TextField();
        leftTableRow11.addDataCell().add(l113);
        
        TableRow leftTableRow12 = basicSkillsLeft.addRow();
        leftTableRow12.addHeaderCell().setText("Opanowanie");
        leftTableRow12.addHeaderCell().setText("(SW)");
        TextField l121 = new TextField();
        leftTableRow12.addDataCell().add(l121);
        TextField l122 = new TextField();
        leftTableRow12.addDataCell().add(l122);
        TextField l123 = new TextField();
        leftTableRow12.addDataCell().add(l123);
        
        TableRow leftTableRow13 = basicSkillsLeft.addRow();
        leftTableRow13.addHeaderCell().setText("Oswajanie");
        leftTableRow13.addHeaderCell().setText("(SW)");
        TextField l131 = new TextField();
        leftTableRow13.addDataCell().add(l131);
        TextField l132 = new TextField();
        leftTableRow13.addDataCell().add(l132);
        TextField l133 = new TextField();
        leftTableRow13.addDataCell().add(l133);
        
        return basicSkillsLeft;
    }
    
    private Table produceRightHalfTable() {
        Table basicSkillsRight = new Table();
        TableRow basicSkillsTitle2 = basicSkillsRight.addRow();
        TableHeaderCell skillsTitle2 = basicSkillsTitle2.addHeaderCell();
        skillsTitle2.setColSpan(5);
        skillsTitle2.setText("UMIEJĘTNOŚCI PODSTAWOWE");
        TableRow basicSkillsNames2 = basicSkillsRight.addRow();
        basicSkillsNames2.addHeaderCell().setText("Nazwa");
        TableHeaderCell attributeName2 = basicSkillsNames2.addHeaderCell();
        attributeName2.setColSpan(2);
        attributeName2.setText("Cecha");
        basicSkillsNames2.addHeaderCell().setText("Roz");
        basicSkillsNames2.addHeaderCell().setText("Suma");
        
        TableRow rightTableRow1 = basicSkillsRight.addRow();
        rightTableRow1.addHeaderCell().setText("Percepcja");
        rightTableRow1.addHeaderCell().setText("(I)");
        TextField r11 = new TextField();
        rightTableRow1.addDataCell().add(r11);
        TextField r12 = new TextField();
        rightTableRow1.addDataCell().add(r12);
        TextField r13 = new TextField();
        rightTableRow1.addDataCell().add(r13);
        
        TableRow rightTableRow2 = basicSkillsRight.addRow();
        rightTableRow2.addHeaderCell().setText("Plotkowanie");
        rightTableRow2.addHeaderCell().setText("(Ogd)");
        TextField r21 = new TextField();
        rightTableRow2.addDataCell().add(r21);
        TextField r22 = new TextField();
        rightTableRow2.addDataCell().add(r22);
        TextField r23 = new TextField();
        rightTableRow2.addDataCell().add(r23);
        
        TableRow rightTableRow3 = basicSkillsRight.addRow();
        rightTableRow3.addHeaderCell().setText("Powożenie");
        rightTableRow3.addHeaderCell().setText("(Zw)");
        TextField r31 = new TextField();
        rightTableRow3.addDataCell().add(r31);
        TextField r32 = new TextField();
        rightTableRow3.addDataCell().add(r32);
        TextField r33 = new TextField();
        rightTableRow3.addDataCell().add(r33);
        
        TableRow rightTableRow4 = basicSkillsRight.addRow();
        rightTableRow4.addHeaderCell().setText("Przekupstwo");
        rightTableRow4.addHeaderCell().setText("(Ogd)");
        TextField r41 = new TextField();
        rightTableRow4.addDataCell().add(r41);
        TextField r42 = new TextField();
        rightTableRow4.addDataCell().add(r42);
        TextField r43 = new TextField();
        rightTableRow4.addDataCell().add(r43);
        
        TableRow rightTableRow5 = basicSkillsRight.addRow();
        rightTableRow5.addHeaderCell().setText("Skradanie");
        rightTableRow5.addHeaderCell().setText("(Zw)");
        TextField r51 = new TextField();
        rightTableRow5.addDataCell().add(r51);
        TextField r52 = new TextField();
        rightTableRow5.addDataCell().add(r52);
        TextField r53 = new TextField();
        rightTableRow5.addDataCell().add(r53);
        
        TableRow rightTableRow6 = basicSkillsRight.addRow();
        rightTableRow6.addHeaderCell().setText("Sztuka");
        rightTableRow6.addHeaderCell().setText("(Zr)");
        TextField r61 = new TextField();
        rightTableRow6.addDataCell().add(r61);
        TextField r62 = new TextField();
        rightTableRow6.addDataCell().add(r62);
        TextField r63 = new TextField();
        rightTableRow6.addDataCell().add(r63);
        
        TableRow rightTableRow7 = basicSkillsRight.addRow();
        rightTableRow7.addHeaderCell().setText("Sztuka Przetrwania");
        rightTableRow7.addHeaderCell().setText("(Int)");
        TextField r71 = new TextField();
        rightTableRow7.addDataCell().add(r71);
        TextField r72 = new TextField();
        rightTableRow7.addDataCell().add(r72);
        TextField r73 = new TextField();
        rightTableRow7.addDataCell().add(r73);
        
        TableRow rightTableRow8 = basicSkillsRight.addRow();
        rightTableRow8.addHeaderCell().setText("Targowanie");
        rightTableRow8.addHeaderCell().setText("(Ogd)");
        TextField r81 = new TextField();
        rightTableRow8.addDataCell().add(r81);
        TextField r82 = new TextField();
        rightTableRow8.addDataCell().add(r82);
        TextField r83 = new TextField();
        rightTableRow8.addDataCell().add(r83);
        
        TableRow rightTableRow9 = basicSkillsRight.addRow();
        rightTableRow9.addHeaderCell().setText("Unik");
        rightTableRow9.addHeaderCell().setText("(Zw)");
        TextField r91 = new TextField();
        rightTableRow9.addDataCell().add(r91);
        TextField r92 = new TextField();
        rightTableRow9.addDataCell().add(r92);
        TextField r93 = new TextField();
        rightTableRow9.addDataCell().add(r93);
        
        TableRow rightTableRow10 = basicSkillsRight.addRow();
        rightTableRow10.addHeaderCell().setText("Wioślarstwo");
        rightTableRow10.addHeaderCell().setText("(S)");
        TextField r101 = new TextField();
        rightTableRow10.addDataCell().add(r101);
        TextField r102 = new TextField();
        rightTableRow10.addDataCell().add(r102);
        TextField r103 = new TextField();
        rightTableRow10.addDataCell().add(r103);
        
        TableRow rightTableRow11 = basicSkillsRight.addRow();
        rightTableRow11.addHeaderCell().setText("Wspinaczka");
        rightTableRow11.addHeaderCell().setText("(S)");
        TextField r111 = new TextField();
        rightTableRow11.addDataCell().add(r111);
        TextField r112 = new TextField();
        rightTableRow11.addDataCell().add(r112);
        TextField r113 = new TextField();
        rightTableRow11.addDataCell().add(r113);
        
        TableRow rightTableRow12 = basicSkillsRight.addRow();
        rightTableRow12.addHeaderCell().setText("Występy");
        rightTableRow12.addHeaderCell().setText("(Ogd)");
        TextField r121 = new TextField();
        rightTableRow12.addDataCell().add(r121);
        TextField r122 = new TextField();
        rightTableRow12.addDataCell().add(r122);
        TextField r123 = new TextField();
        rightTableRow12.addDataCell().add(r123);
        
        TableRow rightTableRow13 = basicSkillsRight.addRow();
        rightTableRow13.addHeaderCell().setText("Zastraszanie");
        rightTableRow13.addHeaderCell().setText("(S)");
        TextField r131 = new TextField();
        rightTableRow13.addDataCell().add(r131);
        TextField r132 = new TextField();
        rightTableRow13.addDataCell().add(r132);
        TextField r133 = new TextField();
        rightTableRow13.addDataCell().add(r133);
        
        return basicSkillsRight;
    }
}
