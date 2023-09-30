package expections;

import java.io.FileNotFoundException;

public class ThrowsDemo {

    public static void main(String[] args) throws FileNotFoundException {

        ThrowsExample.m1();

    }

    public void m2() throws FileNotFoundException {

        ThrowsExample.m1();

    }


}
