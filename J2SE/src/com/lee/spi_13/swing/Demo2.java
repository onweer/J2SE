package com.lee.spi_13.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * BorderLayout
 * 
 * @author SpiColorPendra
 *
 */
public class Demo2 extends JFrame {
	JButton jb1, jb2, jb3, jb4, jb5;

	public static void main(String[] args) {
		Demo2 demo2 = new Demo2();

	}

	public Demo2() {
		// �������
		jb1 = new JButton("��");
		jb2 = new JButton("��");
		jb3 = new JButton("��");
		jb4 = new JButton("��");
		jb5 = new JButton("��");
		// �������
		this.add(jb1, BorderLayout.CENTER);
		this.add(jb2, BorderLayout.NORTH);
		this.add(jb3, BorderLayout.EAST);
		this.add(jb4, BorderLayout.SOUTH);
		this.add(jb5, BorderLayout.WEST);
		// �в����Զ����ڴ�С
		// init
		this.setTitle("ѧϰ���ֹ�����");
		this.setBounds(600, 400, 400, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}