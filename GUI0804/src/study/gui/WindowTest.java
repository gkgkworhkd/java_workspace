/*
 * 자바를 포함하여 대부분의 응용프로그램에서는 GUI 컴포넌트를
 * 윈도우에 올려놓을때 배치방법을 결정 지을수있는 기능을 지원한다
 * 자바는 LayoutManager 라는 객체를 제원하고 다음과같이 유형에
 * 맞응 배치관리자를 성택해서 사용하면 된다
 * 
 * 1.BorderLayout(동서남북 센터의 방위가지원되는 배치관리자)
 * 2.FlowLayout(컴포넌트들을 윈도우의 크키 조절에 따라 흐르도록 배치관리자)
 * 3.GridLayout(격자(그리드)모양으로 컴포넌트를 배치하는 배치관리자)
 * 4.GridBagLayout(GridLayout 기능을 보다 세부적으로처리한 레이아웃)
 * 5.CardLayOut(화면에 보여질 컴포넌트를 오직 1개만 노출시키는 배치관리자)
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
		Button bt=new Button("로그인");
//	 프레임에 FlowLayout 을 적용하자!!
		FlowLayout flow= new FlowLayout();
		f.setLayout(flow);
		f.add(la_id);
		f.add(t_id);
		f.add(la_pw);
		f.add(t_pw);
		f.add(bt);
		
		//윈도우의 크기설정및 보이게 하기
		f.setVisible(true);
		f.setSize(200,120);
	}
			
}
