package com.mc.g_override_overloading.B_overloading;
//overloading : 하나의 이름에 메서드가 여러 개 존개
//overloading은 매개변수의 개수나 타입이 다른 같은 이름의 메서드를 여러 개 만드는 것을 의미
//overloading을 할 때에는 두 메서드의 의미상의 기능이 동일해야 함.
public class AreaCalculator {
public static double calArea(Rectangle r) {
	return r.getHeight()*r.getWidth();
}
public static double calArea(Circle c) {
	return Math.PI*c.getRadius()*c.getRadius();
}
}
