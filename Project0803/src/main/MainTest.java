/*
	main()�޼������μ��� args�� ����غ���
	main �����ڰ����Ҷ� ������� ȣ���Ҽ��ִ�
	�޼��尡 �ƴ϶�, ���ø����̼��� ���۵ɵ�
	���� �ѹ� ȣ��Ǵ� �޼����̴�...
	java.exe ���Ͽ� ���� �ڵ�ȣ��
*/
package main;
class MainTest{
	
	public static void main(String[]args){
		for(int i=0; i<args.length;i++){
			System.out.println(args[i]);
			
		}
		System.out.println("���α׷� ����� �Ѱܹ��� �μ���");	
	}
}