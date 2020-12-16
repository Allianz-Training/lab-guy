package com.Allianz.Homeworkoop;

public class circle2 {
  public static void main(String[] args) {
    circle2 c1 = new circle2(2);
    System.out.println(c1);
    System.out.println(c1.getCircumference());
  }

  private double radius;
  private String color;

  public void setRadius(double r) {
    this.radius = radius;
  }

  public circle2() {
    radius = 1;
    color = "red";
  }

  public circle2(double r) {
    // this();
    radius = r;
    color = "red";
  }

  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }

  public double getCircumference() {
    return Math.PI * 2 * radius;
  }

  public double getRadius() {
    return radius;
  }

  @Override
  public String toString() {
    return "Circle[radius= " + radius + "]";
  }



}
