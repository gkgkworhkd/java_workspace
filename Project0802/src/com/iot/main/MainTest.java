package com.iot.main;
class MainTest{
	public void test(String[] k){
		for(int i=0;i<k.length;i++){
		System.out.println(k[i]);
		}
	}
	public static void main(String[]args){
		MainTest mt=new MainTest();
		//자바에서는 배열생성시 반드시 그 크기를명시해야된다!!
		//자바에서배열을 객채취급 함으로 배열을 가르키는 변수는 레퍼런스변수와같다!!
		String[] arr=new String[3];
		arr[0]="사과";
		arr[1]="오랜지";
		arr[2]="딸기";

		mt.test(arr);
		System.out.println("실행시 배열의크기는"+args.length);
	}
}