package c;
 
public class AlkalmazottFut {
	public static void main(String[] args) {
		Alkalmazott alk1 = new Alkalmazott();
		
		alk1.setName("Tomi"); 
		alk1.setPayment(2);
		
		System.out.println(alk1.nevFizSzovegesen());

		alk1.fizNovel(12);
		System.out.println(alk1.nevFizSzovegesen());
		
		boolean payLimit = alk1.getPayLimit(1, 15);
		if(payLimit)
			System.out.println("A fitez�s a megadott (1,15) hat�rok k�z� esik!");
		else
			System.out.println("A fitez�s nem esik a megadott (1,15) hat�rok k�z�!");
		
		System.out.println("Az ad� �rt�ke: " + alk1.getAdo());

		
		Alkalmazott alk2 = new Alkalmazott();
		alk2.setName("Tomi2"); 
		alk2.setPayment(20);
		boolean otherPay = alk1.getFizNagyobb(alk2);
		System.out.println(alk1.nevFizSzovegesen() + " " + alk2.nevFizSzovegesen());
		
		if(otherPay)
			System.out.println("Az alk1 fizet�se nagyobb!");
		else
			System.out.println("Az alk2 fizet�se nagyobb!");
	}
}