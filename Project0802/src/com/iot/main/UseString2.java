package com.iot.main;
class UseString2{
	public static void main(String[]args){
		String s1=new String("apple");
		String s2 = "apple";
		String s3 ="apple";
		String s4= new String("apple");
		//System.out.println(s2==s3);
		System.out.println(s1==s2);//String은 객체이므로 s2,s3는 레퍼런스변수이다 따라서 아래의코도는 내용비교가아닌 
												//주소 비교. 암시적 객체는 상수풀에 생성된다 상수풀의 특징은
												//중복되면 재생성되지않는다!
		//System.out.println(s1==s4);
	
		StringBuffer b=new StringBuffer();
		b.append("korea");
		b.append("Fighting"); //새롭게 객체가 생성되는게 아니라 변화가된다
		System.out.println(b.toString());
		//String 이 아니기에 toString()메서드로 변환시킨후 출력!
	}
}
//스트링객체의 불변의특징으로 인하여 자바의 String  에는 누적이라는 개념은 존재하지않는다!
//String 불변해결책 편집가능한 객체 사용
