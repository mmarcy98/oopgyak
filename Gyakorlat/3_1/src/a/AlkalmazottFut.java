package a;

public class AlkalmazottFut {
	public static void main(String[] args) {
		Alkalmazott alk1 = new Alkalmazott();
		 
		alk1.name = "Tomi";
		alk1.payment = 1;
		
		System.out.println(alk1.nevFizSzovegesen());
		
		alk1.fizNovel(10);
		System.out.println(alk1.nevFizSzovegesen());

	}
}