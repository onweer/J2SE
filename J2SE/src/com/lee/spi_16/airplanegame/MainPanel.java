package com.lee.spi_16.airplanegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.dnd.DragGestureEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JPanel;

public class MainPanel extends JPanel implements KeyListener {
	// 定义主角飞机
	MasterPlant masterP;
	// 定义敌人飞机组 线程安全组
	Vector<EnemyAirPlant> ets = new Vector<EnemyAirPlant>();
	// 定义了敌人飞机数量
	int etsNum = 3;

	public MainPanel() {
		// 设置主角飞机初始位置 长宽
		this.setBackground(Color.BLACK);
		masterP = new MasterPlant(135, 430);
		// 初始化敌人飞机
		for (int i = 0; i < etsNum; i++) {
			EnemyAirPlant et = new EnemyAirPlant((i + 1) * 70, 35);
			ets.add(et);
		}
	}

	// 重写父类paint函数
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 设置机体颜色
		g.setColor(masterP.color);
		// 画机体的三角形
		g.drawLine(masterP.pointX, masterP.pointY, masterP.pointX + 15, masterP.pointY + 25);
		g.drawLine(masterP.pointX, masterP.pointY, masterP.pointX - 15, masterP.pointY + 25);
		g.drawLine(masterP.pointX - 15, masterP.pointY + 25, masterP.pointX + 15, masterP.pointY + 25);
		// 画出炮管
		g.drawLine(masterP.pointX, masterP.pointY - 5, masterP.pointX, masterP.pointY);
		// 画出敌人的飞机
		for (int i = 0; i < ets.size(); i++) {
			g.setColor(ets.get(i).color);
			g.drawLine(ets.get(i).pointX, ets.get(i).pointY, ets.get(i).pointX + 15, ets.get(i).pointY - 25);
			g.drawLine(ets.get(i).pointX, ets.get(i).pointY, ets.get(i).pointX - 15, ets.get(i).pointY - 25);
			g.drawLine(ets.get(i).pointX - 15, ets.get(i).pointY - 25, ets.get(i).pointX + 15, ets.get(i).pointY - 25);
			// 画炮管
			g.drawLine(ets.get(i).pointX, ets.get(i).pointY + 5, ets.get(i).pointX, ets.get(i).pointY);
		}

	}

	// 实现键盘监听接口 用户输入左右方向键 飞机可以移动
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("Move Right");
			masterP.pointX += masterP.speed;
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("Move LEFT");
			masterP.pointX -= masterP.speed;
		}

		// 必须重新绘制窗口
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

}
