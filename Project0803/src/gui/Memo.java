/*
	메모장 디자인 따라하기!
*/
package gui;
import java.awt.Frame; import java.awt.MenuBar;import java.awt.Menu;import java.awt.TextArea;
class Memo{
	public static void main(String[]args){
	/*
		메모장 윈도우선언
		메뉴바선언
		메뉴들
		메뉴아이템들	
	*/
	Frame frame = new Frame("메모장");
	MenuBar bar=new MenuBar();
	String[] m_title={"파일","편집","서식","보기","도움말"};
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