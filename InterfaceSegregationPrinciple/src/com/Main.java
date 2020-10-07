package com;

	public class Main {

		public static void main(String[] args) {
			OnlinePayment onlinePayment = new OnlinePaymentImpl();
			
			onlinePayment.payForOrder();
			
			InPersonPayment  inPersonPayment =new InPersonImpl();
			inPersonPayment.payForOrder();

		}

	}


