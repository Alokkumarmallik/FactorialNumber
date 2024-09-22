package JavaBasic;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        int n;
        System.out.print("Enter any number: ");
        
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        
        System.out.print("Factors of " + n + " are: ");
        
        // Loop to find the factors of the number
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // If 'i' divides 'n' perfectly, it's a factor
                System.out.print(i + " ");
            }
        }
    }
}
