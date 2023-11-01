package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import org.springframework.stereotype.Service;
import org.vaadin.stefan.table.*;

@Service
public class AdvancedSkillsTableCreator {
    
    public HorizontalLayout produceAdvancedSkillsTable() {
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
        
        return new HorizontalLayout(advancedSkills);
    }
}
