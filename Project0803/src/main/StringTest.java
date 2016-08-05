/*
	자바의 모오든 클래스는 sun이 제공하는api 이건 모두 Object 라는 최상위
	객체에 상속을 받는다!
*/
package main;
class StringTest{
	public static void main(String[]args){
		String a="대한민국";
		String b="대한민국";
		System.out.println(a.equals(b));
	}
}
