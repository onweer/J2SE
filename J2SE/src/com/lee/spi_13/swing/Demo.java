package com.lee.spi_13.swing;

import javax.swing.JButton;
/**
 * Swing框架的学习
 * 功能 : 提供GUI用户界面
 */
import javax.swing.JFrame;

public class Demo extends JFrame {
	// JFrame 是一个顶层容器 可以添加其他组件
	JButton jb = null;

	public static void main(String[] args) {
		Demo d = new Demo();
	}

	public Demo() {
		// 创建窗口
		jb = new JButton("JButton");
		// 把JButton放入JFrame里面
		this.add(jb);
		// 创建一个按钮 但是还没有添加
		// 设置窗口标题
		this.setTitle("Hello World!");
		// 设置窗口大小
		this.setSize(300, 300);
		// 设置窗口初始位置
		this.setLocation(300, 300);
		// 显示
		this.setVisible(true);
		// 设置默认关闭 如果不设置就算关闭了窗口 JVM不会退出
		// 保证窗口关闭的时候，JVM也推出
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
