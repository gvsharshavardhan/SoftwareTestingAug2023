package expections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {

    public static void main(String[] args) {


        FileReader fr = null; //FileNotException
        try {
            fr = new FileReader("C:\\Test.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        BufferedReader bfr = new BufferedReader(fr);
        try {
            System.out.println(bfr.readLine()); //IOException
            System.out.println(bfr.readLine()); //IOException
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
