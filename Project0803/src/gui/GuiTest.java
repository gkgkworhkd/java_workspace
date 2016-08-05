/*
	자바도 다를 응용프로그램처럼 gui를 처리한다
	예)윈도우, 버튼, cheakbox,textarea 등...
	Java에서 GUI컴포넌트는 awt패키지에서 지원한다.
*/
package gui;
import java.awt.Frame;import java.awt.Button;import java.awt.Checkbox;import java.awt.FlowLayout;
import java.awt.TextField; import java.awt.TextArea; import java.awt.Choice;
class GuiTest{
	public static void main(String[]args){
		//모든 GUI컴포넌트가 올려질 윈도우창
		/*
			자바에서 프레임은 디폴트속성이 존재하는데, 기본이
			조이지않는 속성을가지고있다,
			따라서 보이게하자!!

			자바 언어도 Html처럼 각 컴포넌트를 부착하기에 앞서
			어디에 어떻게 붙일지에 대한 디자인 기능이 지원된다.
			이예제는 무시하고가겠다
		*/
		Frame win = new Frame("바보");
		win.setVisible(true);
		win.setSize(500,500);
		Button bt=new Button("버튼");
		bt.setVisible(true);

		FlowLayout flow =new FlowLayout();
		win.setLayout(flow);
		win.add(bt);
		Checkbox[] ch=new Checkbox[4];
		for(int i=0;i<4;i++){
			Checkbox c=new Checkbox("번째박스다");
			ch[i]=c;
			win.add(ch[i]);
		}
		TextField tf= new TextField("바보",20);
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