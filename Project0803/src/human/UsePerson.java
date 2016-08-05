/*
	한번작성한 클래스코드는 중복하지 않고 추후 재사용할수있는데 이러한 객체지향 언어의
	개발기법을 상속 이라고한다!
	oop - 은닉화, 상속

	oop 객체지향 프로그래밍 언어
*/
package human;
class UsePerson{
	public static void main(String[]args){
		WhitePerson w = new WhitePerson();
		w.openParty();
		System.out.println(w.color);
		w.walk();
	}


}