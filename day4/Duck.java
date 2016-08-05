class Duck{
	//이름, 나이, 비행가능여부
	String name="도널드";
	static int age=3;//이것은클래스 변수!(인스턴스에 딸려가지않고
	//클래스 원본에 소속된다고해서)
	public void test(){
		System.out.println("오리의나이는?"+age);
	}
	public static void test2(){
		System.out.println("오리의이름은?"+name);
	}
	public static void main(String[]args){
		Duck d = new Duck();
		d.test();
		d.test2();
	
	}
}