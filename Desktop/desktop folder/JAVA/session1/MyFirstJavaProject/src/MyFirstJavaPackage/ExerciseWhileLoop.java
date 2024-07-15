package MyFirstJavaPackage;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class ExerciseWhileLoop {
    public static void main(String[] args) {
        System.out.println("please enter value");
        Scanner scan = new Scanner(System.in);
        int NUM = scan.nextInt();



            while (NUM < 10) {
                System.out.println(true);
                NUM++;

            }
              System.out.println("loop is finished when done");
        }
    }

