class Dog{
	String name="�Ƽ�";
	/*�ν��Ͻ� �ʱ�ȭ��
		-�� Ŭ�����κ��� �����Ǵ� �ν���Ʈ������������
		 �� ������ �����
	*/
	static{//Ŭ���� ���ʿ� �ε�Ǿ������� !! �� �ѹ� �����
		System.out.println("static �ʱ�ȭ��");
	}
		//Ŭ�����κ��� �ν��Ͻ��� �����ɶ����� Ƽ����
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ �� ����");
	}
	public static void main(String[]args){
		new Dog();
		//�̸��̾����� ����Ҵ� �㳪 ȣ������
	}
}