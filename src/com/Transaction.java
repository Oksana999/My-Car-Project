package com;

public class Transaction {
	private Car car;
	private Customer customer;
	private long date;
	public Transaction(Car car, Customer customer, long date) {
		super();
		this.car = car;
		this.customer = customer;
		this.date = date;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public long getDate() {
		return date;
	}
	public void setDate(long date) {
		this.date = date;
	}

}
