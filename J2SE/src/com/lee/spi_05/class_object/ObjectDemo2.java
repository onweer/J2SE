package com.lee.spi_05.class_object;

public class ObjectDemo2 {
	public static void main(String[] args) {
		// 创建Student
		Student s = new Student(5,"小明");
		System.out.println(s.age + "---" + s.name);
	}
}

class Student {
	int age;
	String name;

	public Student() {
	}// 无参构造方法

	public Student(int age) {
		this.age = age;
	}
	// 带参构造方法
	public Student(int age,String name) {
		this.age = age;
		this.name = name;
	}
}
