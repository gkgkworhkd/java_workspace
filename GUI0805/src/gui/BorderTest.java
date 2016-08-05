/*
 * 자바의 gui관련 api 들은 java awt 패키지에 지원한다
 * 특히 윈도우와 같이 다른 컴포넌트들을 포함살 수있는 객체는 배치의 문제를 고민해야하며,
 * 이배치의 종류엔 5가지가있따!!
 * */
package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;

public class BorderTest {

	public static void main(String[] args) {
		Frame frame=new Frame();
		Button bt_north=new Button("북쪽"); 
		Button bt_west=new Button("서쪽"); 
		Button bt_center=new Button("가운데"); 
		Button bt_east=new Button("동쪽"); 
		Button bt_south=new Button("남쪽");
		//borderLayout 을적용하자
		BorderLayout layout=new BorderLayout();
		
		bt_west.setPreferredSize(new Dimension(200,400));
		//frame에 레이아웃을 적용하자
		frame.setLayout(layout);
		//개발자가 레이아웃을 정하지않으면 ,프레임의 해당 객체의디폴트 배치관리자가 적용되고
		//Frame 의경우 디폴트 배치관리자는 BorderLayout 이다.!!
		//또한 개발자가방위를 지정하지않으면 기본은 CENTER이다 
		frame.add(bt_north,BorderLayout.NORTH);
		frame.add(bt_west,BorderLayout.WEST);
		frame.add(bt_center,BorderLayout.CENTER);
		frame.add(bt_east,BorderLayout.EAST);
		frame.add(bt_south,BorderLayout.SOUTH);
		
		frame.setVisible(true);
		frame.setSize(500, 500);
		
	}

}
