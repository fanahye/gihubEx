package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test1 extends JFrame {
	private JButton okBtn;
	private JButton cancelBtn;
	
	public Test1() {//rootpane������ ������ �Ѵ�
	super("���� ������ ^ ^");
	okBtn = new JButton("OK");
	cancelBtn = new JButton("Cancel");
	//BorderLayout manager = new BorderLayout(); //�������� �гο����� ������� ������ ������ center���� ����Ѵ�. �ѿ������� �ϳ��� component!!
	//FlowLayout manager = new FlowLayout();
	GridLayout manager = new GridLayout();
	setLayout(manager); 
	//getRootPane().add //this.add(comp) //��ư �־��ִ� ��� 1get,2this,3��
	add(okBtn);
	add(cancelBtn);
	
	init();
	
	}
	public void init() {
		setBounds(100, 100, 500, 100); //Rootpane ����
	}
	
}
