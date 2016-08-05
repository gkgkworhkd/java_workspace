/*
 * 5가지 배치 관리자중 gridLayout 을 학습한다.
 * Grid 격자 (모눈종이형태) row(가로칸수)=층수colum(세로칸수)=표수
 * java.awt 패키지는 os플랫폼에 따라 디자인이 제각 각 이라서
 * 이를 보완한 GUI패키지를 사용한다!!
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
			bt[i]=new Button(i+"번째");
			frame.add(bt[i]);
		}
		frame.setSize(300, 400);
		frame.setVisible(true);
	}
}
