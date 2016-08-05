/*
 * �ڹٸ� �����Ͽ� ��κ��� �������α׷������� GUI ������Ʈ��
 * �����쿡 �÷������� ��ġ����� ���� �������ִ� ����� �����Ѵ�
 * �ڹٴ� LayoutManager ��� ��ü�� �����ϰ� ���������� ������
 * ���� ��ġ�����ڸ� �����ؼ� ����ϸ� �ȴ�
 * 
 * 1.BorderLayout(�������� ������ �����������Ǵ� ��ġ������)
 * 2.FlowLayout(������Ʈ���� �������� ũŰ ������ ���� �帣���� ��ġ������)
 * 3.GridLayout(����(�׸���)������� ������Ʈ�� ��ġ�ϴ� ��ġ������)
 * 4.GridBagLayout(GridLayout ����� ���� ����������ó���� ���̾ƿ�)
 * 5.CardLayOut(ȭ�鿡 ������ ������Ʈ�� ���� 1���� �����Ű�� ��ġ������)
*/
package study.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class WindowTest {
	public static void main(String[]args){
		Frame f=new Frame();
		Label la_id =new Label("id");
		Label la_pw = new Label("pw");
		TextField t_id =new TextField(15);
		TextField t_pw =new TextField(15);
		Button bt=new Button("�α���");
//	 �����ӿ� FlowLayout �� ��������!!
		FlowLayout flow= new FlowLayout();
		f.setLayout(flow);
		f.add(la_id);
		f.add(t_id);
		f.add(la_pw);
		f.add(t_pw);
		f.add(bt);
		
		//�������� ũ�⼳���� ���̰� �ϱ�
		f.setVisible(true);
		f.setSize(200,120);
	}
			
}
