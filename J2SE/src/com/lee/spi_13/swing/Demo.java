package com.lee.spi_13.swing;

import java.awt.Window;

/**
 * Swing��ܵ�ѧϰ
 * ���� : �ṩGUI�û�����
 */
import javax.swing.JFrame;

public class Demo {
	// JFrame ��һ���������� ���������������
	public static void main(String[] args) {
		// ��������
		JFrame jf = new JFrame();
		// ���ô��ڱ���
		jf.setTitle("Hello World!");
		// ���ô��ڴ�С
		jf.setSize(300,	300);
		// ���ô��ڳ�ʼλ��
		jf.setLocation(300, 300);
		// ��ʾ
		jf.setVisible(true);
	}

}