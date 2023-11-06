package com.warhammer.wfrpfrontend.creators.tables;

import java.util.List;

public abstract class SkillTableCreator {
    
    protected List<String> finalAttributes;
    
    protected String getFinalAttributeValue(String attribute) {
        switch (attribute) {
            default -> {
                return finalAttributes.get(0);
            }
            case "US" -> {
                return finalAttributes.get(1);
            }
            case "S" -> {
                return finalAttributes.get(2);
            }
            case "Wt" -> {
                return finalAttributes.get(3);
            }
            case "I" -> {
                return finalAttributes.get(4);
            }
            case "Zw" -> {
                return finalAttributes.get(5);
            }
            case "Zr" -> {
                return finalAttributes.get(6);
            }
            case "Int" -> {
                return finalAttributes.get(7);
            }
            case "SW" -> {
                return finalAttributes.get(8);
            }
            case "Ogd" -> {
                return finalAttributes.get(9);
            }
        }
    }
    
    public void setFinalAttributes(List<String> finalAttributes) {
        this.finalAttributes = finalAttributes;
    }
}
