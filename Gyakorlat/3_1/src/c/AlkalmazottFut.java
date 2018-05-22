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
			System.out.println("A fitezés a megadott (1,15) határok közé esik!");
		else
			System.out.println("A fitezés nem esik a megadott (1,15) határok közé!");
		
		System.out.println("Az adó értéke: " + alk1.getAdo());

		
		Alkalmazott alk2 = new Alkalmazott();
		alk2.setName("Tomi2"); 
		alk2.setPayment(20);
		boolean otherPay = alk1.getFizNagyobb(alk2);
		System.out.println(alk1.nevFizSzovegesen() + " " + alk2.nevFizSzovegesen());
		
		if(otherPay)
			System.out.println("Az alk1 fizetése nagyobb!");
		else
			System.out.println("Az alk2 fizetése nagyobb!");
	}
}