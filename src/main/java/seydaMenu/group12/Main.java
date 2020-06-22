/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group12.studentassistantconsoleappnb;

import java.io.IOException;

/**
 *
 * @author sndemir
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("# WELCOME DEMO !");
        
        DemoApp demo = new DemoApp();
        demo.demo();
        
        System.out.println("# GOOD BYE DEMO !");
    }
}
