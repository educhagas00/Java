package entities;

public class Account {
	
	private String name;
	private int account_number;
	private double ballance;
	
	public Account(String name, int account_number, double ballance) {
		this.account_number = account_number;
		this.name = name;
		this.ballance = ballance;
	}
	
	public Account(String name, int account_number) {
		this.account_number = account_number;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAccount_number() {
		return account_number;
	}

	public double getBallance() {
		return ballance;
	}

	public void setBallance(double ballance) {
		this.ballance = ballance;
	}
	
	public void Deposit(double deposit) {
		this.ballance = ballance + deposit;
	}
	
	public void Withdraw(double withdraw) {
		this.ballance = ballance - (withdraw + 5);
	}
	
	public String toString() {
		return "Account: " 
				+this.account_number
				+", Holder: "
				+this.name
				+", Balance: $ "
				+ String.format("%.2f", ballance);
	}

}
