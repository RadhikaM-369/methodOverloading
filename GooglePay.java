package com.xworkz.polymorphism;

public class GooglePay {
	int creditcardNo;
	String userName;
	String address;
	int amount;
	long mobileNo;
	String operator;
	int mtr_rdr_code;
	long accountId;
	String RRNO;
	int houseNo;
	
	public GooglePay() {
		System.out.println("Google pay");
		System.out.println("--------------------------------------");
	}
	public void payment(int creditcardNo, String userName, int amount) {
		this.creditcardNo=creditcardNo;
		this.userName=userName;
		this.amount=amount;
		System.out.println("credit card bill paid successfully");
	}
	public void payment(long mobileNo, String operator, int amount) {
		this.mobileNo=mobileNo;
		this.operator=operator;
		this.amount=amount;
		System.out.println("postpaid bill paid successfully");
	}
	public void payment(String userName,String address, String RRNO, long accountId, int mtr_rdr_code, int amount) {
		this.userName=userName;
		this.address=address;
		this.RRNO=RRNO;
		this.accountId=accountId;
		this.mtr_rdr_code=mtr_rdr_code;
		this.amount=amount;
		System.out.println("User Name:  "+userName);
		System.out.println("Address: "+address);
		System.out.println("RRNO: "+RRNO);
		System.out.println("Account Id: "+accountId);
		System.out.println("meter reading code: "+mtr_rdr_code);
		System.out.println("Amount= "+amount);
		System.out.println("Electricity bill paid successfully");
	}
	public void payment(String userName,String address, int houseNo, int amount) {
		this.userName=userName;
		this.address=address;
		this.houseNo=houseNo;
		this.amount=amount;
		System.out.println("Water bill paid successfully");
	}
}
