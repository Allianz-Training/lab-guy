package com.Allianz.Homeworkoop;

public class Circle {
  public static void main(String[] args) {
    Circle c1 = new Circle(2);
    System.out.println(c1);
  }

  private double radius;
  private String color;

  public void setRadius(double r) {
    this.radius = radius;
  }

  public Circle() {
    radius = 1;
    color = "red";
  }

  public Circle(double r) {
    // this();
    radius = r;
    color = "red";
  }

  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }


  public double getRadius() {
    return radius;
  }



}
