package com.lee.spi_16.airplanegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.dnd.DragGestureEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JPanel;

public class MainPanel extends JPanel implements KeyListener, Runnable {
	// �������Ƿɻ�
	MasterPlant masterP;
	// ������˷ɻ��� �̰߳�ȫ��
	Vector<EnemyAirPlant> ets = new Vector<EnemyAirPlant>();
	// �����˵��˷ɻ�����
	int etsNum = 3;

	public MainPanel() {

		// �������Ƿɻ���ʼλ�� ����
		this.setBackground(Color.BLACK);
		masterP = new MasterPlant(135, 430);
		// ��ʼ�����˷ɻ�
		for (int i = 0; i < etsNum; i++) {
			EnemyAirPlant et = new EnemyAirPlant((i + 1) * 70, 35);
			ets.add(et);
		}
	}

	// ��д����paint����
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// ���û�����ɫ
		g.setColor(masterP.color);
		// �������������
		g.drawLine(masterP.pointX, masterP.pointY, masterP.pointX + 15, masterP.pointY + 25);
		g.drawLine(masterP.pointX, masterP.pointY, masterP.pointX - 15, masterP.pointY + 25);
		g.drawLine(masterP.pointX - 15, masterP.pointY + 25, masterP.pointX + 15, masterP.pointY + 25);
		// �����ڹ�
		g.drawLine(masterP.pointX, masterP.pointY - 5, masterP.pointX, masterP.pointY);
		// �������˵ķɻ�
		for (int i = 0; i < ets.size(); i++) {
			g.setColor(ets.get(i).color);
			g.drawLine(ets.get(i).pointX, ets.get(i).pointY, ets.get(i).pointX + 15, ets.get(i).pointY - 25);
			g.drawLine(ets.get(i).pointX, ets.get(i).pointY, ets.get(i).pointX - 15, ets.get(i).pointY - 25);
			g.drawLine(ets.get(i).pointX - 15, ets.get(i).pointY - 25, ets.get(i).pointX + 15, ets.get(i).pointY - 25);
			// ���ڹ�
			g.drawLine(ets.get(i).pointX, ets.get(i).pointY + 5, ets.get(i).pointX, ets.get(i).pointY);
		}
		// �ж��ӵ��Ƿ����
		if (this.masterP.s != null) {
			// ����ھʹ����ӵ�
			g.drawRect(this.masterP.s.x, this.masterP.s.y, 3, 3);
		}

	}

	// ʵ�ּ��̼����ӿ� �û��������ҷ���� �ɻ������ƶ�
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("Move Right");
			masterP.pointX += masterP.speed;
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("Move LEFT");
			masterP.pointX -= masterP.speed;
		}
		// ������¿ո� �Ϳ��Կ���
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			this.masterP.shoot();
			System.out.println("Shoot");
		}

		// �������»��ƴ���
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(100);
				this.repaint();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}