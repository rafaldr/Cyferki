package pl.lait.kalkulator;

public class Dzialania {
	/**
	 * Dodawanie liczb - zwraca wynik a + b
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int dodawanie(int a, int b) {
		return a + b;
	}

	public int odejmowanie(int a, int b) {
		return a - b;
	}

	public int mnozenie(int a, int b) {
		return a * b;
	}

	public int dzielenie(int a, int b) {
		if(b==0){
			System.out.println("Próba dzielenia przez zero jest niedozwolona!");
			return 0;
		}
			
		return a / b;
	}

}
