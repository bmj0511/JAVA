package com.mc.exception.checked;

import java.net.MalformedURLException;
import java.net.URL;

public class _Exception {
public void studyCheckedException() {
	//Checked Exception은 예외처리가 강제됨
	try {
		URL url= new URL("https://wwww.naver.com");
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getProtocol());
		
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}
}