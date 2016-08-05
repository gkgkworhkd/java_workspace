class Duck{
	/*
	
	*/	
	//오리가 탄생할때 무엇인가 초기화할 작업이있다면 
	//생성자 메서드의기회를 놓치지말자!
	String name;
	String color;

	/*this란? 현재 디자인 타임의 클래서 기준이 아니라. 이 클래스 원본으로부터 태어나는 인스턴스가 자기자신을 가르키는 것.
	ex) window.document*/
	public Duck(){
		name="도우널드";
		color="흰색";
		System.out.println(name+color+"dl태어난다");
	}
}