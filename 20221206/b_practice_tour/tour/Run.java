package com.mc.tour;
import com.mc.tour.presentation.MainMenu;
import com.mc.tour.service.Airline;
import com.mc.tour.service.Tour;
import com.mc.tour.service.Tourist;

public class Run {
	public static void main(String[] args) {
		// Airline객체 3개 생성 (매개변수 있는 생성자를 통해 생성)
		Airline al[] = {new Airline("미국행",3000,300000),
				                new Airline("중국행",2000,200000),
				                new Airline("일본행",1500,150000)};
		// Tourist객체 1개 생성 (매개변수 있는 생성자를 통해 생성)
		Tourist tt=new Tourist(1000000,1000);
		Tour tour=new Tour(al,tt);
		new MainMenu(tour,al,tt).mainMenu();

	}

}
