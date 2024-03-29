package com.lee.spi_13.swing;

/**
 * JPanel 实现一个JFrame多个布局的组合
 * @author SpiColorPendra
 *
 */
import java.awt.*;
import javax.swing.*;

public class Demo5_JPanel extends JFrame{
	// 定义组件
	JPanel jp1, jp2;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;

	public static void main(String[] args) {
		Demo5_JPanel d = new Demo5_JPanel();
	}

	public Demo5_JPanel() {
		// JPanel默认布局是流布局模式
		jp1 = new JPanel();
		jp2 = new JPanel();

		jb1 = new JButton("胡萝卜");
		jb2 = new JButton("菠菜");
		jb3 = new JButton("萝卜");
		jb4 = new JButton("豆干");
		jb5 = new JButton("南瓜");
		jb6 = new JButton("土豆");
		// 设置布局
		// 添加到JPanel
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		// 把Panel加入到JFrame
		this.add(jp1,BorderLayout.NORTH);
		this.add(jb6, BorderLayout.CENTER);
		this.add(jp2, BorderLayout.SOUTH);
		
		this.setSize(300, 150);
		this.setLocation(200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
