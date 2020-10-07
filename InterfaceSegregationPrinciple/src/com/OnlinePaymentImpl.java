package com;

public class OnlinePaymentImpl implements OnlinePayment {

	@Override
	public void payForOrder() {
		
		OnlinePayment.super.payForOrder();
		System.out.println("Only Online Payment is acceptable");
	}

	
}