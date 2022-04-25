package entities;

public class Person {
	private int number;
	private String holder;
	private double balance;
	
	public Person() {
	}
	
	public Person(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Person(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); //boa pratica de negocios, caso mude a regra ou taxa
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double balance) {
		this.balance += balance;
	}
	
	public void withdrawal(double balance) {
		this.balance -= balance + 5;
	}
	
	@Override
	public String toString() {
		return "Person [number=" + number + ", name=" + holder + ", balance=" + balance + "]";
	}
}
