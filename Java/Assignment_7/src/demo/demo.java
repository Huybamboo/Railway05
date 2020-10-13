package demo;

public class demo {
	public static void main(String[] args) {
		Account account1 = new Account(1, "A");
		Account account2 = new Account(2, "B");
		
		System.out.println(account1);
		System.out.println(account2);
		
		
		Account.setClassFund(100);
		System.out.println(Account.classFund);
	}

}
