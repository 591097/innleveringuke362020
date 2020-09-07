package trinnskatt;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class trinnskatt {

	public static void main(String[] args) {

		int inntekt = parseInt(showInputDialog("Tast inn inntekten til brukeren"));
		int skatt = 0;

		if (inntekt >= 934051) {
			skatt += (inntekt - 934051) * 0.145;
			inntekt = 934051;
		}

		if (inntekt >= 580651) {
			skatt += (inntekt - 580651) * 0.1152;
			inntekt = 580651;
		}
		if (inntekt >= 230951) {
			skatt += (inntekt - 230951) * 0.0241;
			inntekt = 230951;
		}
		if (inntekt >= 164101) {
			skatt += (inntekt - 164101) * 0.0093;
		}
		showMessageDialog(null, "Din skatt kommer på: " + skatt);
	}
}
