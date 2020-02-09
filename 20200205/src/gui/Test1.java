package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test1 extends JFrame {
	private JButton okBtn;
	private JButton cancelBtn;
	
	public Test1() {//rootpane영역에 얹어줘야 한다
	super("나의 프레임 ^ ^");
	okBtn = new JButton("OK");
	cancelBtn = new JButton("Cancel");
	//BorderLayout manager = new BorderLayout(); //동서남북 패널영역을 잡아주지 않으면 무조건 center에서 출력한다. 한영역에는 하나의 component!!
	//FlowLayout manager = new FlowLayout();
	GridLayout manager = new GridLayout();
	setLayout(manager); 
	//getRootPane().add //this.add(comp) //버튼 넣어주는 방법 1get,2this,3┐
	add(okBtn);
	add(cancelBtn);
	
	init();
	
	}
	public void init() {
		setBounds(100, 100, 500, 100); //Rootpane 영역
	}
	
}
