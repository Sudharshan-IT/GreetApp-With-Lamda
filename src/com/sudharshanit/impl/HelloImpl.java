package com.sudharshanit.impl;

import com.sudharshanit.inter.Hello;

public class HelloImpl {
	public static void helloService(Hello hello) {
		String msg = hello.wish("Sudharshan");
		System.out.println(msg);
	}
	public static void main(String[] args) {
		helloService((name)->{
			return "Hello How are you Mr."+name;
		});
	}

}
