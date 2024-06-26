package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymingFunctionalityTest {

    private static final int TEST_VALUE = 4;
    private static final int CAPCITY_OF_STACK = 12;
    private static final int EMPTY_STACK = -1;

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        int testValue = TEST_VALUE;
        rhymer.countIn(testValue);


        int result = rhymer.peek();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.checkCall();
        Assert.assertEquals(true, result);

        rhymer.countIn(888);

        result = rhymer.checkCall();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = CAPCITY_OF_STACK;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = EMPTY_STACK;

        int result = rhymer.peek();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = TEST_VALUE;
        rhymer.countIn(testValue);

        result = rhymer.peek();
        Assert.assertEquals(testValue, result);
        result = rhymer.peek();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = EMPTY_STACK;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = TEST_VALUE;
        rhymer.countIn(testValue);

        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
