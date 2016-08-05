/*문자 자료형에 대한 학습*/
class CharTest{
	public static void main(String[]args){
		//문자자료형이란 사실상존재하지않음 
		//왜? 어차피 문자는 곧 숫자로바뀌기때문
		//단 이 숫자의목적은 연산수행이아닌 키코드값과 매핑목적
		char x='a';
		char y=3;//컴퓨터가 가장좋아해
		char k=5;
		char z=-1;//키코드 매핑이목적이므로 음수는 지원하지않음!!0
		System.out.println(x);
	}

}