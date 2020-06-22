package com.group12.studentassistantconsoleappnb;

import java.util.ArrayList;
import java.util.Arrays;

public class Helper {
    /* public static ArrayList<E> object = new ArrayList<E>(Arrays.asList(new E(parameters))); */
    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Integer> signedUsersIndexes = new ArrayList<>();
    public static ArrayList<Room> rooms = new ArrayList<>();
    
    public static void ForceUserToInitialize() {
        /* fill array lists with five objects */
    }
    
    public static void Initializers() {
        UserInitializer();
        SignedUsersIndexesInitializer();
        RoomInitializer();
    }

    public static void UserInitializer() {
        users.add(new User("arastopuz", "181044000", "Aras", "TOPUZ", "5551234567", "atopuz@gtu.edu.tr"));
        users.add(new User("canerakin", "181044000", "Caner", "AKIN", "5551234567", "cakin@gtu.edu.tr"));
        users.add(new User("emreozbay", "181044000", "Emre", "OZBAY", "5551234567", "eozbay@gtu.edu.tr"));
        users.add(new User("irfankaratekin", "181044000", "Irfan", "KARATEKIN", "5551234567", "ikaratekin@gtu.edu.tr"));
        users.add(new User("mustafatokgoz", "181044000", "Mustafa", "TOKGOZ", "5551234567", "mtokgoz@gtu.edu.tr"));
        users.add(new User("seydanurdemir", "121044042", "SeydaNur", "DEMIR", "5063759015", "sncakar@gtu.edu.tr"));
        users.add(new User("sonerturkoglu", "181044000", "Soner", "TURKOGLU", "5551234567", "sturkoglu@gtu.edu.tr"));
        users.add(new User("umitaltintas", "181044000", "Umit", "ALTINTAS", "5551234567", "ualtintas@gtu.edu.tr"));
    }
    
    public static void SignedUsersIndexesInitializer() {
        signedUsersIndexes.add(0);
        signedUsersIndexes.add(1);
        signedUsersIndexes.add(2);
    }
    
    public static void RoomInitializer() {
        
    }
}
