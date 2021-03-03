package be.vdab.util;

/**
 * Recursieve functies
 * @author Arne Van Eycken
 * @version 1.0
 */

public class Recursive {

    /**
     * Recursieve functie die de faculteit van een natuurlijk getal berekend.
     * @param n een natuurlijk getal
     * @return n!
     * */
    public static int faculteit(int n) {
        if (n == 0) return 1;
        else return n * faculteit(n - 1);
    }

    /**
     * Recursieve functie die een natuurlijk getal als parameter meekrijgt en
     * berekend welk getal op die plaats in de reeks van Fibonacci voorkomt.
     * @param n een natuurlijk getal
     * @return Getal op n(de) plaats in de reeks van Fibonacci
     * */
    public static long fib(long n) {
        if ((n == 0) || (n == 1)) return n;
        else return fib(n - 1) + fib(n - 2);
    }

    /**
     * Recursieve functie die een decimaal getal en zijn exponent als parameters meekrijgt
     * en het eerste getal tot de macht van het tweede getal berekend.
     * @param x een rationaal getal
     * @param y een exponent
     * @return x tot de macht y
     * */
    public static double macht(double x, int y) {
        if (y == 0) return 1.0;
        else if (y % 2 == 0) return macht(x * x,y / 2);
        else return x * macht(x,y - 1);
    }

    /**
     * Recursieve functie die de grootste gemene deler van twee getallen berekend.
     * @param x een natuurlijk getal
     * @param y een natuurlijk getal
     * @return Grootste gemende deler van x en y
     * */
    public static double ggd(int x, int y) {
        if (x == y) return x;
        else if (x < y ) return ggd(x,y-x);
        else return ggd(x - y, x);
    }


}
