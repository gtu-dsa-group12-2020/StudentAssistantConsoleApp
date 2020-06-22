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
public class MenuUseApp {
    
    private String choice = "null";
    
    public void menuUseApp() {
        while (!(choice.equals("E") || choice.equals("e"))) {
            Scanner obj = new Scanner(System.in);
            System.out.println("# ------------------------------------------------------------------------");
            signMenu();
            System.out.println("> ");
            choice = obj.nextLine();
            makeChoise();
        }
        System.out.println("# Use App is Ending");
        System.out.println("# ------------------------------------------------------------------------");
    }
    
    public void makeChoise() {
        if (choice.equals("1")) {
            System.out.println("# Sign In Screen");
        } else if (choice.equals("2")) {
            System.out.println("# Sign Up Screen");
        }
    }
    
    public void signMenu() {
        System.out.println("# [1] Sign In");
        System.out.println("# [2] Sign Up");
        System.out.println("# [M] Menu");
        System.out.println("# [E] Exit");
    }
}
