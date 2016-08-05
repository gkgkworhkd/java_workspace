/*
	현실에 존재하는 모든 사물은 단독으로 존재할수없다.!!
	이러한 현상을 자바언어에서도 표현할수있는데
	sun에서는 이현상을 두가지로분류

	1)has a 관계:특정객체가 다를 객체를 부품으로 보유한관계
	2)is a 관계:객체들간 부모자식관계를 맺은경우
*/
package human;

public class WhitePerson extends Person{
							//is a
	String color="White";

	public void openParty(){
		System.out.println("파티를 즐기다");
	}
}