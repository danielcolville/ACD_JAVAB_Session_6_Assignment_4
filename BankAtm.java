package bank;

public class BankAtm {
	private String bankName;
	private String location;
	private double balance;
	private String atmId;//maybe int?
	public BankAtm(String bankName,String location,double balance,String atmId) {
		this.bankName=bankName;
		this.location=location;
		this.balance=balance;
		this.atmId=atmId;
	}
	
	public void withdraw(double amt) throws BankATMException {
		if(amt>balance) {
			throw new BankATMException("Cannot withdraw "+amt+" when you only have "+ balance);
		}
		else if(balance<10000) {
			throw new BankATMException("No withdrawals with balance less than 10000. Current balance is "+balance);
		}
		else {
			balance-=amt;
			System.out.println("Withdrawing "+amt+" leaving new balance as "+balance);
		}
	}
	public void deposit(double amt) {
		balance+=amt;
		System.out.println("Depositing "+amt+ " making new balance "+balance);
	}

	public String getBankName() {
		return bankName;
	}

	public String getLocation() {
		return location;
	}

	public double getBalance() {
		return balance;
	}

	public String getAtmId() {
		return atmId;
	}
}
