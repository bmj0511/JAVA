package com.mc.g_override_overloading.B_overloading;
//DTO:Data Transfer Object
//데이터를 전달하는 목적을 가진 클래스
public class Rectangle {
private double width;
private double height;

public double getWidth()
{
	return width;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}

public void setWidth(double width) {
	this.width = width;
}
}
