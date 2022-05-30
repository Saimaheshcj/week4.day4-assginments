package week4.day3.Assignements;

public class BankInfo {

	public void savings() { 
	System.out.println("saving");
	}
	
	public void fixed() {
		System.out.println("fixed");
	}
	public void deposit() {
		System.out.println("deposit");
	}
	public static void main(String[] args) {
		BankInfo obj =new BankInfo();
		obj.deposit();
		obj.savings();
		obj.fixed();
	}
}
