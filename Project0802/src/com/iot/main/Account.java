/*
	클래스 작성시, 변수는 private 으로 제한하고
	이 변수에 대한 조작은 메서드를 통해 제공하는 객체지향 언어의 개발기법을
	은닉화라고 한다(=encapsulation)
*/
package com.iot.main;
public class Account{
	//실제로 클래스가 보유한 데이터는 보호대상
	//따라서 private 보안처리!!..
	private String num="110-3303-8783";
	private int total=3000;
	//고객의 계좌를 접근할수있도록 메서드제공
	public int getTotal(){
		return total;
	}
	/*
		맴버의 값을 변경할 용도로 정의되는 메서드를 가르겨 setter이라한다
		set+멤버변수명 , 주의 set뒤의 단어는 대문자로한다
	*/
	public void setTotal(int total){
		this.total=total;
	}

}