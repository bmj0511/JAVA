package com.mc.g_override_overloading.A_override;

public class Rectangle extends Figure{
private double width;
private double height;

public Rectangle(double width, double height) {
	super();
	this.width = width;
	this.height = height;
}

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

@Override
public double calArea() {
	return height*width;
}
}