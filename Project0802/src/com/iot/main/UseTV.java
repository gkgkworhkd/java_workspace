package com.iot.main;
class UseTV{
	public void getInfo(TV tv,int k){
		//�ŰԺ��� tv�� �ν��Ͻ��ϳ��� �Ѱܼ� �ش� tv�� ������ ���
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