package music;
class UseMusic{
	public static void main(String[]args){
		/*인스턴스화 될수없다!
		해결책은 상속관계에서 자식의 인스턴스가 생성되기 직전에 부모의 인스턴스가 메모리에 먼저 올라가는 현상을 이용하자
		즉 자식에 의해서만 올릴수있다
		자식이 구현을 완료 한후 인스턴스화될때*/
		MusicPlayer mp=new MusicPlayer();
	}
}