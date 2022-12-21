package com.mc.coffeemanager.service.code;

public enum OrderStatus {
	//enum : 열거형
	//서로 연관된 상수들의 집합
	//서로 연관된 상수들을 편하게 다루기 위한 enum만의 문법과 메소드 제공
	
	/** 주문 클래스
	 * @author 백민정*/
	 
	/** 주문 생성 성공 */
	OK(0,"주문 생성 성공"),
	/** 품절로 인한 주문 실패 */
	FAIL_CAUSE_SOLDOUT(1,"품절로 인한 주문 실패"),
	/** 재고 부족으로 인한 주문 실패 */
	FAIL_CAUSE_STOCK(2,"재고 부족으로 인한 주문 실패"),
	/** 시즌 상품은 시즌 기간에만 구매가 가능합니다.*/
	FAIL_CAUSE_SEASON(3,"시즌 상품은 시즌 기간에만 구매가 가능합니다."),
	/** 주문 생성 완료 */
	COMPLETE(4,"주문 생성 완료");
	
	/** 주문 상태코드*/
	private int code;
	/** 주문 상태 상세 */
	private String desc;
	private OrderStatus(int code,String desc)
	{
		this.code=code;
		this.desc=desc;
	}
	/** 주문 상태가 OK */
	public boolean isOk() {
		return code==OK.code;
	}
	/** 주문 상태가 Complete */
	public boolean isComplete() {
		return code==COMPLETE.code;
	}
	/** 주문 상태가 Fail, FAIL_CAUSE_SOLDOUT,FAIL_CAUSE_STOCK, FAIL_CAUSE_SEASON */
	public boolean isFail() {
		if(code==FAIL_CAUSE_SOLDOUT.code||code==FAIL_CAUSE_STOCK.code||code==FAIL_CAUSE_SEASON.code)
			{return true;}
		return false;
	}
	public String desc() {
		return null;
	}
}
