
//201120

package bank;

public class Customer_201120 {

	// 필드
	private String bankAccount;
	private String owner;
	private int balance;

	// 생성자
	public Customer_201120(String bankAccount, String owner, int balance) {
		super();
		this.bankAccount = bankAccount;
		this.owner = owner;
		this.balance = balance;
	}

	
	//get,set메소드
	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호: " + this.bankAccount + " 예금주 이름은: " + this.owner + "잔액은: " + this.balance);
	}
	
	
	
	
	

}
