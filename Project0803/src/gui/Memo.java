/*
	�޸��� ������ �����ϱ�!
*/
package gui;
import java.awt.Frame; import java.awt.MenuBar;import java.awt.Menu;import java.awt.TextArea;
class Memo{
	public static void main(String[]args){
	/*
		�޸��� �����켱��
		�޴��ټ���
		�޴���
		�޴������۵�	
	*/
	Frame frame = new Frame("�޸���");
	MenuBar bar=new MenuBar();
	String[] m_title={"����","����","����","����","����"};
	Menu[] m=new Menu[5];

	for(int i=0;i<m.length;i++){
	m[i]=new Menu(m_title[i]);
	bar.add(m[i]);
	}
	TextArea area=new TextArea(30,40);
	frame.add(area);
	
	frame.setMenuBar(bar);
	
	frame.setSize(600,500);
	frame.setVisible(true);
	}
}