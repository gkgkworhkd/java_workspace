/*
	실행을위한 클래스이다
	String클래스에 대하여 알아보자
	참고로 String 클래스는 우리가정의하지않은
	외부클래스이면 특히Sun에서 제공하는 
	JavaSE의 기본 객체이다;.
	하지만, 현제 클래스와는 별도의 패키지에 존재하므로
	원칙상으로는 import하여 그위치를 명시해야한다..
	But !error 이유는 
	Java.lang 패키지는 개발자가 명시하지 않더라도
	이미 시스탬적으로 경로가 인식되어져있다... 따라서
	따로 import 할필요가없다!!
	자바의lang패키지는 프로그램의 언어작성시 상당히 비중이높고
	자주사용하는 주요객체들을 담아놓은 패키지이기때문에
*/
package com.iot.main;
class UseString{
	public static void main(String[]args){
		//암시적 묵시적(implicit) 생성법  
		String s="korea";
		//명시적 (explicit)생성법	String s = new String("korea"); 할피료가없다
		int a=s.length();
		for(int i=0;i<s.length();i++){
		char c=s.charAt(i);
		System.out.print(c);
		}
	}
}