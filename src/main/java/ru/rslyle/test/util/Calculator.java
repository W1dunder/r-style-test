package ru.rslyle.test.util;

public class Calculator {
	private double s;
	private int n;
	private double p;
	private double x;
	
	private double sn;
	
	public Calculator(double s, int n, double p) {
		this.s = sn = s;
		this.n = n;
		this.p = p / 1200;
		
		this.x = calculateX();
	}

	public double calculateX() {
		return round(s * (p + p / (Math.pow((1 + p), n) - 1)));
	}
	
	public double calculatePn() {
		return round(sn * p);
	}
	
	public double calculateS() {
		return round(x - calculatePn());
	}
	
	public void pay(double sum) {
		sn -= sum;
	}
	
	public double getSn() {
		return round(sn);
	}
	
	public double getX() {
		return x;
	}

	public double round(double x) {
		return (double)(Math.round(x * 100)) / 100;
	}
	
}
