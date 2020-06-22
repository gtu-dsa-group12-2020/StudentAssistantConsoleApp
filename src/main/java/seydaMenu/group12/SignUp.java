package com.group12.studentassistantconsoleappnb;

import java.util.Scanner;

public class SignUp {
    public boolean signUp () {
        String username;
        String password;
        String firstName;
        String lastName;
        String phoneNumber;
        String emailAddress;
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("# Please enter username ");
        System.out.println("> ");
        username = obj.nextLine();
        
        for (int i=0;i<Helper.users.size();i++) {
            if (Helper.users.get(i).getUsername().equals(username)) {
                /* bad implementation, will be edited */
                System.out.println("# This username is exist, please try with another username ");
                return false;
            }
        }
        
        System.out.println("# Please enter password ");
        System.out.println("> ");
        password = obj.nextLine();
        System.out.println("# Please enter first name ");
        System.out.println("> ");
        firstName = obj.nextLine();
        System.out.println("# Please enter last name ");
        System.out.println("> ");
        lastName = obj.nextLine();
        System.out.println("# Please enter phone number ");
        System.out.println("> ");
        phoneNumber = obj.nextLine();
        System.out.println("# Please enter email address ");
        System.out.println("> ");
        emailAddress = obj.nextLine();
        
        Helper.users.add(new User(username,password,firstName,lastName,phoneNumber,emailAddress));
        return true;
    }
}
