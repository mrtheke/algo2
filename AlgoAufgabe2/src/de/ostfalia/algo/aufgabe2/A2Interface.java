package de.ostfalia.algo.aufgabe2;

public interface A2Interface {

	/**
	 * Berechnet die Binomialkoeffizienten (n über k) 
	 * mit Hilfe der Fakultät.
	 * @param n - Wert für n (n >= 0): int. 
	 * @param k - Wert für k (0 <= k <= n): int.
	 * @return n über k: int.
	 */
	public abstract int binomialkoeffizient_Fakultaet(int n, int k);
	
	/**
	 * Liefert die Fatultät der Zahl n.
	 * @param n	- granze Zahl >= 0: int. 
	 * @return Fatultät der Zahl n: int.
	 */
	public abstract int fakultaet(int n);

	/**
	 * Berechnet die Binomialkoeffizienten (n über k) 
	 * iterativ.
	 * @param n - Wert für n (n >= 0): int. 
	 * @param k - Wert für k (0 <= k <= n): int.
	 * @return n über k: int.
	 */
	public abstract int binomialkoeffizient_Iterativ(int n, int k);

	/**
	 * Berechnet die Binomialkoeffizienten (n über k) 
	 * rekursiv.
	 * @param n - Wert für n (n >= 0): int. 
	 * @param k - Wert für k (0 <= k <= n): int.
	 * @return n über k: int.
	 */
	public abstract int binomialkoeffizient_Rekursiv(int n, int k);

	/**
	 * Berechnet die Binomialkoeffizienten (n über k) 
	 * iterativ (Variante).
	 * @param n - Wert für n (n >= 0): int. 
	 * @param k - Wert für k (0 <= k <= n): int.
	 * @return n über k: int.
	 */
	public abstract int binomialkoeffizient_Iterativ2(int n, int k);

	/**
	 * Liefert den Schleifenzähler bzw. Rekursionszähler
	 * zurück.
	 * @return Schleifenzähler bzw. Rekursionszähler: int.
	 */	
	public int getZaehler();

}