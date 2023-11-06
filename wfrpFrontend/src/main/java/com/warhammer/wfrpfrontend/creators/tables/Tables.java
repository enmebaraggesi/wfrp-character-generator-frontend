package com.warhammer.wfrpfrontend.creators.tables;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import org.vaadin.stefan.table.Table;

public abstract class Tables {
    
    public abstract HorizontalLayout produceTable();
    
    protected abstract Table makeTableAndHeaders();
    
    protected abstract void makeTableRow(Table table, int times);
    
    protected void makeNumberOfTableRows(Table table, int times) {
        for (int i = 0; i < times; i++) {
            makeTableRow(table, i);
        }
    }
}
