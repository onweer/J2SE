package com.lee.spi_04.process_control;

public class Pyramid {
	// 金字塔的层数
	final static int LAYER = 7;
	public static void main(String[] args) {
		/*
		 * 打印一个金字塔
		 * 		8
		 *     888
		 * 	  88888
		 *   8888888
		 *  888888888
		 * 88888888888
		 *8888888888888
		 * 
		 */
		// 外层控制行数 一共LAYER行
		for (int i = 1; i <= LAYER; i++) {
			// 内层控制列数  一共LAYER * 2 - 1列
			for (int j = 0; j < LAYER * 2; j++) {
				 if(j < LAYER - i){
					 System.out.print(" ");
				 }else if(j > LAYER - i && j < LAYER + i){
					 System.out.print("8");
				 }else{
					 //System.out.print(" ");
				 }
			}
			System.out.println();
		}
	}
}
