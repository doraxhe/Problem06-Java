package cd.get.ready.algorithms;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testOne(){
        Fibonacci fib = new Fibonacci();
        int actual = fib.getFibonacciValue(6);
        int expected = 8;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTwo(){
        Fibonacci fib = new Fibonacci();
        int actual = fib.getFibonacciValue(15);
        int expected = 610;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThree(){
        Fibonacci fib = new Fibonacci();
        int actual = fib.getFibonacciValue(0);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFour(){
        Fibonacci fib = new Fibonacci();
        int actual = fib.getFibonacciValue(1);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
}