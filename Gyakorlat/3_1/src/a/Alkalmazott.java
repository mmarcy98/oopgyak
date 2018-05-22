package a;

public class Alkalmazott {
	String name;
	int payment;
	
 
	public void fizNovel(int paymentIn) {
		payment = payment + paymentIn;
		// payment += paymentIn;
	}
	
	public String nevFizSzovegesen() {
		return "Név:" + name + " Fitezés:" + payment;
	}
}