package com;

public class MainClass {
	
		public static void main(String[] args) {
			//AreaofCircle
			Circle circle=new Circle();
			circle.setRadius(6);
		    System.out.println("Area of Circle = "+circle.calculateArea());
		   //AreaofRectangle 	
		    Rectangle  rectangle=new Rectangle();
		    rectangle.setLength(2);
		    rectangle.setWidth(3);
		    System.out.println("Area of Rectangle = "+rectangle.calculateArea());
		}
	}


