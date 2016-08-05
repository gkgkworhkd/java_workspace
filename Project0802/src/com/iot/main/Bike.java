package com.iot.main;
//패키지에 넣은 클래스는 공개하지않으면 절대로 접근할수없다
/*
	자바의 보안 4단계
	publick>	protected>default>private			
	publick : 보안처라하지않은것 모든 객체의 접근 허용
	protected: 상속 관계의 객체와 같은 페키지 내에 있는 객체에게 접근허용
	default : 오직 같은 패키지내의 객체만 접근허용
	private : 어떤누구에게도 접근을 허용하지않음
*/
public class Bike{
	public String name="시티100";
	public int price=2000;
	private int cc=100;

	public void run(){
		System.out.println(cc+"바이크 출발");
	}	
}