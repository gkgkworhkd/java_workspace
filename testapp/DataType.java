/*
	������ �����͸� ���������� �ݵ��
	������ ��Ե� �������� �뷮�� ǥ���Ͽ�����!
	�̿뷮 ǥ�ø� �ڷ����̶���Ѵ�.
	�����ϱ� ������, �����ڰ� �޸� �뷮�� �����������ִ�!>!!

	1.����: char(2byte)16bit 2�� 16��
	2.����: byte(1byte)=8bit
	>short(2byte)=16bit
	>int(4byte)=32bit
	>long(8byte)=64bit
	3.����:boolean(1byte)
*/
class DataType{
	public static void main(String[] args){
		char c='��';//���ڿ��̾ƴ� ���ڴ� Ȫ����ǥ������
		//2����Ʈ ¥�� �����Ͱ� 4�� Ȯ�� =8byte
		char[] arr=new char[4];//�迭
		arr[0]='��';
		arr[1]='��';
		arr[2]='��';
		arr[3]='��';
		 
		char[] arr2={'��','��','��','ī'};
		
		for(int i=0; i<arr.length;i++){ //ln �� �ٹٲ� LN��
		System.out.print(arr[i]);
		}
		
		for(int i=0; i<arr2.length;i++){
		System.out.println(arr2[i]);
		}

		boolean m=true;

	}
	
}
