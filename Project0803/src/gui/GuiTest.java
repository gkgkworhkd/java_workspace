/*
	�ڹٵ� �ٸ� �������α׷�ó�� gui�� ó���Ѵ�
	��)������, ��ư, cheakbox,textarea ��...
	Java���� GUI������Ʈ�� awt��Ű������ �����Ѵ�.
*/
package gui;
import java.awt.Frame;import java.awt.Button;import java.awt.Checkbox;import java.awt.FlowLayout;
import java.awt.TextField; import java.awt.TextArea; import java.awt.Choice;
class GuiTest{
	public static void main(String[]args){
		//��� GUI������Ʈ�� �÷��� ������â
		/*
			�ڹٿ��� �������� ����Ʈ�Ӽ��� �����ϴµ�, �⺻��
			�������ʴ� �Ӽ����������ִ�,
			���� ���̰�����!!

			�ڹ� �� Htmló�� �� ������Ʈ�� �����ϱ⿡ �ռ�
			��� ��� �������� ���� ������ ����� �����ȴ�.
			�̿����� �����ϰ��ڴ�
		*/
		Frame win = new Frame("�ٺ�");
		win.setVisible(true);
		win.setSize(500,500);
		Button bt=new Button("��ư");
		bt.setVisible(true);

		FlowLayout flow =new FlowLayout();
		win.setLayout(flow);
		win.add(bt);
		Checkbox[] ch=new Checkbox[4];
		for(int i=0;i<4;i++){
			Checkbox c=new Checkbox("��°�ڽ���");
			ch[i]=c;
			win.add(ch[i]);
		}
		TextField tf= new TextField("�ٺ�",20);
		win.add(tf);
		TextArea ta=new TextArea(5,10);
		win.add(ta);
		Choice chi=new Choice();
		for(int i=1;i<=12;i++){
		chi.add(Integer.toString(i));
		}
		win.add(chi);
	}
}