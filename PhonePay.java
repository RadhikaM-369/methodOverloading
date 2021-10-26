package com.xworkz.polymorphism;

public class PhonePay {
int amount;
String operator;
long mobileNo;

public PhonePay() {
	System.out.println("PHONE PAY");
	System.out.println("------------------------------------");
}
public void recharge(long mobileNo, String operator,int amount) {
	this.mobileNo=mobileNo;
	this.operator=operator;
	this.amount=amount;
	System.out.println("Mobile No: "+mobileNo);
	System.out.println("Operator: "+operator);
    System.out.println("Amount: "+amount);	
    System.out.println("Mobile recharged successfully");
}
public void recharge(String operator,long mobileNo, int amount) {
	this.mobileNo=mobileNo;
	this.operator=operator;
	this.amount=amount;
	System.out.println("Operator: "+operator);
	System.out.println("Mobile No: "+mobileNo);	
    System.out.println("Amount: "+amount);	
	System.out.println("DTH recharged successfully");
}
}
