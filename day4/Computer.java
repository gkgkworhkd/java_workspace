class Computer{
	int memory=256;

	public void turnOn(){
		System.out.println("��ǻ�͸� ŵ�ϴ�");
	}
	public static void main(String[] args) 
	{
		int k=5;
		Computer c=new Computer();
		System.out.println("k�ǰ���?"+k);
		System.out.println("c�ǰ���?"+c);// ��ü�� stack�� �ö���鼭 �ʹ�Ŀ�� static�� ��Ǫ����������heap�� �ø���
													//stack�� �ּҸ��� ǥ���Ѵ�

	}
}
