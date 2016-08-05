class Dog{
	String name="아서";
	/*인스턴스 초기화블럭
		-이 클래스로부터 생성되는 인스턴트가있을때마다
		 이 영역이 수행됨
	*/
	static{//클래스 최초에 로드되어질때만 !! 단 한번 수행됨
		System.out.println("static 초기화블럭");
	}
		//클래스로부터 인스턴스가 생성될때마다 티나옴
	{
		System.out.println("인스턴스 초기화 블럭 수행");
	}
	public static void main(String[]args){
		new Dog();
		//이름이없으면 제어불능 허나 호출은됨
	}
}