import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Initial number to find the largest prime factor of
        long initialNumber = 60085143L;
        System.out.println("The largest prime factor of " + initialNumber + " is: " + largestPrimeFactor(initialNumber));
        
        // Prompt user for a new number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new number to find its largest prime factor: ");
        long userNumber = scanner.nextLong();
        
        // Find and display the largest prime factor of the user-provided number
        System.out.println("The largest prime factor of " + userNumber + " is: " + largestPrimeFactor(userNumber));
        scanner.close();
    }

    public static long largestPrimeFactor(long n) {
        long largestFactor = 1;
        long factor = 2;

        // Divide n by all factors starting from 2
        while (n > 1) {
            if (n % factor == 0) {
                largestFactor = factor;
                n /= factor;
            } else {
                factor++;
            }
        }

        return largestFactor;
    }
}
