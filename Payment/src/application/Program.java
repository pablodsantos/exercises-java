package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Pablo", 0.0, 400.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		//System.out.println(bacc);
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		// realizado acima a conversão de tipos, ou tycasting
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(100.0);
			System.out.println("Empréstimo!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Account acc6 = new Account(1009, "Alexia", 1000.0);
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
	}
}
