/*
 Java.awt  �� os���� �������� Ʋ���� ������ �׷��� �̸� ������
   API�� Swing�� ����غ���!
   Swing �� Ư¡javax.swing ��Ű������ �����Ѵ� �ڵ������
   ������Ʈ�� awt�� ���� ���� Button-->JButton
   ����!!
    	  	 awt�� ���ؼ��� �ȵȴ�.!
         ��? ���� ������ �ʴ°Ϳ� ���
          GUI�� ������ awt ����
   �ڹ��� GUi�������� ũ�� �ΰ������ִ�.
   1.Container : ���� �����ϴ� ������Ʈ-JFrame(BorderLayout= default)
   												,JPanel(FlowLayout= default)
   												�����̳������� �ܵ����� �����Ҽ�����
   												Frame ���Ҽӵǿ����ϸ纸�������� (Like Div)
   												�ֿ뵵-Frame ������ ������ ������ ���̾ƿ��� �����Ű��
   												������ ���
   												,Applet(FlowLayout=default)
   2.Visual Component : ���Դ��ϴ� ������Ʈ   -JButton JCheckbox JTextbox
           
 */
package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatWin {
	
	public ChatWin(String a){
	JFrame frame=new JFrame(a);
	JButton bt=new JButton("����");
	JTextArea ta=new JTextArea();
	JTextField tf=new JTextField(15);
	JPanel jp=new JPanel();

	frame.add(jp,BorderLayout.SOUTH);	
	frame.add(ta);
	jp.add(tf);
	jp.add(bt);
	frame.setSize(300,500);
	frame.setVisible(true);
	}

	public static void main(String[]args){		
		ChatWin cw=new ChatWin("Ŭ���̾�Ʈ����");
		
	
		
		
			
	}
}
