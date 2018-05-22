package b;

import java.time.LocalDate;
 
public class Alkalmazott {
	private String name;
	private int payment;
	private static int ageLimit = 65;
	private LocalDate DateofBirth;

	public Alkalmazott(String name, LocalDate DateofBirth, int payment) {
		this.name = name;
		this.DateofBirth = DateofBirth;
		this.payment = payment;
	}

	public int getKor() {
		return java.time.LocalDate.now().getYear() - DateofBirth.getYear();
	}

	public Alkalmazott(String name, LocalDate DateofBirth) {
		this.name = name;
		this.DateofBirth = DateofBirth;
		this.payment = 10000 * getKor();
	}

	public int getEvekNyugdijig() {
		return ageLimit - getKor();
	}

	public String getAdatok() {
		return "Név:" + name + " Születésnap: " + this.DateofBirth + " Kor:" + getKor() + " Fizetés:" + payment
				+ " Nyugdíjig hátralévõ évek:" + getEvekNyugdijig();
	}

	public static void setNyudgijKorhatar(int limit) {
		ageLimit = limit;
	}

	public Alkalmazott getTobbEv(Alkalmazott a1, Alkalmazott a2) {
		if (a1.getEvekNyugdijig() > a2.getEvekNyugdijig())
			return a1;
		else
			return a2;
	}

	public String getHonapnev(int number) {
		String[] months = new String[13];

		months[1] = "Január";
		months[2] = "Február";
		months[3] = "Március";
		months[4] = "Április";
		months[5] = "Május";
		months[6] = "Június";
		months[7] = "Július";
		months[8] = "Augusztus";
		months[9] = "Szeptember";
		months[10] = "Október";
		months[11] = "November";
		months[12] = "December";

		return months[number];

	}
}