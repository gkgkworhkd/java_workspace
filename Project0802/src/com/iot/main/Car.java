package com.iot.main;
//현실의 자동차를 만들되 제대로만들자 
/*
	클래스가 보유한 자료가 객체 자료형일경우 
	Car has a wheel : has a 관계 mean....
*/
public class Car{
	private Wheel w;
	private Handle h;
	private Engine d;
	public Car(){
		w=new Wheel();
		h=new Handle();
		d=new Engine();
	}
	public void go(){
		w.roll();
		h.bound();
		d.control();
	}
	int pirce=500;
	

}