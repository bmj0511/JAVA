package com.mc.exception.test;
import java.util.concurrent.TimeoutException;

import com.mc.exception.custom.TimeOutException;

public class Run {
	public static void main(String[] args) {
		SmartPhone phone=new SmartPhone();
		//phone.setPrice(-10);
		
		try {
		phone.setPrice(-10);
		phone.sendMessage();
		}catch(TimeOutException e) {
			e.printStackTrace();
		}
	}
}
