package com.mc.exception.test;
import com.mc.exception.custom.IllegalPriceException;
import com.mc.exception.custom.TimeOutException;

//object->Product->Computer->SmartPhone
//인터페이스는 다중'구현' 가능
public class SmartPhone extends Computer implements BatteryDetachable,Communicatable{
private String mobileAgency;

public SmartPhone() {

}

public SmartPhone(String brand, String pName, int price, String cpu, int ram, String mobileAgency) {
	super(brand, pName, price, cpu, ram);
	this.mobileAgency = mobileAgency;
}

public String getMobileAgency() {
	return mobileAgency;
}
public void setMobileAgency(String mobileAgency) {
	this.mobileAgency = mobileAgency;
}

public void setPrice(int price) {
	if(price<0)throw new IllegalPriceException();
	this.price=price;
}
public String toString() {
	return "SmartPhone [brand=" + brand + ", pName=" + pName + ", price=" + price + ", cpu=" + cpu + ", ram=" + ram
            + ", mobileAgency=" + mobileAgency + "]";
}
@Override
public void detacheBattery() {
System.out.println("배터리를 분리합니다.");
}
@Override
public void attachBattery() {
	System.out.println("배터리를 결합합니다.");
}
@Override
public void sendMessage() throws TimeOutException {
System.out.println("메세지 전송");
//만약 메세지를 보내는데 시간이 너무 많이 지연된다면 TimeOutException 예외를 발생
if(true) {
		try {
			throw new TimeOutException("기지국 상태가 좋지 않습니다.");
		}finally {
			System.out.println("연결을 완전히 종료합니다.");
		}
  } 
}
@Override
public void receiveMessage() {
System.out.println("메세지 수신");
}
}
