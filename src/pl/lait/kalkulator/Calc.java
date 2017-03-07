package pl.lait.kalkulator;

import java.util.Scanner;

public class Calc {
	static Scanner wczytywanieZklawiatury = new Scanner(System.in);

	public static void main(String[] args) {

		// tworzymy nowy obiekt przyklad1 - jako instancja klasy Dzialania
		Dzialania przyklad1 = new Dzialania();

		/*
		 * int wynikiDodawania = przyklad1.dodawanie(5, 6); int
		 * wynikiOdejmowania = przyklad1.odejmowanie(5, 4); int wynikiMnozenia =
		 * przyklad1.mnozenie(5, 6); int wynikiDzielenia =
		 * przyklad1.dzielenie(6, 2);
		 * 
		 * System.out.println("Wynik dodawania dla przyk³ad1: " +
		 * wynikiDodawania);
		 * System.out.println("Wynik odejmowania dla przyk³ad1: " +
		 * wynikiOdejmowania);
		 * System.out.println("Wynik mno¿enia dla przyk³ad1: " +
		 * wynikiMnozenia); System.out.println("Wynik dzielenia dla przyk³ad1: "
		 * + wynikiDzielenia);
		 */
		System.out.print("Podaj swoje imiê: ");
		String imie = wczytajZklawiatury();
		System.out.println("Witaj " + imie);

		int akcjaUzytkownika = 1;
		while (akcjaUzytkownika >= 1 && akcjaUzytkownika <=4) {
			int a;
			System.out.print("Podaj pierwsz¹ liczbê: ");
			a = Integer.parseInt(wczytajZklawiatury());
			int b;
			System.out.print("Podaj drug¹ liczbê: ");
			b = Integer.parseInt(wczytajZklawiatury());

			/*
			 * System.out.println("Wynik dodawania: " + przyklad1.dodawanie(a,
			 * b)); System.out.println("Wynik odejmowania: " +
			 * przyklad1.odejmowanie(a, b));
			 */
			System.out.print("wybierz dzia³anie:\n" 
					+ "1 - dodawanie\n" 
					+ "2 - odejmowanie\n" 
					+ "3 - mno¿enie\n"
					+ "4 - dzielenie\n"
					+ "Ka¿da inna cyfra - koniec\n" 
					+ "wybór: ");
			
			akcjaUzytkownika = Integer.parseInt(wczytajZklawiatury());
			if (akcjaUzytkownika == 1) {

				System.out.println("Wybra³eœ dodawanie (1), wynik: " + przyklad1.dodawanie(a, b));

			} else if (akcjaUzytkownika == 2) {

				System.out.println("Wybra³eœ odejmowanie (2), wynik: " + przyklad1.odejmowanie(a, b));

			} else if (akcjaUzytkownika == 3) {

				System.out.println("Wybra³eœ mno¿enie (3), wynik: " + przyklad1.mnozenie(a, b));

			} else if (akcjaUzytkownika == 4) {

				if (b == 0) {
					System.out.println("Próba dzielenia przez zero jest niedozwolona!");
				} else {
					System.out.println("Wybra³eœ dzielenie (4), wynik: " + przyklad1.dzielenie(a, b));
				}

			} else { // sekcja opcjonalna - ka¿da inna wart. ni¿ 1-4 powoduje zakoñczenie programu
				// nie  ma potrzeby sprawdzania czy rozpoznano komendê
				// jeœli nie rozpoznano (mniej ni¿ 1 lub wiêcej ni¿ 4) - koniec programu
				System.out.println("Nie rozpoznano komendy");

			}
		}
		System.out.println("koniec programu");

	}

	public static String wczytajZklawiatury() {
		return wczytywanieZklawiatury.nextLine().trim();
	}

}
