package com.company;

public class Circle {

	public int radius;
	public Circle() {
		this.radius = 5;
	} //引数なし

	public Circle(int radius) {
		this.radius = radius;
	}//引数あり

	public double getArea() {
		return (radius * radius * 3.14);
	}     //method 面積計算　少数を返す(double型)
	public double getCircumference() {
		return (2 * radius * 3.14);
	} //円周計算
	// fuga
}
