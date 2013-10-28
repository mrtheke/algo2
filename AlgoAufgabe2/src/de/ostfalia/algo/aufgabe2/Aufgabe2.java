package de.ostfalia.algo.aufgabe2;

import java.util.Scanner;


public class Aufgabe2 implements A2Interface {

	/**
	 * @param args
	 */

	public static Aufgabe2 a2 = new Aufgabe2();
int zaehler = 0;

	public static void main(String[] args) {
		
		int ergebnis = 0;
		Scanner scan = new Scanner(System.in);
System.out.println("Wählen Sie die Art der Berechnung von n über k aus:");
		System.out.println("1 für binomialkoeffizient_Fakultaet \n"
				+ "2 für binomialkoeffizient_Iterativ \n"
				+ "3 für binomialkoeffizient_Rekursiv \n"
				+ "4 für binomialkoeffizient_Iterativ2 \n" + "5 fakultaet \n"
				+ "Ihre Eingabe:");

		int choice = scan.nextInt();
		switch (choice) {
		case 1: // binomialkoeffizient_Fakultaet
			System.out.print("n: ");
			int n1 = scan.nextInt();
			System.out.print("k: ");
			int k1 = scan.nextInt();
			ergebnis = a2.binomialkoeffizient_Fakultaet(n1, k1);

			break;
		case 2: // binomialkoeffizient_Iterativ(int n, int k)
			System.out.print("n: ");
			int n2 = scan.nextInt();
			System.out.print("k: ");
			int k2 = scan.nextInt();
			ergebnis = a2.binomialkoeffizient_Iterativ(n2, k2);

			break;
		case 3: // binomialkoeffizient_Rekursiv(int n, int k)
			System.out.print("n: ");
			int n3 = scan.nextInt();
			System.out.print("k: ");
			int k3 = scan.nextInt();
			ergebnis = a2.binomialkoeffizient_Rekursiv(n3, k3);

			break;
		case 4: // binomialkoeffizient_Iterativ2(int n, int k)
			System.out.print("n: ");
			int n4 = scan.nextInt();
			System.out.print("k: ");
			int k4 = scan.nextInt();
			ergebnis = a2.binomialkoeffizient_Iterativ2(n4, k4);

			break;
		case 5: // fakultaet(int n)
			System.out.print("n: ");
			int n5 = scan.nextInt();
			ergebnis = a2.fakultaet(n5);

			break;
		default:
			System.out.println("Falsche Eingabe");
			System.exit(0);

		}

		System.out.println("Ergebnis: " + ergebnis);
		System.out.println("Schleifendurchläufe: " + a2.getZaehler());

		scan.close();
	}
	

	@Override
	public int binomialkoeffizient_Iterativ2(int n, int k) {

		int ergebnis;
		int diff = n - k;
		int anfang = diff + 1;
		int zaehlerbruch = anfang;
		int nenner = fakultaet(k);

		for (int i = 1; i < k; i++) {
getZaehler();
			zaehlerbruch = (anfang + i) * zaehlerbruch;
		}
		ergebnis = zaehlerbruch / nenner;

		return ergebnis;
	}

	@Override
	public int binomialkoeffizient_Fakultaet(int n, int k) {
		int ergebnis;
		int diff = (n - k);
		ergebnis = fakultaet(n) / (fakultaet(k) * fakultaet(diff));
		zaehler = 1;
		return ergebnis;
	}

	@Override
	public int fakultaet(int n) {
		int ergebnis = 1;
		if (n != 0) {
			for (int i = 1; i <= n; i++) {
				
				ergebnis = i * ergebnis;

			}
		}
		return ergebnis;
	}

	@Override
	public int binomialkoeffizient_Iterativ(int n, int k) {
		int ergebnis = 1;
		if (k == 0) {
			zaehler = 1;
			ergebnis = 1;
		} else {
			ergebnis = 1;
			for (int i = 1; i <= k; i++) {
				getZaehler();
				ergebnis = ergebnis * (n - i + 1) / i;

			}
		}
		return ergebnis;
	}

	@Override
	public int binomialkoeffizient_Rekursiv(int n, int k) {
		int ergebnis = 1;
		if (n == 0 || k == 0 || k == n) {
			getZaehler();
			return ergebnis;
		}
		ergebnis = (n * binomialkoeffizient_Iterativ(n - 1, k - 1) / k);
		getZaehler();
		return ergebnis;
	}

	@Override
	public int getZaehler() {
		zaehler++;
		return zaehler;
	}

}
