package com.iot.main;
class UseTV1{
	public void getInfo(TV tv,int k){
		//�ŰԺ��� tv�� �ν��Ͻ��ϳ��� �Ѱܼ� �ش� tv�� ������ ���
		System.out.println("�ٺ�");
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