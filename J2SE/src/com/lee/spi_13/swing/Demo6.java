package com.lee.spi_13.swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * JTextField JPasswordField JLabel
 * 
 * @author SpiColorPendra
 *
 */

public class Demo6 extends JFrame {
	// �������
	JPanel jp1, jp2, jp3;
	JTextField jt1, jt2;
	JPasswordField jpsw;
	JLabel jlb1, jlb2;
	JButton jb1, jb2;

	public static void main(String[] args) {
		Demo6 d = new Demo6();
	}

	public Demo6() {
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();

		jlb1 = new JLabel("�û���:");
		jlb2 = new JLabel("��   ��:");

		jb1 = new JButton("��½");
		jb2 = new JButton("ȡ��");

		jt1 = new JTextField(10);
		jpsw = new JPasswordField(10);

		// ���ò��ֹ���
		this.setLayout(new GridLayout(3, 1));
		// ����������
		jp1.add(jlb1);
		jp1.add(jt1);

		jp2.add(jlb2);
		jp2.add(jpsw);

		jp3.add(jb1);
		jp3.add(jb2);

		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		this.setTitle("�û���¼");
		this.setSize(300, 150);
		this.setLocation(200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}