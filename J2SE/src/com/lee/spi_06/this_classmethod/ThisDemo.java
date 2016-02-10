package com.lee.spi_06.this_classmethod;

public class ThisDemo {
	public static void main(String[] args) {
		Person p = new Person(5,"小明");
		System.out.println(p);
	}

}
/*
 * this 代表了 调用方法的当前对象  this.age ==  p.age
 */
class Person {
	int age;
	String name;

	// 私有构造方法 ,调用类不能创建对象
	private Person() {
	}
	// 开方带参构造接口
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	

}
