package com.lee.spi_03.operator;

public class Operator {
	public static void main(String[] args) {
		System.out.println("---ȡģ%�����---");
		System.out.println("10 % 3 = " + Integer.valueOf(10) % Integer.valueOf("3"));
		System.out.println("---a++ �� ++a �� a+=1������---");
		int a = 1;
		System.out.println("a++ = " + a++);
		a = 1;
		System.out.println("++a = " + ++a);
		a = 1;
		a += 1;
		System.out.println("a += 1 = " + a);
		System.out.println("---��λ�����---");
		System.out.println("a=2;a<<2 = " + (a << 2));
		System.out.println("---   >= <= != > < �Ȳ�����---");
		System.out.println(3 >= 2);
		System.out.println(3 != 2);
		System.out.println(3 <= 2);
	}
}