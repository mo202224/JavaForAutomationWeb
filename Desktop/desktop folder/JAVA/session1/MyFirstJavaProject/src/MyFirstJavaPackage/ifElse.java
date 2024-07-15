package MyFirstJavaPackage;

import java.util.Scanner;


public class ifElse {
    public static void main(String[] args) {


        Scanner userinput = new Scanner(System.in);

        System.out.println("what is your salary?");
        int Salary = 0;
        Salary = userinput.nextInt();


        // S = salary ,  P = tax pay rate , TV = Tax value //
        double P1, P2, P3, TV;
        P1 = 0.10;
        P2 = 0.15;
        P3 = 0.20;

        if (Salary == 1000) {
            TV = Salary * P1;
            System.out.println("your tax is:" + TV + "your salary is :" + Salary + "/your salary after tax is:" + (Salary - TV));

        } else if ((Salary > 1000)  && (Salary < 2000)) {
            TV = Salary * P2;
            System.out.println("your tax is:" + TV + "your salary is :" + Salary + "/your salary after tax is:" + (Salary - TV));

        } else if (Salary > 2000) {
            TV = Salary * P3;
            System.out.println("your tax is:"+TV+"your salary is :"+ Salary+ "/your salary after tax is:"+(Salary-TV));

        } else {
            System.out.println("there is no information for the salary under 1000");
        }

    }

}
