/*
	���������� Ŭ�����̴�
	StringŬ������ ���Ͽ� �˾ƺ���
	����� String Ŭ������ �츮��������������
	�ܺ�Ŭ�����̸� Ư��Sun���� �����ϴ� 
	JavaSE�� �⺻ ��ü�̴�;.
	������, ���� Ŭ�����ʹ� ������ ��Ű���� �����ϹǷ�
	��Ģ�����δ� import�Ͽ� ����ġ�� ����ؾ��Ѵ�..
	But !error ������ 
	Java.lang ��Ű���� �����ڰ� ������� �ʴ���
	�̹� �ý��������� ��ΰ� �νĵǾ����ִ�... ����
	���� import ���ʿ䰡����!!
	�ڹ���lang��Ű���� ���α׷��� ����ۼ��� ����� �����̳���
	���ֻ���ϴ� �ֿ䰴ü���� ��Ƴ��� ��Ű���̱⶧����
*/
package com.iot.main;
class UseString{
	public static void main(String[]args){
		//�Ͻ��� ������(implicit) ������  
		String s="korea";
		//����� (explicit)������	String s = new String("korea"); ���Ƿᰡ����
		int a=s.length();
		for(int i=0;i<s.length();i++){
		char c=s.charAt(i);
		System.out.print(c);
		}
	}
}