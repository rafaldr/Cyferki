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
		 * System.out.println("Wynik dodawania dla przyk�ad1: " +
		 * wynikiDodawania);
		 * System.out.println("Wynik odejmowania dla przyk�ad1: " +
		 * wynikiOdejmowania);
		 * System.out.println("Wynik mno�enia dla przyk�ad1: " +
		 * wynikiMnozenia); System.out.println("Wynik dzielenia dla przyk�ad1: "
		 * + wynikiDzielenia);
		 */
		System.out.print("Podaj swoje imi�: ");
		String imie = wczytajZklawiatury();
		System.out.println("Witaj " + imie);

		int akcjaUzytkownika = 1;
		while (akcjaUzytkownika >= 1 && akcjaUzytkownika <=4) {
			int a;
			System.out.print("Podaj pierwsz� liczb�: ");
			a = Integer.parseInt(wczytajZklawiatury());
			int b;
			System.out.print("Podaj drug� liczb�: ");
			b = Integer.parseInt(wczytajZklawiatury());

			/*
			 * System.out.println("Wynik dodawania: " + przyklad1.dodawanie(a,
			 * b)); System.out.println("Wynik odejmowania: " +
			 * przyklad1.odejmowanie(a, b));
			 */
			System.out.print("wybierz dzia�anie:\n" 
					+ "1 - dodawanie\n" 
					+ "2 - odejmowanie\n" 
					+ "3 - mno�enie\n"
					+ "4 - dzielenie\n"
					+ "Ka�da inna cyfra - koniec\n" 
					+ "wyb�r: ");
			
			akcjaUzytkownika = Integer.parseInt(wczytajZklawiatury());
			if (akcjaUzytkownika == 1) {

				System.out.println("Wybra�e� dodawanie (1), wynik: " + przyklad1.dodawanie(a, b));

			} else if (akcjaUzytkownika == 2) {

				System.out.println("Wybra�e� odejmowanie (2), wynik: " + przyklad1.odejmowanie(a, b));

			} else if (akcjaUzytkownika == 3) {

				System.out.println("Wybra�e� mno�enie (3), wynik: " + przyklad1.mnozenie(a, b));

			} else if (akcjaUzytkownika == 4) {

				if (b == 0) {
					System.out.println("Pr�ba dzielenia przez zero jest niedozwolona!");
				} else {
					System.out.println("Wybra�e� dzielenie (4), wynik: " + przyklad1.dzielenie(a, b));
				}

			} else { // sekcja opcjonalna - ka�da inna wart. ni� 1-4 powoduje zako�czenie programu
				// nie  ma potrzeby sprawdzania czy rozpoznano komend�
				// je�li nie rozpoznano (mniej ni� 1 lub wi�cej ni� 4) - koniec programu
				System.out.println("Nie rozpoznano komendy");

			}
		}
		System.out.println("koniec programu");

	}

	public static String wczytajZklawiatury() {
		return wczytywanieZklawiatury.nextLine().trim();
	}

}
