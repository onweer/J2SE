package com.lee.spi_06.this_classmethod;

/*
 * �����  ��ʹ������Դ
 */
public class ClassVariable {
	public static void main(String[] args) {
		Child child = new Child(3,"С��");
		child.joinGame();
		Child child2 = new Child(2,"С��");
		child2.joinGame();
		// ��ʱplayToyMember������Child�๲���ı���
		System.out.println(child.playToyMember == child2.playToyMember);
	}

}

class Child {
	int age;
	String name;
	// ���������
	static int playToyMember;

	public Child(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void joinGame() {
		playToyMember++;
		System.out.println("��ǰһ����" + playToyMember + "�����");
	}
	/*
	 * ע��
	 * ��̬�������ܷ��ʷǾ�̬����
	 */
}