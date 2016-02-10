package com.lee.spi_11.sorfarray;

import java.util.Random;

public class Demo {
	public static void main(String[] args) {
		// 随机产生10W个数据 来比较两个排序时间 ,谁跟厉害 0 0
		int[] arr = createArray();
		System.out.println("冒泡排序时间 :" + bufferSort(arr) + "毫秒");
		int[] arr2 = createArray();
		System.out.println("选择排序时间 :" + selectSort(arr2) + "毫秒");
		int[] arr3 = createArray();
		System.out.println("插入排序时间 :" + insertSort(arr3) + "毫秒");
	}

	// 打印数组
	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

	// 随机产生10W个数据的数组
	public static int[] createArray() {
		Random random = new Random();
		int[] arr = new int[100000];
		for (int i = 0; i < 100000; i++) {
			arr[i] = random.nextInt();
		}
		return arr;
	}

	// 冒泡排序
	public static long bufferSort(int arr[]) {
		// 冒泡排序
		// 外层循环控制排序次数
		// 内层循环控制比较次数
		// temp用来交换的时候的所需要的临时变量
		// 定义排序前时间
		long start = System.currentTimeMillis();
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			// 每次排序后 最大的数被放在最上面 就不需要再排序了
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	// 选择排序
	// 选择排序也属于内部排序法，是从欲排序的数据中，按指定的规则
	// 选出某一元素。经过和其他元素重整，再依次原则交换位置后达到排序的目的
	public static long selectSort(int arr[]) {
		long start = System.currentTimeMillis();
		int temp = 0;
		int min = 0;
		int minIndex = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			// 定义一个最小的数
			min = arr[i];
			// 记录最小数的下标
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (min > arr[j]) {
					// 修改最小
					min = arr[j];
					minIndex = j;
				}
			}
			// 推出for循环就找到最小值 ,并且交换.
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		long end = System.currentTimeMillis();
		return end - start;
	}

	// 插入排序法  比较适合 有一定规律的排序
	public static long insertSort(int arr[]) {
		long start = System.currentTimeMillis();
		for (int i = 1; i < arr.length; i++) {
			int insertVal = arr[i];
			// insertVal 准备和前一个数比较
			int index = i - 1;
			// 说明还没有找到适当的位置
			while (index >= 0 && insertVal < arr[index]) {
				// 将把arr[index] 向后移动一位
				arr[index + 1] = arr[index];
				// 让index向前移动
				index--;
			}
			// 将insertVal插入到适当位置
			arr[index + 1] = insertVal;
		}

		long end = System.currentTimeMillis();
		return end - start;
	}
	/*
	 * 冒泡排序时间 :13316毫秒
	 * 选择排序时间 :1587毫秒
	 * 插入排序时间 :3621毫秒
	 */
	
	
	
}
