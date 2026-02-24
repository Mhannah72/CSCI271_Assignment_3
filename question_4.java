import java.util.Scanner;


public class question_4 {

    public static long digitCount(long n, long d)
    {
        // Base case: if n becomes 0, there are no more digits to check
        if (n == 0)
        {
            return 0;
        }

        if (n < 0)
        {
            n = -n;
        }

        // Extract the last digit of n
        
        long lastDigit = n % 10;

        // Check if the last digit is equal to D
        long count = 0;
        if (lastDigit == d) {
            count = 1;
        }


        return count + digitCount((n / 10), d);
    }


    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value (N): ");
        long userNum = scanner.nextLong();

        System.out.print("Enter a digit value (D): ");
        long userDigit = scanner.nextLong();

        if (userDigit < 0 || userDigit > 9)
        {
            System.out.print("Invalid digit D. Please enter a single digit between 0-9");
        }

        long numberOfTimes = digitCount(userNum, userDigit);

        System.out.println("The digit (D) " + userDigit + " appears in the number (N) a total of " + numberOfTimes + " times.");

        scanner.close();
    }
    
}
