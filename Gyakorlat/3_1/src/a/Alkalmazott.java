package a;

public class Alkalmazott {
	String name;
	int payment;
	
 
	public void fizNovel(int paymentIn) {
		payment = payment + paymentIn;
		// payment += paymentIn;
	}
	
	public String nevFizSzovegesen() {
		return "N�v:" + name + " Fitez�s:" + payment;
	}
}