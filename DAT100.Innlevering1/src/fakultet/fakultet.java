package fakultet;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class fakultet {

	public static void main(String[] args) {
		long heltall = parseInt(showInputDialog("Tast inn heltall"));
		long resultat = heltall;

		if (heltall > 0) {

			for (int i = 1; i <= heltall - 1; i++) {

				// resultat = resultat * i;
				resultat *= i;
			}
		} else {
			showMessageDialog(null, "Tast inn ett tall hørere enn 0");
		}

		showMessageDialog(null, "Fakulteten av tallet " + heltall + " er: " + resultat);
	}
}