package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ctrat on 19.11.2016.
 */
public class Rectangle {
    double weight = 30;
    double height = 15;

     public void  Rectangle ( double w , double h ){ //Этот метод лучше разбить на несколько или реализовать функцией в Ex1
         //Напомни на занятии, расскажу подробнее.
         this.weight = w;
         this.height = h;

         System.out.println("Weight: "+ weight);
         System.out.println("Height: "+ height);
         System.out.println("Area:  "+ getArea());
    }

      public double getArea(){//этот метод может брать данные у обьекта. Не нужно делать этот метод статичным
          double area = this.height*this.weight;
          return area;
      }

}
