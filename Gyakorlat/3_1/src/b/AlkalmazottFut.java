package b;

public class AlkalmazottFut {
	public static void main(String[] args) {
		Alkalmazott alk1 = new Alkalmazott();
		 
		alk1.setName("Tomi"); 
		alk1.setPayment(2);
		
		System.out.println(alk1.nevFizSzovegesen());

		alk1.fizNovel(10);
		System.out.println(alk1.nevFizSzovegesen());
	}
}