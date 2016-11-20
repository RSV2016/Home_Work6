package com.company;

/**
 * Created by ctrat on 19.11.2016.
 */
public class Human {
    String name = "Vasiliy";
    String sername = "Pupkin";
    int year = 1998;
    int mounth = 3;
    int day  = 23;

    public  Human( String n, String s, int y, int m, int d){
        this.name  = n;
        this.sername = s;
        this.year = y;
        this.mounth = m;
        this.day = d;

    }
     public void outn() {
         System.out.println("Name: "+ name);
         System.out.println("Sername: "+ sername);
         System.out.println("Date: "+year+"."+mounth+"."+day);


    }
}
