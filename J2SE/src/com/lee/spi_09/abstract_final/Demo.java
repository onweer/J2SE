package com.lee.spi_09.abstract_final;
/**
 * @version 1.0
 * @author SpiColorPendra
 * @
 */
public class Demo {

}

/*
 * ������ķ������ܱ�ȷ����ʱ��
 * ֻ�ܶ���һ��������,����Animal�࣬�㲢����ȷ��AnimalӦ����
 * ��Щ��Ϊ?��Щ������һ��Animal����ʵ�����еķ��� ����
 * ����Animal���������ж���Ķ���
 * 
 * �����಻��ʵ�ַ��� ֻ�ܶ��壬 	��һ������ ��Dog��̳�Animal�ࡢ
 * �����Animal���еķ���ʵ��
 */


/*
 * ע��:
 * 1.�����಻�ܱ�ʵ����
 * 2.
 */
abstract class Animal{
	int age;
	String name;
	// ������һ�����󷽷�
	abstract public void eat();
}

class Dog extends Animal{
	// ʵ�ָ����eat����
	@Override
	public void eat() {
		
	}
}