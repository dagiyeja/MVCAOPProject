package com.sist.dao;

import org.springframework.stereotype.Repository;

/*
 * 	1)XML(*), Annotation
 * 	2)DI -XML�� ���ؼ� ���� �Ѱ��� :Dependency Injection? new �����ڷ� �޸� �Ҵ����ڸ��� set�޼��忡 ���� ����,init() �޼��� ȣ�� 
 * 	3)AOP=>TX(Ʈ�����), SX(����) -�ݺ����� ȣ���� �ڵ����� ������ /OOP�� ������ ������  //�ؿ� o�� �����ϴ� �޼��� -> �� ȣ��
 * 	4)ORM -������ �����ͺ��̽� �����ϴ� ���α׷� Ex)mybatis
 *  5)MVC 
 *  6)����
 *  7)Ʈ�����
 *  
 *  ���ٽ�
 *  (���� ������ �� �ְ� �Լ�����Ʈ�� ��������)
 *  ���ٽ�, �Ǵ� ���� �Լ��� ���α׷��� ���� ���Ǵ� �������� �͸� �Լ�(Anonymous functions)�� ��Ī�ϴ� ����̴�. 
 * 
 * */
//new
@Repository("md")
public class MyDatabase {
	public void oselect(){
		//����Ŭ ����
		System.out.println("Select Call...");
		//����Ŭ ���� ����
	}
	
	public void oinsert(){
		System.out.println("Insert Call...");
	}

	public void oupdate(){
		System.out.println("Update Call...");
	}
	public void oprint(){
		System.out.println("Print Call...");
	}

	
}
