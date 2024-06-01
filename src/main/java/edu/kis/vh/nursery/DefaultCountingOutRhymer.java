package edu.kis.vh.nursery;
/**
 * Klasa DefaultCountingOutRhymer odpowiedzialna za zarządzanie tablicą liczb całkowitych
 * oraz operacje takie jak dodawanie, usuwanie i sprawdzanie stanu tablicy.
 */
public class DefaultCountingOutRhymer{

    private static final int INT = 12;
    private int[] numbers = new int[INT];
    private int totalCount = -1;

    /**
     * Zwraca całkowitą liczbę elementów w tablicy.
     *
     * @return całkowita liczba elementów w tablicy
     */
    public int getTotal() {
        return totalCount;
    }

    /**
     * Dodaje nowy element do tablicy, jeśli nie jest pełna.
     *
     * @param in dodaje do tablicy
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++totalCount] = in;
    }

    /**
     * Sprawdza, czy tablica jest pusta.
     *
     * @return zwraca true jeśli tablica nie jest pusta
     */
    public boolean checkCall() {
        return totalCount == -1;
    }

    /**
     * Sprawdza, czy tablica jest pełna.
     *
     * @return zwraca true jeśli tablica jest pełna
     */
    public boolean isFull() {
        return totalCount == 11;
    }

    /**
     * Zwraca ostatni element z tablicy bez jego usuwania.
     *
     * @return ostatni element z tablicy lub -1, jeśli tablica jest pusta
     */
    protected int peekaboo() {
        if (checkCall())
            return -1;
        return numbers[totalCount];
    }

    /**
     * Usuwa i zwraca ostatni element z tablicy.
     *
     * @return ostatni element z tablicy lub -1, jeśli tablica jest pusta
     */
    public int countOut() {
        if (checkCall())
            return -1;
        return numbers[totalCount--];
    }
}