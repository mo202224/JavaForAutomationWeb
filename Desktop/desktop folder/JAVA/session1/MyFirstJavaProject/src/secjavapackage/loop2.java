package secjavapackage;

import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        System.out.println("please enter value between 1 to 100:");
        Scanner loop = new Scanner(System.in);
        double value = loop.nextDouble();

        if (value > 1 && value < 100) {
            System.out.println("the number you entered is valid");

            if ((value != 100) && (value < 100 && value > 50)) {
                System.out.println("the value not= 100 and value between 50 to 100");
            }



        }
    }
}