package com.iot.main;
class MainTest{
	public void test(String[] k){
		for(int i=0;i<k.length;i++){
		System.out.println(k[i]);
		}
	}
	public static void main(String[]args){
		MainTest mt=new MainTest();
		//�ڹٿ����� �迭������ �ݵ�� �� ũ�⸦����ؾߵȴ�!!
		//�ڹٿ����迭�� ��ä��� ������ �迭�� ����Ű�� ������ ���۷��������Ͱ���!!
		String[] arr=new String[3];
		arr[0]="���";
		arr[1]="������";
		arr[2]="����";

		mt.test(arr);
		System.out.println("����� �迭��ũ���"+args.length);
	}
}