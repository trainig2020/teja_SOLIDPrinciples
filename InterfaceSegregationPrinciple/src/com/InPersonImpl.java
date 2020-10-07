package com;

public class InPersonImpl implements InPersonPayment{

	@Override
	public void payForOrder() {
		
		InPersonPayment.super.payForOrder();
		System.out.println("Only In Person Payment is Acceptable");
	}

}
