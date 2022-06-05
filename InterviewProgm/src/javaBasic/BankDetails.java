package javaBasic;

public class BankDetails {
	
	Long accountNumber =326549872355l;
	
	String pName =  "Saro";
	
	int accountBalance = -3500;

	public void getBalance() {
		System.out.println("Account Details "+ accountNumber 	+ pName + 	accountBalance);
	}
	public static void main(String[] args) {
		
		BankDetails r = new BankDetails();
		r.getBalance();

	}

}
