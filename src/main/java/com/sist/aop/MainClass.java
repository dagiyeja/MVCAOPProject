package com.sist.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.sist.dao.MyDatabase;

@Component("mc")

public class MainClass {
	@Autowired //갖고있는(이미 생성된)데이터를 할당해라(dao)
	MyDatabase dao;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		MainClass mc=(MainClass)app.getBean("mc");
		mc.dao.oinsert();
		mc.dao.oselect();
		mc.dao.oupdate();
		mc.dao.oprint();
	}

}
