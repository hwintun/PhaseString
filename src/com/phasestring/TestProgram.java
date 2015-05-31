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
public class TestProgram {
    public static void main(String[] args) {
        PhaseString ps = new PhaseString();
        ps.phaseString("Group Name [G001]");
        System.out.println(ps.getType());
        System.out.println(ps.getValue());
    }
}
