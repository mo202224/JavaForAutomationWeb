package MyFirstJavaPackage;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("please enter num1");
        Scanner Sum = new Scanner(System.in);
        double Num = Sum.nextDouble();
        System.out.println("please enter num2");
        Scanner Sum2 = new Scanner(System.in);
        double Numm = Sum2.nextDouble();


            do {
                System.out.println(Numm + Num);
            }while (Numm != 0 && Num != 0);






    }
}
