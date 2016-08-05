/*
 Java.awt  는 os마다 디자인이 틀리다 구지다 그래서 이를 보안한
   API인 Swing을 사용해본닷!
   Swing 의 특징javax.swing 패키지에서 지원한다 코딩방법이
   컴포넌트가 awt와 거의 동일 Button-->JButton
   주의!!
    	  	 awt를 욕해서는 안된다.!
         왜? 눈에 보이지 않는것에 사용
          GUI는 스윙과 awt 조합
   자바의 GUi종류에는 크게 두가지가있다.
   1.Container : 남을 포함하는 컴포넌트-JFrame(BorderLayout= default)
   												,JPanel(FlowLayout= default)
   												컨테이너이지만 단독으로 존재할수없고
   												Frame 에소속되여야하며보이지않음 (Like Div)
   												주용도-Frame 내에서 별도의 개별적 레이아웃을 적용시키고
   												싶을때 사용
   												,Applet(FlowLayout=default)
   2.Visual Component : 포함당하는 컴포넌트   -JButton JCheckbox JTextbox
           
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
	JButton bt=new JButton("전송");
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
		ChatWin cw=new ChatWin("클라이언트오픈");
		
	
		
		
			
	}
}
