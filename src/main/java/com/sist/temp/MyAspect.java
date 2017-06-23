package com.sist.temp;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//���� ��� (�������� ����Ǵ� �͵��� ��Ҵ�)
@Aspect 
@Component //�޸� �Ҵ�
/*
 * Before 
 * After-Returning
 * After-Throwing
 * After (������ ���� �ȳ��� ������ ����)
 * */
/*
 * 1)JoinPoint(������ ���ϴ� ��)
 * 2)PointCut(� �޼ҵ带 ȣ������)
 * 3)Advice(��������Ʈ+����Ʈ��)
 * 4)Aspect(�����̽� �ΰ��� ���ΰ�)
 * */
public class MyAspect { 
	@Before("execution(* com.sist.dao.MyDatabase.o*(..))") //o�� ������ �޼��� ���� ����Ŭ ����/(..):�Ű������� ���ֹ��� X. �־ ��� ���X
	public void getConnection(){
		System.out.println("����Ŭ ����");
	}
	
	@After("execution(* com.sist.dao.MyDatabase.o*(..))")
	public void disConnection(){
		System.out.println("����Ŭ ����");
	}
}
