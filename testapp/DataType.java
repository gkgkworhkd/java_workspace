/*
	변수에 데이터를 담을때에는 반드시
	변수가 담게될 데이터의 용량을 표시하여야함!
	이용량 표시를 자료형이라고한다.
	불편하긴 하지만, 개발자가 메모리 용량을 결정지을수있다!>!!

	1.문자: char(2byte)16bit 2의 16승
	2.숫자: byte(1byte)=8bit
	>short(2byte)=16bit
	>int(4byte)=32bit
	>long(8byte)=64bit
	3.논리값:boolean(1byte)
*/
class DataType{
	public static void main(String[] args){
		char c='대';//문자열이아닌 문자는 홋따운표를쓴다
		//2바이트 짜리 데이터가 4개 확보 =8byte
		char[] arr=new char[4];//배열
		arr[0]='대';
		arr[1]='한';
		arr[2]='민';
		arr[3]='국';
		 
		char[] arr2={'아','메','리','카'};
		
		for(int i=0; i<arr.length;i++){ //ln 은 줄바꿈 LN임
		System.out.print(arr[i]);
		}
		
		for(int i=0; i<arr2.length;i++){
		System.out.println(arr2[i]);
		}

		boolean m=true;

	}
	
}
