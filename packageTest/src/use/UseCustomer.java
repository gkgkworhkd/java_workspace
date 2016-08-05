/*
	클래스로부터 생성되는 인스턴스간 무조건 서로 데이터를
	접근할경우 보안상 문제가 발생할수 있으므로.
	자바언어에서는 4가지의 보안등급을지원한다
	public<protected<default<private
	public:아예 보안이없는것
	protected : 같은 패키지 or 상속관계에있는 인스턴스간 접근을 허용한다
	default: 오직 같은 패키지내의 있는 인스턴스만 접근허용
	private: 외부의 모든 인스턴스는 접근을 허용하지않는 
				가장강한 접근제한
	개발자가 접근제한자를 결정하지않으면 default 접근제한자가 적용됨
*/
package use;
import bank.Customer;
class UseCustomer{
	public static void main(String[]args){
		Customer c = new Customer();
		c.total=100;
		System.out.println(c.total);
	
	}
}