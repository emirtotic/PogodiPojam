import java.util.ArrayList;
import java.util.Scanner;

public class PogodiPojam {

	public PogodiPojam() {

	}

	protected void igra() {

		int pokusaji = 5;
		Pojam pojam = new Pojam();
		String trazeniPojam = pojam.dajPojam();

		char[] slovo = new char[trazeniPojam.length()];
		int i = 0;
		while (i < trazeniPojam.length()) {
			slovo[i] = '-';
			if (trazeniPojam.charAt(i) == ' ') {
				slovo[i] = ' ';
			}
			i++;
		}

		System.out.print(slovo);
		System.out.println("	Preostalo pokusaja: " + pokusaji);

		Scanner scanner = new Scanner(System.in);

		ArrayList<Character> chars = new ArrayList<Character>();

		while (pokusaji > 0) {
			System.out.print("\nUnesite slovo: ");
			char x = scanner.next().charAt(0);

			if (chars.contains(x)) {
				System.out.println("Vec ste uneli ovo slovo...");
				continue;
			} else {
				chars.add(x);
			}

			if (trazeniPojam.contains(x + "")) {
				for (int j = 0; j < trazeniPojam.length(); j++) {
					if (trazeniPojam.charAt(j) == x) {
						slovo[j] = x;
					}
				}
			} else {
				pokusaji--;
			}

			if (trazeniPojam.equalsIgnoreCase(String.copyValueOf(slovo))) {
				System.out.println(slovo);
				System.out.println("BRAVO!!! Pogodili ste naslov koji smo trazili - " + trazeniPojam);
				break;
			}

			System.out.println(slovo);
			System.out.println("	Preostalo pokusaja: " + pokusaji);
		}
		if (pokusaji == 0) {
			System.out.println("Niste uspeli da pogodite pojam.");
			System.out.println("Trazeni naslov je bio - " + trazeniPojam);

		}
		scanner.close();
	}

	protected void uvod() {
		System.out.println("		       *** DOBRODOSLI U IGRICU ***\n");
		System.out.println("Potrebno je da pogodite nasumicno izabran naslov domaceg filma ili serije.");
		System.out.println("			Imate 5 pokusaja. Pocnimo!\n");
	}

}
