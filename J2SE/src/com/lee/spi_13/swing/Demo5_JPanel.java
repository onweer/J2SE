package com.lee.spi_13.swing;

/**
 * JPanel ʵ��һ��JFrame������ֵ����
 * @author SpiColorPendra
 *
 */
import java.awt.*;
import javax.swing.*;

public class Demo5_JPanel extends JFrame{
	// �������
	JPanel jp1, jp2;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;

	public static void main(String[] args) {
		Demo5_JPanel d = new Demo5_JPanel();
	}

	public Demo5_JPanel() {
		// JPanelĬ�ϲ�����������ģʽ
		jp1 = new JPanel();
		jp2 = new JPanel();

		jb1 = new JButton("���ܲ�");
		jb2 = new JButton("����");
		jb3 = new JButton("�ܲ�");
		jb4 = new JButton("����");
		jb5 = new JButton("�Ϲ�");
		jb6 = new JButton("����");
		// ���ò���
		// ���ӵ�JPanel
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		// ��Panel���뵽JFrame
		this.add(jp1,BorderLayout.NORTH);
		this.add(jb6, BorderLayout.CENTER);
		this.add(jp2, BorderLayout.SOUTH);
		
		this.setSize(300, 150);
		this.setLocation(200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}