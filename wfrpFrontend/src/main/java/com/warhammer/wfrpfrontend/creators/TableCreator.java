package com.warhammer.wfrpfrontend.creators;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

@Service
public class TableCreator {
    
    public HorizontalLayout getAttributesAndPointsTable() {
        Table attributes = new Table();
        TableRow attrTitles = attributes.addRow();
        TableHeaderCell attr = attrTitles.addHeaderCell();
        attr.setText("CECHY");
        attr.setColSpan(11);
        TableRow attrNames = attributes.addRow();
        attrNames.addHeaderCell();
        attrNames.addHeaderCell().setText("WW");
        attrNames.addHeaderCell().setText("US");
        attrNames.addHeaderCell().setText("S");
        attrNames.addHeaderCell().setText("Wt");
        attrNames.addHeaderCell().setText("I");
        attrNames.addHeaderCell().setText("Zw");
        attrNames.addHeaderCell().setText("Zr");
        attrNames.addHeaderCell().setText("Int");
        attrNames.addHeaderCell().setText("SW");
        attrNames.addHeaderCell().setText("Ogd");
        TableRow attrCellsStart = attributes.addRow();
        attrCellsStart.addHeaderCell().setText("Początkowe");
        TextField wwStart = new TextField();
        attrCellsStart.addDataCell().add(wwStart);
        TextField usStart = new TextField();
        attrCellsStart.addDataCell().add(usStart);
        TextField sStart = new TextField();
        attrCellsStart.addDataCell().add(sStart);
        TextField wtStart = new TextField();
        attrCellsStart.addDataCell().add(wtStart);
        TextField iStart = new TextField();
        attrCellsStart.addDataCell().add(iStart);
        TextField zwStart = new TextField();
        attrCellsStart.addDataCell().add(zwStart);
        TextField zrStart = new TextField();
        attrCellsStart.addDataCell().add(zrStart);
        TextField inStart = new TextField();
        attrCellsStart.addDataCell().add(inStart);
        TextField swStart = new TextField();
        attrCellsStart.addDataCell().add(swStart);
        TextField ogdStart = new TextField();
        attrCellsStart.addDataCell().add(ogdStart);
        TableRow attrCellsDevelop = attributes.addRow();
        attrCellsDevelop.addHeaderCell().setText("Rozwinięcia");
        TextField wwDevelop = new TextField();
        attrCellsDevelop.addDataCell().add(wwDevelop);
        TextField usDevelop = new TextField();
        attrCellsDevelop.addDataCell().add(usDevelop);
        TextField sDevelop = new TextField();
        attrCellsDevelop.addDataCell().add(sDevelop);
        TextField wtDevelop = new TextField();
        attrCellsDevelop.addDataCell().add(wtDevelop);
        TextField iDevelop = new TextField();
        attrCellsDevelop.addDataCell().add(iDevelop);
        TextField zwDevelop = new TextField();
        attrCellsDevelop.addDataCell().add(zwDevelop);
        TextField zrDevelop = new TextField();
        attrCellsDevelop.addDataCell().add(zrDevelop);
        TextField inDevelop = new TextField();
        attrCellsDevelop.addDataCell().add(inDevelop);
        TextField swDevelop = new TextField();
        attrCellsDevelop.addDataCell().add(swDevelop);
        TextField ogdDevelop = new TextField();
        attrCellsDevelop.addDataCell().add(ogdDevelop);
        TableRow attrCellsFinal = attributes.addRow();
        attrCellsFinal.addHeaderCell().setText("Aktualne");
        TextField wwFinal = new TextField();
        attrCellsFinal.addDataCell().add(wwFinal);
        TextField usFinal = new TextField();
        attrCellsFinal.addDataCell().add(usFinal);
        TextField sFinal = new TextField();
        attrCellsFinal.addDataCell().add(sFinal);
        TextField wtFinal = new TextField();
        attrCellsFinal.addDataCell().add(wtFinal);
        TextField iFinal = new TextField();
        attrCellsFinal.addDataCell().add(iFinal);
        TextField zwFinal = new TextField();
        attrCellsFinal.addDataCell().add(zwFinal);
        TextField zrFinal = new TextField();
        attrCellsFinal.addDataCell().add(zrFinal);
        TextField inFinal = new TextField();
        attrCellsFinal.addDataCell().add(inFinal);
        TextField swFinal = new TextField();
        attrCellsFinal.addDataCell().add(swFinal);
        TextField ogdFinal = new TextField();
        attrCellsFinal.addDataCell().add(ogdFinal);
        return new HorizontalLayout(attributes);
    }
    
    public VerticalLayout getPointsTable() {
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
    
    public HorizontalLayout getBasicSkillsTables() {
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
        
        return new HorizontalLayout(basicSkillsLeft, basicSkillsRight);
    }
    
    public HorizontalLayout getAdvancedSkillsAndTalentsTables() {
        Table advancedSkills = new Table();
        TableRow advancedSkillsTitle = advancedSkills.addRow();
        TableHeaderCell skillsTitle = advancedSkillsTitle.addHeaderCell();
        skillsTitle.setColSpan(5);
        skillsTitle.setText("UMIEJĘTNOŚCI ZAAWANSOWANE");
        TableRow advancedSkillsName = advancedSkills.addRow();
        advancedSkillsName.addHeaderCell().setText("Nazwa");
        TableHeaderCell attributeName = advancedSkillsName.addHeaderCell();
        attributeName.setColSpan(2);
        attributeName.setText("Cecha");
        advancedSkillsName.addHeaderCell().setText("Roz");
        advancedSkillsName.addHeaderCell().setText("Suma");
        
        TableRow tableRow1 = advancedSkills.addRow();
        TextField t11 = new TextField();
        tableRow1.addDataCell().add(t11);
        TextField t12 = new TextField();
        tableRow1.addDataCell().add(t12);
        TextField t13 = new TextField();
        tableRow1.addDataCell().add(t13);
        TextField t14 = new TextField();
        tableRow1.addDataCell().add(t14);
        TextField t15 = new TextField();
        tableRow1.addDataCell().add(t15);
        
        TableRow tableRow2 = advancedSkills.addRow();
        TextField t21 = new TextField();
        tableRow2.addDataCell().add(t21);
        TextField t22 = new TextField();
        tableRow2.addDataCell().add(t22);
        TextField t23 = new TextField();
        tableRow2.addDataCell().add(t23);
        TextField t24 = new TextField();
        tableRow2.addDataCell().add(t24);
        TextField t25 = new TextField();
        tableRow2.addDataCell().add(t25);
        
        TableRow tableRow3 = advancedSkills.addRow();
        TextField t31 = new TextField();
        tableRow3.addDataCell().add(t31);
        TextField t32 = new TextField();
        tableRow3.addDataCell().add(t32);
        TextField t33 = new TextField();
        tableRow3.addDataCell().add(t33);
        TextField t34 = new TextField();
        tableRow3.addDataCell().add(t34);
        TextField t35 = new TextField();
        tableRow3.addDataCell().add(t35);
        
        TableRow tableRow4 = advancedSkills.addRow();
        TextField t41 = new TextField();
        tableRow4.addDataCell().add(t41);
        TextField t42 = new TextField();
        tableRow4.addDataCell().add(t42);
        TextField t43 = new TextField();
        tableRow4.addDataCell().add(t43);
        TextField t44 = new TextField();
        tableRow4.addDataCell().add(t44);
        TextField t45 = new TextField();
        tableRow4.addDataCell().add(t45);
        
        TableRow tableRow5 = advancedSkills.addRow();
        TextField t51 = new TextField();
        tableRow5.addDataCell().add(t51);
        TextField t52 = new TextField();
        tableRow5.addDataCell().add(t52);
        TextField t53 = new TextField();
        tableRow5.addDataCell().add(t53);
        TextField t54 = new TextField();
        tableRow5.addDataCell().add(t54);
        TextField t55 = new TextField();
        tableRow5.addDataCell().add(t55);
        
        TableRow tableRow6 = advancedSkills.addRow();
        TextField t61 = new TextField();
        tableRow6.addDataCell().add(t61);
        TextField t62 = new TextField();
        tableRow6.addDataCell().add(t62);
        TextField t63 = new TextField();
        tableRow6.addDataCell().add(t63);
        TextField t64 = new TextField();
        tableRow6.addDataCell().add(t64);
        TextField t65 = new TextField();
        tableRow6.addDataCell().add(t65);
        
        TableRow tableRow7 = advancedSkills.addRow();
        TextField t71 = new TextField();
        tableRow7.addDataCell().add(t71);
        TextField t72 = new TextField();
        tableRow7.addDataCell().add(t72);
        TextField t73 = new TextField();
        tableRow7.addDataCell().add(t73);
        TextField t74 = new TextField();
        tableRow7.addDataCell().add(t74);
        TextField t75 = new TextField();
        tableRow7.addDataCell().add(t75);
        
        TableRow tableRow8 = advancedSkills.addRow();
        TextField t81 = new TextField();
        tableRow8.addDataCell().add(t81);
        TextField t82 = new TextField();
        tableRow8.addDataCell().add(t82);
        TextField t83 = new TextField();
        tableRow8.addDataCell().add(t83);
        TextField t84 = new TextField();
        tableRow8.addDataCell().add(t84);
        TextField t85 = new TextField();
        tableRow8.addDataCell().add(t85);
        
        TableRow tableRow9 = advancedSkills.addRow();
        TextField t91 = new TextField();
        tableRow9.addDataCell().add(t91);
        TextField t92 = new TextField();
        tableRow9.addDataCell().add(t92);
        TextField t93 = new TextField();
        tableRow9.addDataCell().add(t93);
        TextField t94 = new TextField();
        tableRow9.addDataCell().add(t94);
        TextField t95 = new TextField();
        tableRow9.addDataCell().add(t95);
        
        TableRow tableRow10 = advancedSkills.addRow();
        TextField t101 = new TextField();
        tableRow10.addDataCell().add(t101);
        TextField t102 = new TextField();
        tableRow10.addDataCell().add(t102);
        TextField t103 = new TextField();
        tableRow10.addDataCell().add(t103);
        TextField t104 = new TextField();
        tableRow10.addDataCell().add(t104);
        TextField t105 = new TextField();
        tableRow10.addDataCell().add(t105);
        
        TableRow tableRow11 = advancedSkills.addRow();
        TextField t111 = new TextField();
        tableRow11.addDataCell().add(t111);
        TextField t112 = new TextField();
        tableRow11.addDataCell().add(t112);
        TextField t113 = new TextField();
        tableRow11.addDataCell().add(t113);
        TextField t114 = new TextField();
        tableRow11.addDataCell().add(t114);
        TextField t115 = new TextField();
        tableRow11.addDataCell().add(t115);
        
        TableRow tableRow12 = advancedSkills.addRow();
        TextField t121 = new TextField();
        tableRow12.addDataCell().add(t121);
        TextField t122 = new TextField();
        tableRow12.addDataCell().add(t122);
        TextField t123 = new TextField();
        tableRow12.addDataCell().add(t123);
        TextField t124 = new TextField();
        tableRow12.addDataCell().add(t124);
        TextField t125 = new TextField();
        tableRow12.addDataCell().add(t125);
        
        TableRow tableRow13 = advancedSkills.addRow();
        TextField t131 = new TextField();
        tableRow13.addDataCell().add(t131);
        TextField t132 = new TextField();
        tableRow13.addDataCell().add(t132);
        TextField t133 = new TextField();
        tableRow13.addDataCell().add(t133);
        TextField t134 = new TextField();
        tableRow13.addDataCell().add(t134);
        TextField t135 = new TextField();
        tableRow13.addDataCell().add(t135);
        
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
        
        return new HorizontalLayout(advancedSkills, talents);
    }
    
    public HorizontalLayout getWeaponsTable() {
        Table weaponry = new Table();
        TableRow tableName = weaponry.addRow();
        TableHeaderCell tableNameCell = tableName.addHeaderCell();
        tableNameCell.setText("BROŃ");
        tableNameCell.setColSpan(6);
        
        TableRow titlesRow = weaponry.addRow();
        titlesRow.addHeaderCell().setText("Nazwa");
        titlesRow.addHeaderCell().setText("Kategoria");
        titlesRow.addHeaderCell().setText("Waga");
        titlesRow.addHeaderCell().setText("Zasięg");
        titlesRow.addHeaderCell().setText("Obrażenia");
        titlesRow.addHeaderCell().setText("Cechy");
        
        TableRow row1 = weaponry.addRow();
        TextField name1 = new TextField();
        row1.addDataCell().add(name1);
        TextField cat1 = new TextField();
        row1.addDataCell().add(cat1);
        TextField weight1 = new TextField();
        row1.addDataCell().add(weight1);
        TextField range1 = new TextField();
        row1.addDataCell().add(range1);
        TextField damage1 = new TextField();
        row1.addDataCell().add(damage1);
        TextField traits1 = new TextField();
        row1.addDataCell().add(traits1);
        
        TableRow row2 = weaponry.addRow();
        TextField name2 = new TextField();
        row2.addDataCell().add(name2);
        TextField cat2 = new TextField();
        row2.addDataCell().add(cat2);
        TextField weight2 = new TextField();
        row2.addDataCell().add(weight2);
        TextField range2 = new TextField();
        row2.addDataCell().add(range2);
        TextField damage2 = new TextField();
        row2.addDataCell().add(damage2);
        TextField traits2 = new TextField();
        row2.addDataCell().add(traits2);
        
        TableRow row3 = weaponry.addRow();
        TextField name3 = new TextField();
        row3.addDataCell().add(name3);
        TextField cat3 = new TextField();
        row3.addDataCell().add(cat3);
        TextField weight3 = new TextField();
        row3.addDataCell().add(weight3);
        TextField range3 = new TextField();
        row3.addDataCell().add(range3);
        TextField damage3 = new TextField();
        row3.addDataCell().add(damage3);
        TextField traits3 = new TextField();
        row3.addDataCell().add(traits3);
        
        TableRow row4 = weaponry.addRow();
        TextField name4 = new TextField();
        row4.addDataCell().add(name4);
        TextField cat4 = new TextField();
        row4.addDataCell().add(cat4);
        TextField weight4 = new TextField();
        row4.addDataCell().add(weight4);
        TextField range4 = new TextField();
        row4.addDataCell().add(range4);
        TextField damage4 = new TextField();
        row4.addDataCell().add(damage4);
        TextField traits4 = new TextField();
        row4.addDataCell().add(traits4);
        
        return new HorizontalLayout(weaponry);
    }
    
    public HorizontalLayout getArmorsTable() {
        Table armory = new Table();
        TableRow tableName = armory.addRow();
        TableHeaderCell tableNameCell = tableName.addHeaderCell();
        tableNameCell.setText("PANCERZ");
        tableNameCell.setColSpan(5);
        
        TableRow titlesRow = armory.addRow();
        titlesRow.addHeaderCell().setText("Nazwa");
        titlesRow.addHeaderCell().setText("Lokacja");
        titlesRow.addHeaderCell().setText("Waga");
        titlesRow.addHeaderCell().setText("Punkty Pancerza");
        titlesRow.addHeaderCell().setText("Cechy");
        
        TableRow row1 = armory.addRow();
        TextField name1 = new TextField();
        row1.addDataCell().add(name1);
        TextField loc1 = new TextField();
        row1.addDataCell().add(loc1);
        TextField weight1 = new TextField();
        row1.addDataCell().add(weight1);
        TextField points1 = new TextField();
        row1.addDataCell().add(points1);
        TextField traits1 = new TextField();
        row1.addDataCell().add(traits1);
        
        TableRow row2 = armory.addRow();
        TextField name2 = new TextField();
        row2.addDataCell().add(name2);
        TextField loc2 = new TextField();
        row2.addDataCell().add(loc2);
        TextField weight2 = new TextField();
        row2.addDataCell().add(weight2);
        TextField points2 = new TextField();
        row2.addDataCell().add(points2);
        TextField traits2 = new TextField();
        row2.addDataCell().add(traits2);
        
        TableRow row3 = armory.addRow();
        TextField name3 = new TextField();
        row3.addDataCell().add(name3);
        TextField loc3 = new TextField();
        row3.addDataCell().add(loc3);
        TextField weight3 = new TextField();
        row3.addDataCell().add(weight3);
        TextField points3 = new TextField();
        row3.addDataCell().add(points3);
        TextField traits3 = new TextField();
        row3.addDataCell().add(traits3);
        
        TableRow row4 = armory.addRow();
        TextField name4 = new TextField();
        row4.addDataCell().add(name4);
        TextField loc4 = new TextField();
        row4.addDataCell().add(loc4);
        TextField weight4 = new TextField();
        row4.addDataCell().add(weight4);
        TextField points4 = new TextField();
        row4.addDataCell().add(points4);
        TextField traits4 = new TextField();
        row4.addDataCell().add(traits4);
        
        TableRow row5 = armory.addRow();
        TextField name5 = new TextField();
        row5.addDataCell().add(name5);
        TextField loc5 = new TextField();
        row5.addDataCell().add(loc5);
        TextField weight5 = new TextField();
        row5.addDataCell().add(weight5);
        TextField points5 = new TextField();
        row5.addDataCell().add(points5);
        TextField traits5 = new TextField();
        row5.addDataCell().add(traits5);
        
        return new HorizontalLayout(armory);
    }
}
