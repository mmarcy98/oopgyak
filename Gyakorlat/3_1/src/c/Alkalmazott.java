package c;
 
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
	
	public boolean getPayLimit(int lower, int upper) {
		if(payment <= upper && payment >= lower)
			return true;
		
		return false;
	}
	
	public double getAdo() {
		return (double)payment * ((double)16 / (double)100);
	}
	
	public boolean getFizNagyobb(Alkalmazott other)  {
		if(payment > other.payment)
			return true;
		
		return false;
	}
}