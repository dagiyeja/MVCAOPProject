package com.sist.temp;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//공통 모듈 (공통으로 적용되는 것들을 모았다)
@Aspect 
@Component //메모리 할당
/*
 * Before 
 * After-Returning
 * After-Throwing
 * After (에러가 나든 안나든 무조건 수행)
 * */
/*
 * 1)JoinPoint(시점을 정하는 것)
 * 2)PointCut(어떤 메소드를 호출할지)
 * 3)Advice(조인포인트+포인트컷)
 * 4)Aspect(어드바이스 두개가 모인것)
 * */
public class MyAspect { 
	@Before("execution(* com.sist.dao.MyDatabase.o*(..))") //o로 시작한 메서드 전에 오라클 실행/(..):매개변수에 구애받지 X. 있어도 없어도 상관X
	public void getConnection(){
		System.out.println("오라클 연결");
	}
	
	@After("execution(* com.sist.dao.MyDatabase.o*(..))")
	public void disConnection(){
		System.out.println("오라클 해제");
	}
}
