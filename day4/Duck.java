class Duck{
	//�̸�, ����, ���డ�ɿ���
	String name="���ε�";
	static int age=3;//�̰���Ŭ���� ����!(�ν��Ͻ��� ���������ʰ�
	//Ŭ���� ������ �Ҽӵȴٰ��ؼ�)
	public void test(){
		System.out.println("�����ǳ��̴�?"+age);
	}
	public static void test2(){
		System.out.println("�������̸���?"+name);
	}
	public static void main(String[]args){
		Duck d = new Duck();
		d.test();
		d.test2();
	
	}
}