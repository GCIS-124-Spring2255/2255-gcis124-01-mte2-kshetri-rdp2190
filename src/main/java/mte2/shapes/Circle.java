// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Circle.java

package mte2.shapes;

//public class Circle {
 public class Circle implements Shape {
     public final double pi = 3.14;
     private final double radius;
     public Circle(double radius) {    this.radius = radius;    }

     @Override
     public double area(){
        return pi*(radius*radius);
     }
     @Override
     public double perimeter() {
         return 2*pi*radius;
     }

    public static void main(String[] args) {
        
        // ...

    }
}