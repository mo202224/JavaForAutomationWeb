package MyFirstJavaPackage;

import java.util.Scanner;

public class NestedIfExercise {
    public static void main(String[] args) {
        System.out.println("please enter the value:");
        Scanner Num = new Scanner(System.in);
        double value = Num.nextDouble();

        double oddoreven = value % 2;
        //P = positive  / N=negative
        boolean P = value > 0;
        boolean N = value < 0;
        if ((oddoreven == 0) && (P)) {
            System.out.println("print the value is even and positive ");


        } else if (((oddoreven != 0) && (P))) {
            System.out.println("print the value is odd and positive ");


        } else if ((oddoreven != 0) && (N)) {
            System.out.println("print the value is odd and Negative");


        } else if ((oddoreven == 0) && (N)) {
            System.out.println("print the value is even and Negative");
        }
    }
}



