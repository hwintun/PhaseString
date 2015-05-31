/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phasestring;

/**
 *
 * @author HWT
 */
public class PhaseString {    
    
    public final String GROUP = "G";
    
    public final String USER = "U";

    private String type;
    
    private String value;    
    
    public void phaseString(String input) {
        
        String s2 = input.substring(input.indexOf("[") + 1, input.lastIndexOf("]"));
        
        if (s2.startsWith(GROUP)) {
            this.type = GROUP;
        } else {
            this.type = USER;
        }
        
        this.value = s2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
