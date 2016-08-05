package animal;
public class Sparrow extends Bird{
	/*
		상속시, 자식 클래스가 부모클래스의 메서드를
		완전히 동일하게 재정할 수있는 메서드정의기법을
		가르켜 override라고한다

		overloading 한클래스내에서 메서드명을 동일하게 정의하는기법
		override 부모의 메서드를 재 정의한것
	*/
	String name="참";
	public void wing(){
		System.out.println("참새가 날갯짓하다");
	}

}