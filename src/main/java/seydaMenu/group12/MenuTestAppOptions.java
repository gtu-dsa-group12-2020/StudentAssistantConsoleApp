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
public class MenuTestAppOptions {
    
    private String choice = "null";
    
    public void menuTestAppOptions() {
        while (!(choice.equals("E") || choice.equals("e"))) {
            Scanner obj = new Scanner(System.in);
            System.out.println("# ------------------------------------------------------------------------");
            optionsMenu();
            System.out.println("> ");
            choice = obj.nextLine();
            makeChoise();
        }
    }
    
    public void makeChoise() {
        if (choice.equals("1")) {
            System.out.println("# Test Sign In ");
            SignIn signInObject = new SignIn();
            if (signInObject.signIn()) {
                System.out.println("# Signed In ");
            } else {
                System.out.println("# Could not Signed In ");
            }
        } else if (choice.equals("2")) {
            System.out.println("# Test Sign Up ");
            SignUp signUpObject = new SignUp();
            if (signUpObject.signUp()) {
                System.out.println("# Signed Up ");
            } else {
                System.out.println("# Could not Signed Up ");
            }
        } else if (choice.equals("3")) {
            System.out.println("# Test Profile");
            /* bad implementation, bounds must be controlled, will be edited*/
            int index3;
            Scanner obj3 = new Scanner(System.in);
            System.out.println("# Enter an user index to display its profile");
            index3 = obj3.nextInt();
            Profile profileObject = new Profile();
            profileObject.displayProfile(Helper.users.get(index3));
        } else if (choice.equals("4")) {
            System.out.println("# Test Room Create");
        } else if (choice.equals("5")) {
            System.out.println("# Test Room Join");
        } else if (choice.equals("6")) {
            System.out.println("# Test Calendar");
        } else if (choice.equals("7")) {
            System.out.println("# Test Calculate Average");
        } else if (choice.equals("8")) {
            System.out.println("# About Group 12");
        }
    }
    
    public void optionsMenu() {
        System.out.println("# [1] Test Sign In");
        System.out.println("# [2] Test Sign Up");
        System.out.println("# [3] Test Profile");
        System.out.println("# [4] Test Room Create");
        System.out.println("# [5] Test Room Join");
        System.out.println("# [6] Test Calendar");
        System.out.println("# [7] Test Calculate Average");
        System.out.println("# [8] About Group 12");
        System.out.println("# [M] Menu");
        System.out.println("# [E] Exit");
    }
}
