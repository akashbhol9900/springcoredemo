package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.Chandan;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/cfgs/Applicationcontext.xml");
   System.out.println("i love code");
   Chandan cha=(Chandan) context.getBean("seter");
   System.out.println("i wlll marray to code");
   System.out.println(cha);
	}

}
