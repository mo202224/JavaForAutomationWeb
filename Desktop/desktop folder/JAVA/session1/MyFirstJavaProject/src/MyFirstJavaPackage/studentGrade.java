package MyFirstJavaPackage;

import java.util.Scanner;
// A=80 , F = 75.5//
public class studentGrade {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Please write your Assignment grade here:");
        float A = 0;
        A = userinput.nextFloat();

        System.out.println("please write your Final Exam grade here:");
        float F =0;
            F = userinput.nextFloat();

        //FG=final grade//
       float FG;
       FG = F+A;
       float o;
       o = FG/200;

        System.out.println(("your final grade is :"+FG));
        System.out.println(("your final score by percentage is :"+o*100)+"%");



    }
}
