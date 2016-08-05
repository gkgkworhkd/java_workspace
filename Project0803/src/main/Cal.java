/*
	Java.exe 실행시 연산을 수행할 두 데이터를 넘겨 서 두수의합을 구하는 프로그램
	
	일반적으로 자바언어는 기본자료형 문자 숫자 논리값

	Wrapper 클래스란 객체 자료형과 기본자료형간의 형변환 지원
	
	정수 
	byte :Byte
	short :Short
	int :Integer
	long : Long
	실수
	float : Float
	double :Double
	논리값 
	boolean : Boolean
*/
package main;
class Cal{
	public static void main(String[]args){
		String n1=args[0];
		String n2=args[1];
		int a=Integer.parseInt(n1);//문자열을 정수화시킴
		int b=Integer.parseInt(n2);
		System.out.println("두수의 합은?"+(a+b));
	}

}