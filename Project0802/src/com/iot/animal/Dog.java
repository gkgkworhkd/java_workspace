package com.iot.animal;

public class Dog{
	String name="��Ƽ��";
	int age;
	String gender="����";

		/**
			�ν��Ͻ� ������ �� �޼���� ȣ��ǹǷ� �ʱ�ȭ������������
		*/

		public Dog(int age, String gender){
			this.age=age;
			this.gender=gender;
		}		
		public void bark(){
			System.out.println("�۸����� �п�����");
		}
}