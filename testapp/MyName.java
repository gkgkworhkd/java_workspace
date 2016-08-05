class MyName{
	/*
		자바스크립트와는 달리 변수에의해 메모리의 올라갈 데이터는 그 
		크기가 명시되어야함!!!
		=자료형!!!!!
		*/
	String name="고재광"; //문자
	int age=30; //숫자 메모리에 4byte를 차지하게됨

	//자바와 같은 컴파일 과정이있는(변환과정)모든 응용프로그램은 반드시 실행하기위해서는
	//실행부라 불리는 시작 메서드(함수)가 있어야한다
	public static void main(String[] args){
		for(int i=0; i<20;i++){
		System.out.println("고재광!!"); //모니터에 이름을출력하는 실행부소스
		}
	}
}
