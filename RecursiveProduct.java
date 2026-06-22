package mypackage;

import java.util.Scanner;

public class RecursiveProduct {

    // Recursive method to calculate product
    public static int calculateProduct(int[] numbers, int index) {

        // Base case
        if (index == numbers.length - 1) {
            return numbers[index];
        }

        // Recursive call
        return numbers[index] * calculateProduct(numbers, index + 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int product = calculateProduct(numbers, 0);

        System.out.println("\nThe product of the five numbers is: " + product);

        input.close();
    }
}