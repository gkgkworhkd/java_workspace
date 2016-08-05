package com.iot.main;
class UseTV{
	public void getInfo(TV tv,int k){
		//매게변수 tv의 인스턴스하나를 넘겨서 해당 tv에 가격을 출력
	}
	public void test(boolean b,int k){
		System.out.println(b+","+k);
	}
	public void showPrice(){
		
	}
	public static void main(String[]args){
		UseTV ut=new UseTV();
		TV tv=new TV();
		//tv.printPrice();
		//ut.test(true,4);
		//ut.showPrice();
		ut.getInfo(tv,8);
	}
}