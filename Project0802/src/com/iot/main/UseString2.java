package com.iot.main;
class UseString2{
	public static void main(String[]args){
		String s1=new String("apple");
		String s2 = "apple";
		String s3 ="apple";
		String s4= new String("apple");
		//System.out.println(s2==s3);
		System.out.println(s1==s2);//String�� ��ü�̹Ƿ� s2,s3�� ���۷��������̴� ���� �Ʒ����ڵ��� ����񱳰��ƴ� 
												//�ּ� ��. �Ͻ��� ��ü�� ���Ǯ�� �����ȴ� ���Ǯ�� Ư¡��
												//�ߺ��Ǹ� ����������ʴ´�!
		//System.out.println(s1==s4);
	
		StringBuffer b=new StringBuffer();
		b.append("korea");
		b.append("Fighting"); //���Ӱ� ��ü�� �����Ǵ°� �ƴ϶� ��ȭ���ȴ�
		System.out.println(b.toString());
		//String �� �ƴϱ⿡ toString()�޼���� ��ȯ��Ų�� ���!
	}
}
//��Ʈ����ü�� �Һ���Ư¡���� ���Ͽ� �ڹ��� String  ���� �����̶�� ������ ���������ʴ´�!
//String �Һ��ذ�å ���������� ��ü ���
