/*
	Ŭ�����κ��� �����Ǵ� �ν��Ͻ��� ������ ���� �����͸�
	�����Ұ�� ���Ȼ� ������ �߻��Ҽ� �����Ƿ�.
	�ڹپ����� 4������ ���ȵ���������Ѵ�
	public<protected<default<private
	public:�ƿ� �����̾��°�
	protected : ���� ��Ű�� or ��Ӱ��迡�ִ� �ν��Ͻ��� ������ ����Ѵ�
	default: ���� ���� ��Ű������ �ִ� �ν��Ͻ��� �������
	private: �ܺ��� ��� �ν��Ͻ��� ������ ��������ʴ� 
				���尭�� ��������
	�����ڰ� ���������ڸ� �������������� default ���������ڰ� �����
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