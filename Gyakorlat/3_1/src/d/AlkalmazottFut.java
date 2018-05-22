package d;
 
public class AlkalmazottFut {
	public static void main(String[] args) {
		Alkalmazott[] alkTomb = new Alkalmazott[4];
		
		alkTomb[0] = new Alkalmazott();
		alkTomb[1] = new Alkalmazott();
		alkTomb[2] = new Alkalmazott();
		alkTomb[3] = new Alkalmazott();
		
		alkTomb[0].setName("Tomi1"); 
		alkTomb[0].setPayment(0); 
		alkTomb[1].setName("Tomi2"); 
		alkTomb[1].setPayment(200); 
		alkTomb[2].setName("Tomi3"); 
		alkTomb[2].setPayment(15); 
		alkTomb[3].setName("Tomi4"); 
		alkTomb[3].setPayment(2); 
		
		
		for(Alkalmazott a : alkTomb)
			System.out.println(a.nevFizSzovegesen());
		
		System.out.println("");
	
		
		int maxPay = alkTomb[0].getPayment();
		for(int i=0;i<alkTomb.length;i++) {
			if(alkTomb[i].getPayment() > maxPay)
				maxPay = alkTomb[i].getPayment();
		}
		System.out.println("A legmagabb fizetés: " + maxPay);

		for(Alkalmazott a : alkTomb) {
			if(a.getPayment() == maxPay)
				System.out.println("A legmagasabb fizetésû alkalmazott adatai: " + a.nevFizSzovegesen());
		}
		
		
		// mashogyan, szebb megoldas
		int maxi = 0;
		for(int i=0;i<alkTomb.length;i++) {
			if(alkTomb[i].getPayment() > alkTomb[maxi].getPayment())
				maxi = i;
			}
		System.out.println("A legmagasabb fizetésû alkalmazott adatai: " + alkTomb[maxi].nevFizSzovegesen());
		
		
		
	
		System.out.println("");
		
		int db = 0;
		for(Alkalmazott a : alkTomb)  {
			if(a.getPayLimit(0, 19))  {
				db++;
			}
		}
		System.out.println("A [0,10] fizetésû intervallumba esõ alkalmazottak száma: " + db);
			
		System.out.println("");
		
		double sumTax = 0;
		for(Alkalmazott a : alkTomb)  {
			sumTax = sumTax + a.getAdo();
		}
		System.out.println("Az alkalmazottak által befizett adó összesen: " + sumTax);		
	}
}