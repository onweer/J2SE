package com.lee.spi_02.bdy;

public class BaseDataType {
	public static void main(String[] args) {
		int a = 7;  // 4�ֽ�
		// �ڶ��ֶ��巽ʽ
		Integer aa = new Integer(7); 
		//Integer aa = 7 // �Զ�װ����
		System.out.println("---��������������ռ�ֽ�---");
		System.out.println("Integer: " + Integer.SIZE / 8 + "bytes");
		System.out.println("Double: " + Double.SIZE / 8 + "bytes");
		System.out.println("Character: " + Character.BYTES + "bytes");
		System.out.println("Long: " + Long.BYTES + "bytes");
		System.out.println("---�����������͵ķ�Χ---");
		System.out.println("Integer: " + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		// String����int�����໥ת��
		System.out.println("---String����int�����໥ת��---");
		System.out.println(aa.toString());
		System.out.println(Integer.parseInt("7"));
		// �Զ�����
		System.out.println("---�Զ���������---");
		System.out.println("a:7 + 3.0 = " + (a + 3.0));
		System.out.println("---��ʧ����---");
		System.out.println("a:7 + 3.5 = " + (int) (a + 3.5));
		
	}
}