import java.util.Random;

public class Pojam {

	protected String dajPojam() {

		Random rand = new Random();
		int redniBroj = 17;
		redniBroj = rand.nextInt(redniBroj);

		if (redniBroj == 0) {
			return "sedam i po";
		} else if (redniBroj == 1) {
			return "maratonci trce u pocasni krug";
		} else if (redniBroj == 2) {
			return "kad porastem bicu kengur";
		} else if (redniBroj == 3) {
			return "podzemlje";
		} else if (redniBroj == 4) {
			return "mrtav ladan";
		} else if (redniBroj == 5) {
			return "sivi kamion crvene boje";
		} else if (redniBroj == 6) {
			return "senke nad balkanom";
		} else if (redniBroj == 7) {
			return "vratice se rode";
		} else if (redniBroj == 8) {
			return "juzni vetar";
		} else if (redniBroj == 9) {
			return "bumerang";
		} else if (redniBroj == 10) {
			return "jedan na jedan";
		} else if (redniBroj == 11) {
			return "tri palme za dve bitange i ribicu";
		} else if (redniBroj == 12) {
			return "bulevar revolucije";
		} else if (redniBroj == 13) {
			return "otvorena vrata";
		} else if (redniBroj == 14) {
			return "srecni ljudi";
		} else if (redniBroj == 15) {
			return "mali svet";
		} else if (redniBroj == 16) {
			return "mali budo";
		} else {
			return null;
		}

	}
	
}
