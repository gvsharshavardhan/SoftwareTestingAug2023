package expections;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        int nums[] = new int[2];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value for A:");

        nums[0] = sc.nextInt();
        System.out.println("enter value for B:");
        nums[1] = sc.nextInt();
        int c;

        try {
            c = nums[0] / nums[4];//opening a db
        } catch (ArithmeticException ae) {
            c = 10;
        } catch (IndexOutOfBoundsException ie) {
            c = 20;
        } finally {
            System.out.println("im inside finally block");
        }

        System.out.println(c);

    }
}