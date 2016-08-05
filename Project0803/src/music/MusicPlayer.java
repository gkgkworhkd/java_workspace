/*
28명의 사원중 이상신 사원이 제작할 어플리케이션을
정의한다.!
추상 클래스란!
미완성클래스를 의미한다
미완성이란 몸체없는 추상 메서드를
단한게 라도 보유하고있으면 그 클래스는 완전하지
못하므로 인스턴스화 될수없다
추상클래스 인터페이스..

자바 언어는 다중상속을 허용하지않으므로 interface 으로 보내 implements 로 기능만 받음
interface 는 class가 아니고 기능만을 가지고있다
*/
package music;
public class MusicPlayer extends MusicDevice implements JetEngine{
	int volume;											//받는거
	public void stream(){
	}
	public void setVolume(){	
	}
	public void palyMp3(){
	}
	public void fire(){
	
	}

}