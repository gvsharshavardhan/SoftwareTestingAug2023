package ArraysDemo;

import java.util.Scanner;

public class ArrayFirstDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fruits[] = new String[5];

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("please enter fruit " + i + " :: ");
            fruits[i] = sc.nextLine();
        }

        for(int i = 0; i < fruits.length; i++){
            System.out.println("fruit " + i + " is " + fruits[i]);
        }


    }
}
