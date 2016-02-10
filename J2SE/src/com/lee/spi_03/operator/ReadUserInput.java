package com.lee.spi_03.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserInput {
	public static void main(String[] args) {
		// 输入流，从键盘接受用户输入
		InputStreamReader isr = new InputStreamReader(System.in);
		// System.in 代表标准输入或者说键盘输入
		BufferedReader br = new BufferedReader(isr);
		// 从控制台读取一行数据
		try {
			// 读取第一个数
			System.out.println("请输入第一个数");
			String s1 = br.readLine();
			// 读取第二个数
			System.out.println("请输入第二个数");
			String s2 = br.readLine();
			// 把String转换成float
			float f1 = Float.valueOf(s1);
			float f2 = Float.valueOf(s2);
			/* 拓展
			 * Float.parseFloat 和 Float.valueOf 和.floatValue() 的区别 :
			 * Float.parseFloat(String)表示把String字符串转换成float原始类型的单精度数值,
			 * 而Float.valueOf(String)是把String字符串转换成float的封装类Float
			 * 而.floatValue()的作用是把封装类的Float转换成原始类型float. 注意：float是数值，而Float是一个类。
			 */
			// java.lang.NumberFormatException 如果输入的不是浮点数,就会报这个错误
			if (f1 > f2) {
				System.out.println("你输入的第一个数比第二个数大");
			} else if (f1 < f2) {
				System.out.println("你输入的第一个数比第二个数小");
			} else {
				System.out.println("两个数相等");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 逻辑运算符
		System.out.println("--- 逻辑运算符 ---");
		int a = 4;
		if(3 > 2 && 5 > 2){
			System.out.println("3大于2 并且 5也大于2");
		}
		if(a < 2 || 3 > 2 ){
			System.out.println("3大于2 或者 4小于2");
		}
		if( !(3  < 2)){
			System.out.println("非 3 < 2");
		}
	}
}
