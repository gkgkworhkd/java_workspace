package com.iot.main;
class UseTV1{
	public void getInfo(TV tv,int k){
		//매게변수 tv의 인스턴스하나를 넘겨서 해당 tv에 가격을 출력
		System.out.println("바보");
		tv.printPrice();
	}
	public void test(boolean b,int k){
		System.out.println(b+","+k);
	}
	public void showPrice(){
		
	}
	public static void main(String[]args){
		UseTV1 ut=new UseTV1();
		TV tv=new TV();
		
		//tv.printPrice();
		//ut.test(true,4);
		//ut.showPrice();
		ut.getInfo(tv,8);
	}
}