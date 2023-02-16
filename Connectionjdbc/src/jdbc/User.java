package jdbc;

public class User {
	
	
	private String Name;
	private int ID;
	private int Account_No;
	private int Balance;
	
//	public User() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		this.ID = iD;
	}
	public int getAccount_No() {
		return Account_No;
	}
	public void setAccount_No(int account_No) {
		this.Account_No = account_No;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		this.Balance = balance;
	}



	@Override
	public String toString() {
		return "User [Name=" + Name + ", ID=" + ID + ", Account_No=" + Account_No + ", Balance=" + Balance + "]";
	}
	
	
}