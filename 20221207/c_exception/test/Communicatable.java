package com.mc.exception.test;
import com.mc.exception.custom.TimeOutException;

//인터페이스는 다중상속 가능
public interface Communicatable extends FTP, HTTP {
void sendMessage() throws TimeOutException;
void receiveMessage();
}
