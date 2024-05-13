package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int STACK_CAPACITY = 12;
    private static final int EMPTY_STACK = -1;

    private int[] numbers = new int[STACK_CAPACITY];

    private int total = EMPTY_STACK;

    public void countIn(int in) {
        if (!isFull())
            numbers [++total] = in;
    }

    public boolean checkCall() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peek() {
        if (checkCall())
            return -1;
        return numbers [total];
    }

    public int countOut() {
        if (checkCall())
            return -1;
        return numbers [total--];
    }

}
