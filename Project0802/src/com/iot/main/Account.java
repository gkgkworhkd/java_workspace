/*
	Ŭ���� �ۼ���, ������ private ���� �����ϰ�
	�� ������ ���� ������ �޼��带 ���� �����ϴ� ��ü���� ����� ���߱����
	����ȭ��� �Ѵ�(=encapsulation)
*/
package com.iot.main;
public class Account{
	//������ Ŭ������ ������ �����ʹ� ��ȣ���
	//���� private ����ó��!!..
	private String num="110-3303-8783";
	private int total=3000;
	//���� ���¸� �����Ҽ��ֵ��� �޼�������
	public int getTotal(){
		return total;
	}
	/*
		�ɹ��� ���� ������ �뵵�� ���ǵǴ� �޼��带 ������ setter�̶��Ѵ�
		set+��������� , ���� set���� �ܾ�� �빮�ڷ��Ѵ�
	*/
	public void setTotal(int total){
		this.total=total;
	}

}