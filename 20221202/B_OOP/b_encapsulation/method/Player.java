package com.mc.b_encapsulation.method;

public class Player {
	private String instrument;
	public Player(String instrument) {
	this.instrument=instrument;}
	
	//객체의 자율성을 지녀야 함. -> getter 함수와 비슷한 기능을 가진 함수
	public void play() 
	{
		prepare();
		playing();
		end();
	}
	
	private void prepare() {
		System.out.println(instrument+" 를 연주할 준비 중 입니다.");
	}
	private void playing() {
		System.out.println(instrument+" 를 연주하고 있습니다.");
	}
	private void end() {
		System.out.println(instrument+ " 를 마치고 관객에게 인사합니다.");
	}
}
