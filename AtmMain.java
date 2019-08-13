package bank;

public class AtmMain {
	public static void main(String[] args) {
		BankAtm b1=new BankAtm("Wells Fargo","San Francisco",15000,"1234");
		BankAtm b2=new BankAtm("Chase","New York",5000,"2345");
		BankAtm b3=new BankAtm("Suntrust","Atlanta",12500,"3456");
		b1.deposit(1000);
		try {
			b2.withdraw(1);
		}
		catch(BankATMException e) {
			e.printStackTrace();
		}
		b2.deposit(10000);
		try {
			b2.withdraw(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			b3.withdraw(15000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
