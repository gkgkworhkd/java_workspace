/*
	Java.exe ����� ������ ������ �� �����͸� �Ѱ� �� �μ������� ���ϴ� ���α׷�
	
	�Ϲ������� �ڹپ��� �⺻�ڷ��� ���� ���� ����

	Wrapper Ŭ������ ��ü �ڷ����� �⺻�ڷ������� ����ȯ ����
	
	���� 
	byte :Byte
	short :Short
	int :Integer
	long : Long
	�Ǽ�
	float : Float
	double :Double
	���� 
	boolean : Boolean
*/
package main;
class Cal{
	public static void main(String[]args){
		String n1=args[0];
		String n2=args[1];
		int a=Integer.parseInt(n1);//���ڿ��� ����ȭ��Ŵ
		int b=Integer.parseInt(n2);
		System.out.println("�μ��� ����?"+(a+b));
	}

}