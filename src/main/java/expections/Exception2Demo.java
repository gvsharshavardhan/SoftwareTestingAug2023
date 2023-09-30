package expections;

import java.io.*;

public class Exception2Demo {

    static FileReader fileReader;//null

    public static void main(String[] args) {

        try {
            fileReader = new FileReader("C:\\Test123.txt");//file
        } catch (FileNotFoundException fe) {

        }


        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try {
            while (true) {
                String str = bufferedReader.readLine();
                if (str != null) {
                    System.out.println(str);
                } else {
                    break;
                }
            }

        } catch (IOException io) {
            System.out.println(io);
        }

    }
}