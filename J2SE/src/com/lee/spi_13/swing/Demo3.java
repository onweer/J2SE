package com.lee.spi_13.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * ��ʽ����
 * 
 * @author SpiColorPendra
 *
 */
public class Demo3 extends JFrame {
	JButton jb1, jb2, jb3, jb4 = null;

	public static void main(String[] args) {
		Demo3 d = new Demo3();
	}

	public Demo3() {
		jb1 = new JButton("�ŷ�");
		jb2 = new JButton("����");
		jb3 = new JButton("����");
		jb4 = new JButton("����");
		// ���ò���  Ĭ�Ͼ��ж��� ��������FlowLayout.LEFT
		this.setLayout(new FlowLayout());
		// ��ֹ�û��ı䴰���С
		this.setResizable(false);
		// �������
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		
		// init
		this.setTitle("ѧϰ���ֹ�����");
		this.setBounds(600, 400, 200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}