package com.lee.spi_15.tankgame;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Java ��ͼԭ��
 * 
 * @author SpiColorPendra
 *
 */
public class Demo extends JFrame {
	MyPanle mp = null;

	public static void main(String[] args) {
		Demo d = new Demo();
	}

	public Demo() {
		mp = new MyPanle();
		this.add(mp);

		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

// ����һ�����
class MyPanle extends JPanel {
	// ����JPanel��paint����
	// Graphics �ǻ�ͼ����Ҫ��
	// paint ����������
	@Override
	public void paint(Graphics g) {
		// ���ø��ຯ����ɳ�ʼ��
		super.paint(g);
		// ��һ��Բ
		g.drawOval(10, 10, 30, 30);
	}
}