package com.group12.studentassistantconsoleappnb;

import java.util.Scanner;

public class MenuDemoApp {
    
    private String choice = "null";
    
    public void menuDemo() {
        while (!(choice.equals("E") || choice.equals("e"))) {
            Scanner obj = new Scanner(System.in);
            System.out.println("# ------------------------------------------------------------------------");
            demoMenu();
            System.out.println("> ");
            choice = obj.nextLine();
            makeChoise();
        }
        System.out.println("# Demo is Ending");
        System.out.println("# ------------------------------------------------------------------------");
    }
    
    public void makeChoise() {
        if (choice.equals("1")) {
            System.out.println("# Test App Screen");
            TestApp testApp = new TestApp();
            testApp.testApp();
        } else if (choice.equals("2")) {
            System.out.println("# Use App Screen");
            UseApp useApp = new UseApp();
            useApp.useApp();
        }
    }
    
    public void demoMenu() {
        System.out.println("# [1] Test App");
        System.out.println("# [2] Use App");
        System.out.println("# [M] Menu");
        System.out.println("# [E] Exit");
    }
}
