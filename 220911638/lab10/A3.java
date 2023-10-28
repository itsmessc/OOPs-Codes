package Lab10;

import java.util.*;

class EvenNumberException extends Exception {
    EvenNumberException(String s) {
        super(s);
    }
}

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        try {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                throw new EvenNumberException("Even number not allowed");
            }

            System.out.println("Number entered:" + n);

        } catch (EvenNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
