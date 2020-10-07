package com;

public class MainClass {
	
		public void caluculateArea(Rectangle rectangle) {
			rectangle.setBreadth(2);
			rectangle.setLength(3);
			System.out.println(rectangle.getArea());
		}
	   
		 public static void main(String[] args) {
			 MainClass  mainClass = new MainClass();
			 System.out.println("Area of rectangle is :");
			 mainClass.caluculateArea(new Rectangle());
			 System.out.println("Area of square is :");
			 mainClass.caluculateArea(new Square());
		}
		 }



