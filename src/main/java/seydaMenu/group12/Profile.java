package com.group12.studentassistantconsoleappnb;

public class Profile {

    public Profile() {
    }

    public void displayProfile(User anyone) {
        System.out.println("# ------------------------------------------------------------------------");
        System.out.println("# Profile Screen");
         System.out.println(anyone.toString());
        System.out.println("# ------------------------------------------------------------------------");
    }
}
