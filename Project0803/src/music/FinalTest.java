package music;
class FinalTest{
	static int a=5;

	public static void main(String[]args){
		final int b=4;//이후의 문장에서는 더이상 변수의값을 수정할수없음
		b=10;
	}	
}