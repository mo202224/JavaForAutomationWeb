package MyFirstJavaPackage;

public class FunctionInJava {
    public static void AVR() {
        int g1, g2, g3;
        float average;
        g1 = 85;
        g2 = 64;
        g3 = 76;
        average = (g1 + g2 + g3) / 3f;
        System.out.println("average = "+ average);
    }

    public static void main(String[] args) {
        AVR();
    }
}

