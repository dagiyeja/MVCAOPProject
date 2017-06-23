package com.sist.dao;

import org.springframework.stereotype.Repository;

/*
 * 	1)XML(*), Annotation
 * 	2)DI -XML을 통해서 값을 넘겨줌 :Dependency Injection? new 연산자로 메모리 할당하자마자 set메서드에 값을 주입,init() 메서드 호출 
 * 	3)AOP=>TX(트랜잭션), SX(보안) -반복적인 호출을 자동으로 변경함 /OOP의 단점을 보완함  //밑에 o로 시작하는 메서드 -> 다 호출
 * 	4)ORM -관계형 데이터베이스 연결하는 프로그램 Ex)mybatis
 *  5)MVC 
 *  6)보안
 *  7)트랜잭션
 *  
 *  람다식
 *  (곧장 구현할 수 있게 함수포인트를 가져다줌)
 *  람다식, 또는 람다 함수는 프로그래밍 언어에서 사용되는 개념으로 익명 함수(Anonymous functions)를 지칭하는 용어이다. 
 * 
 * */
//new
@Repository("md")
public class MyDatabase {
	public void oselect(){
		//오라클 연결
		System.out.println("Select Call...");
		//오라클 연결 해제
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
