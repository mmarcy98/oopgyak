package b;

public class Alkalmazott {
	private String name;
	private int payment;
	 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public void fizNovel(int paymentIn) {
		payment = payment + paymentIn;
	}
	
	public String nevFizSzovegesen() {
		return "Név:" + name + " Fitezés:" + payment;
	}
}