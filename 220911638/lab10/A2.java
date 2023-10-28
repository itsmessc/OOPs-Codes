package Lab10;

import java.util.*;

class NegativeArraySizeException extends Exception {
    NegativeArraySizeException(String s) {
        super(s);
    }
}

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");

        try {
            int n = sc.nextInt();
            if (n < 0) {
                throw new NegativeArraySizeException("Size of array is negative");
            }

            System.out.println("Enter elements");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Contents:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}
