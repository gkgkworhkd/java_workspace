/*
	main()메서드의인수인 args를 사용해보자
	main 개발자가원할때 마음대로 호출할수있는
	메서드가 아니라, 어플리케이션이 시작될따
	최초 한번 호출되는 메서드이다...
	java.exe 파일에 의해 자동호출
*/
package main;
class MainTest{
	
	public static void main(String[]args){
		for(int i=0; i<args.length;i++){
			System.out.println(args[i]);
			
		}
		System.out.println("프로그램 실행시 넘겨받은 인수는");	
	}
}