package day_17_classObjects_Part2;

public class CapitalOne {

	public static void main(String[] args) {
		
		BankAccount acc1= new BankAccount();
		acc1.accountHolder = " Mehmet OLGUN";
		
		acc1.accountNumber=123456;
		
		acc1.deposit(25000);
		
		acc1.showBalance();
		
		acc1.withdraw(100);
		
		acc1.showBalance();
		
		acc1.charge(50, "table");
		
		acc1.showBalance();
		
	}

}
