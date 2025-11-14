package h1;

public class H1_main {

	public static void main(String[] args) {
	int zone = 2;
	double price = 2.0;

	switch (zone) {
	case 1:
		price = price + 0;  // Basispreis
		break;
	case 2:
		price = price + 0.35;
		break;
	case 3 & 4:
		price = price + 0.85;
		break;
	case 5: 
		price = price +1.55;
		break;
		default:
			price = 4;  // pauschal 	
	}
	System.out.println("Der Preis ist = "+price);
	}

}
