/*
 * 5���� ��ġ �������� gridLayout �� �н��Ѵ�.
 * Grid ���� (����������) row(����ĭ��)=����colum(����ĭ��)=ǥ��
 * java.awt ��Ű���� os�÷����� ���� �������� ���� �� �̶�
 * �̸� ������ GUI��Ű���� ����Ѵ�!!
 * **/
package gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridTest {
	public static void main(String[]args){
		Frame frame=new Frame();
		frame.setLayout(new GridLayout(3,5));
		Button[] bt=new Button[20];
		for(int i=1;i<bt.length;i++){
			bt[i]=new Button(i+"��°");
			frame.add(bt[i]);
		}
		frame.setSize(300, 400);
		frame.setVisible(true);
	}
}
