package com;

	public class Circle implements Shape {
		public double radius;

		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}

		public double calculateArea() {
			return (22 / 7) * radius * radius;
		}
	}


