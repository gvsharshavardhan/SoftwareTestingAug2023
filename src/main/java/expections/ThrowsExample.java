package expections;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {

    public static void m1() throws FileNotFoundException{

            FileReader fr = new FileReader("C:\\text.txt");

    }
}
