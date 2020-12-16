package com.Allianz.Homeworkoop;

public class Rectangle {
  private float length = 1.0f;
  private float width = 1.0f;

  public static void main(String[] args) {
    Rectangle rec1 = new Rectangle();
    System.out.println(rec1);
    System.out.println(rec1.getPerimeter());

  }

  public Rectangle() {


  }

  public Rectangle(float length, float width) {
    this.length = length;
    this.width = width;
  }

  public float getLength() {
    return length;
  }

  public void setLength(float length) {
    this.length = length;
  }

  public float getWidth() {
    return width;
  }

  public void setWidth(float width) {
    this.width = width;
  }

  public double getArea() {
    return length * width;
  }

  public double getPerimeter() {
    return 2 * (length + width);
  }

  @Override
  public String toString() {
    return "Rectangle[length= " + length + ", width= " + width + "]";
  }



}
