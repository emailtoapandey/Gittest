package CoreJava;

public class Pr3 {
	
private String  account;

private int balance;

public String  getAccount() {
	
	
	return account;
	
	
}
	
public void setAccount(String account) {
	
	this.account=account;
	
}
 

	public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Pr3 pr=new Pr3();
	
	pr.setAccount("Savings");
	pr.setBalance(50000000);
	System.out.println(pr.getAccount());
			
	System.out.println(pr.getBalance());
			
		}
	
	}

