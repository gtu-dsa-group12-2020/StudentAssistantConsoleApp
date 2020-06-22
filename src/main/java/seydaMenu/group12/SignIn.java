package com.group12.studentassistantconsoleappnb;

import java.util.Scanner;

public class SignIn {
    public boolean signIn() {
        String username;
        String password;
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("# Please enter username ");
        System.out.println("> ");
        username = obj.nextLine();
        
        System.out.println("# Please enter password ");
        System.out.println("> ");
        password = obj.nextLine();
        
        for(int i=0;i<Helper.users.size();i++) {
            if (Helper.users.get(i).getUsername().equals(username)) {
                if (Helper.users.get(i).getPassword().equals(password)) {
                    Helper.signedUsersIndexes.add(i);
                    return true;
                }
            }
        }
        
        return false;
    }
}
