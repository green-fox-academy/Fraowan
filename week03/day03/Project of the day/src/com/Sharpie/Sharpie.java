package com.Sharpie;

public class Sharpie {
  String color;
  float width;
  float inkAmount = 100;

  Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
  }

  public void use() {
    float i = 10;
    inkAmount -= i;
  }
}
