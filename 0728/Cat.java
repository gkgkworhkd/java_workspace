/*
	Cat�̶�� �̸��� ����� Ŭ������ �����ϵ�
	Ư�� �����ǰ�쿡�� static ���� �����Ͻÿ�

	���� Ŭ������ main ����θ� �ε�, 
	������� �̸� ���� ���� ����Ͻÿ�
*/
class Cat{
	String name="����";
	int age=13;
	static String type="����̰�";
	public void test(){
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args){
		Cat d= new Cat();
		d.test();
	}
}