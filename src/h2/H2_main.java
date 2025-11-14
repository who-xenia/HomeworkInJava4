package h2;

public class H2_main {

	public static void main(String[] args) {
		boolean x,y,a,b,c;
		
		boolean E1,E2,E3;
		
		int input = 10;
		
		switch(input) {
		case (0):
			x=false;
			y=false;
			break;
		case (1):
			x=false;
			y=true;
			break;
		case (10):
			x=true;
			y=false;
			break;
		case (11):
			x=true;
			y=true;
		default:
			x=false;
			y=false;
		}
		
		// E1 ist wahr, wenn x wahr ist
		E1 = x;
		// E2 ist wahr, wenn y wahr ist
		E2 = y;
		// E3 ist wahr wenn x und y unterschiedlich sind (xor)
		E3 = x^y;
		// a ist wahr, wenn E1 und E2 wahr sind
		a = E1 & E2;
		// b ist wahr wenn E1 oder E3 wahr sind
		b = E1 | E3;
		// C ist y negiert
		c = !y;

	}

}
