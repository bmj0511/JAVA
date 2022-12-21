package com.mc.i_interface;
//인터페이스는 다중상속 가능
public interface Communicatable extends FTP, HTTP {
void sendMessage();
void receiveMessage();
}
