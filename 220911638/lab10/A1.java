package Lab10;

import java.util.*;

class Input_Exception extends Exception {

    Input_Exception(String s) {
        super(s);
    }
}

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double n;

        while (true) {
            try {
                System.out.println("Enter number:");
                n = sc.nextDouble();
                if (n == -1) {
                    break;
                } else if (n % 1 != 0) {
                    throw new Input_Exception("Floating number are not allowed");
                } else {
                    sum += n;
                }
            } catch (Input_Exception e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                sc.nextLine();
            }

        }
        System.out.println("Sum:" + sum);
    }
}
