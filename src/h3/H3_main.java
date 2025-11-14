package h3;

public class H3_main {

	public static void main(String[] args) {
		float celsiusFloat = 14.2f;
		float fahrenheitFloat;
		double celsiusDouble = 14.2;
		double fahrenheitDouble;
		
		fahrenheitFloat = (celsiusFloat*(9.0f/5.0f))+32;
		
		fahrenheitDouble = (celsiusDouble*(9.0/5.0))+32;
		
		System.out.println(fahrenheitFloat);
		System.out.println(fahrenheitDouble);

	}

}
