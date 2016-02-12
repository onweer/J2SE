package com.lee.spi_16.airplanegame;

import java.awt.Color;

// 这个类实现了 主角的飞机的创建
public class MasterPlant extends AbstractAirPlant implements InterfaceAirPlant {
	Shot s = null;

	// 发射子弹
	@Override
	public void shoot() {
		s = new Shot(this.pointX, this.pointY - 10);
		Thread t = new Thread(s);
		t.start();
		

	}

	// 构造函数给成员变量赋值
	public MasterPlant(int x, int y) {
		this.pointX = x;
		this.pointY = y;
		this.color = Color.CYAN;

	}

}
