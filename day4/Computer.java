class Computer{
	int memory=256;

	public void turnOn(){
		System.out.println("컴퓨터를 킵니당");
	}
	public static void main(String[] args) 
	{
		int k=5;
		Computer c=new Computer();
		System.out.println("k의값은?"+k);
		System.out.println("c의값은?"+c);// 객체는 stack에 올라오면서 너무커서 static에 거푸집을찍은후heap에 올리어
													//stack에 주소만을 표현한다

	}
}
