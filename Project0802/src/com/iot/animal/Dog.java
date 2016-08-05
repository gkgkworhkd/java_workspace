package com.iot.animal;

public class Dog{
	String name="말티즈";
	int age;
	String gender="여자";

		/**
			인스턴스 생성시 이 메서드는 호출되므로 초기화목적으로하자
		*/

		public Dog(int age, String gender){
			this.age=age;
			this.gender=gender;
		}		
		public void bark(){
			System.out.println("멍멈쾅쾅 왈왈쾅쾅");
		}
}