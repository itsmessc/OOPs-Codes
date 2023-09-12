import java.util.Scanner;
import java.lang.Math;

class SIne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, sine = 0, y;
        System.out.print("Enter angle in degrees:");
        x = sc.nextDouble();
        y = x;
        x = (Math.PI / 180) * x;
        int i, j, fact;
        for (i = 0; i < 20; i++) {
            fact = 1;
            for (j = 1; j <= (2 * i) + 1; j++) {
                fact *= j;
            }
            sine += (Math.pow(-1, i) * Math.pow(x, (2 * i) + 1)) / fact;
        }
        System.out.println("Sin(" + y + ")=" + sine);
    }
}