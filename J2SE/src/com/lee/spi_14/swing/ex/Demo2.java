package com.lee.spi_14.swing.ex;

import javax.swing.JFrame;

import java.awt.BorderLayout;

/**
 * qq聊天窗口
 * @author SpiColorPendra
 *
 */
import javax.swing.*;

public class Demo2 extends JFrame {
	JTextArea jta;
	JScrollPane jsp;
	JPanel jp1;
	JComboBox jcb;
	JTextField jtf;
	JButton jb;

	public static void main(String[] args) {
		Demo2 d = new Demo2();
	}

	public Demo2() {
		jta = new JTextArea();
		jsp = new JScrollPane(jta);
		jp1 = new JPanel();
		String[] chatter = { "马腾", "云马", "李佳" };
		jcb = new JComboBox(chatter);
		jtf = new JTextField(10);
		jb = new JButton("发送");

		jp1.add(jcb);
		jp1.add(jtf);
		jp1.add(jb);

		this.add(jsp);
		this.add(jp1, BorderLayout.SOUTH);
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
