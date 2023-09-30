package oops;

public class Calculator {

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int[] a) {
        int total = 0;

        for (int x : a) {
            total = total + x;
        }
        return total;
    }

}
