package com.iot.main;
//������ �ڵ����� ����� ����θ����� 
/*
	Ŭ������ ������ �ڷᰡ ��ü �ڷ����ϰ�� 
	Car has a wheel : has a ���� mean....
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