package com.lee.spi_04.process_control;

import java.util.Iterator;

public class ProcessControl {
	public static void main(String[] args) {
		int a = 10;
		// ���̿������
		if (a > 10) {
			System.out.println("a ���� 10");
		} else if (a == 10) {
			System.out.println("a ���� 10");
		} else {
			System.out.println("a С�� 10");
		}
		// ö�ٺ�Switch���̿���
		Color color = Color.���ڶ�;
		switch (color) {
		case ������:
			System.out.println("������");
			break;
		case ����һ:
			System.out.println("����һ");
			break;
		case ������:
			System.out.println("������");
			break;
		case ���ڶ�:
			System.out.println("���ڶ�");
			break;
		case ������:
			System.out.println("������");
			break;
		case ������:
			System.out.println("������");
			break;
		case ������:
			System.out.println("������");
			break;
		default:
			break;
		}
		
		// for ѭ��
		for (int i = 0; i < 10;i++) {
			System.out.println(i);
		}
		// ��ǿforѭ��
		System.out.println("---------------");
		int[] arrs = {1,3,4,6,8};
		for (int arr : arrs) {
			System.out.println(arr);
		}
		System.out.println("----------------");
		// whileѭ��
		while(true){
			if(a++ > 15){break;}
			System.out.println(a);
		}
	}

	public enum Color {
		������, ����һ, ���ڶ�, ������, ������, ������, ������;
	}
}