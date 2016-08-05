/*
	Cat이라는 이름의 고양이 클래스를 정의하되
	특히 종류의경우에는 static 으로 선언하시오

	현재 클래스의 main 실행부를 두되, 
	고양이의 이름 나이 종을 출력하시오
*/
class Cat{
	String name="나비";
	int age=13;
	static String type="고양이과";
	public void test(){
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args){
		Cat d= new Cat();
		d.test();
	}
}