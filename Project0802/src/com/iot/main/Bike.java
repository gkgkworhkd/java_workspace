package com.iot.main;
//��Ű���� ���� Ŭ������ �������������� ����� �����Ҽ�����
/*
	�ڹ��� ���� 4�ܰ�
	publick>	protected>default>private			
	publick : ����ó������������ ��� ��ü�� ���� ���
	protected: ��� ������ ��ü�� ���� ��Ű�� ���� �ִ� ��ü���� �������
	default : ���� ���� ��Ű������ ��ü�� �������
	private : ��������Ե� ������ �����������
*/
public class Bike{
	public String name="��Ƽ100";
	public int price=2000;
	private int cc=100;

	public void run(){
		System.out.println(cc+"����ũ ���");
	}	
}