/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group12.studentassistantconsoleappnb;

import java.util.Scanner;

/**
 *
 * @author sndemir
 */
public class MenuTestApp {
    
    private String choice = "null";
    
    public void menuTestApp() {
        while (!(choice.equals("E") || choice.equals("e"))) {
            Scanner obj = new Scanner(System.in);
            System.out.println("# ------------------------------------------------------------------------");
            testMenu();
            System.out.println("> ");
            choice = obj.nextLine();
            makeChoise();
        }
        System.out.println("# Test App is Ending");
        System.out.println("# ------------------------------------------------------------------------");
    }
    
    public void makeChoise() {
        if (choice.equals("1")) {
            System.out.println("# Test is Starting with Initialized App");
            Helper.Initializers();
            MenuTestAppOptions startTest = new MenuTestAppOptions();
            startTest.menuTestAppOptions();
        } else if (choice.equals("2")) {
            System.out.println("# Test is Starting with Uninitialized App");
            Helper.ForceUserToInitialize();
            MenuTestAppOptions startTest = new MenuTestAppOptions();
            startTest.menuTestAppOptions();
        }
    }
    
    public void testMenu() {
        System.out.println("# [1] Test with Initialized App");
        System.out.println("# [2] Test with Uninitialized App");
        System.out.println("# [M] Menu");
        System.out.println("# [E] Exit");
    }
}
