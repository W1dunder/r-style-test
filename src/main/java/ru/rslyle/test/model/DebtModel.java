package ru.rslyle.test.model;

public class DebtModel {

	private int n;
	
	private String monthYear;
	
	private double mainPay;
	
	private double percentPay;
	
	private double rest;
	
	private double sumPay;

	public DebtModel(int n, String monthYear, double mainPay, double percentPay, double rest, double sumPay) {
		this.n = n;
		this.monthYear = monthYear;
		this.mainPay = mainPay;
		this.percentPay = percentPay;
		this.rest = rest;
		this.sumPay = sumPay;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getMonthYear() {
		return monthYear;
	}

	public void setMonthYear(String monthYear) {
		this.monthYear = monthYear;
	}

	public double getMainPay() {
		return mainPay;
	}

	public void setMainPay(double mainPay) {
		this.mainPay = mainPay;
	}

	public double getPercentPay() {
		return percentPay;
	}

	public void setPercentPay(double percentPay) {
		this.percentPay = percentPay;
	}

	public double getRest() {
		return rest;
	}

	public void setRest(double rest) {
		this.rest = rest;
	}

	public double getSumPay() {
		return sumPay;
	}

	public void setSumPay(double sumPay) {
		this.sumPay = sumPay;
	}
	
	
}
