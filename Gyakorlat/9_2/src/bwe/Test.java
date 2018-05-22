package bwe;
 
import java.util.Scanner;
import bwe.BookWithEnum.style;

public class Test {

	public static void main(String[] args) {
		BookWithEnum[] bweArray;
		Scanner sc = new Scanner(System.in);
		style bookStyle = style.ROMANCE;

		System.out.println("Kérem az adatok számát: ");
		int length = sc.nextInt();

		bweArray = new BookWithEnum[length];

		for (int i = 0; i < bweArray.length; i++) {
			System.out.println("Kérem a címet: ");
			String title = sc.next();

			System.out.println("Kérem a szerzõt: ");
			String author = sc.next();

			System.out.println("Kérem a kiadás évét: ");
			int dateOfissue = sc.nextInt();

			System.out.println("Kérem az árat: ");
			int price = sc.nextInt();

			System.out.println("Kérem a stílust: ");
			String styleString = sc.next();

			if (styleString.contains("cook"))
				bookStyle = style.COOK;

			if (styleString.contains("romance"))
				bookStyle = style.ROMANCE;

			if (styleString.contains("other"))
				bookStyle = style.OTHER;

			if (styleString.contains("scifi"))
				bookStyle = style.SCIFI;

			bweArray[i] = new BookWithEnum(title, author, dateOfissue, price, bookStyle);
		}
		sc.close();
		
		bookDataWrite(bweArray);

		BookWithEnum[] bweArray2 = new BookWithEnum[bweArray.length];
		bweArray2 = getBWEStlye(bweArray, style.SCIFI);
		bookDataWrite(bweArray2);
	}

	public static void bookDataWrite(BookWithEnum[] bookArray) {
		System.out.println("");
		for (BookWithEnum b : bookArray)
			if (b != null)
				System.out.println(b.toString());
	}

	public static BookWithEnum[] getBWEStlye(BookWithEnum[] bweArray, style bookStyle) {
		BookWithEnum[] bweTemp = new BookWithEnum[bweArray.length];

		for (int i = 0; i < bweArray.length; i++) {
			if (bweArray[i].getBookStyle() == bookStyle) {
				bweTemp[i] = bweArray[i];
			}
		}

		return bweTemp;
	}

}