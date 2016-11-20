package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ctrat on 19.11.2016.
 */
public class Rectangle {
    double weight = 30;
    double height = 15;

     public void  Rectangle ( double w , double h ){
         this.weight = w;
         this.height = h;

         System.out.println("Weight: "+ weight);
         System.out.println("Height: "+ height);
         System.out.println("Area:  "+ getArea(w,h));

    }

      public static double getArea(double a, double b){
          double area = a*b;
          return area;
      }

}
