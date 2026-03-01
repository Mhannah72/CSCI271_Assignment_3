import java.util.Scanner;

/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* <Malik Hannah>
* <W30626500>
********************************************************************/

public class question_4 {

/*****************************<digitCount>****************************
* Description: Recursively counts how many times a specific digit (d) appears in the integer (n)
*
* Parameters: 
* long n - the number whose digits are being examined
* long d - the digit (0-9) to count within n
*
* Pre: 
* - d must be a single digit between 0 and 9 inclusive
* - n is a valid long integer
*
* Post: 
* - The original value of n is not permanently modified,
* - Returns the number of times d apppears in n
* - If n is negative, it is treated as its absolute value, and if 0, the function returns 0 (no digits left to examine)
*
*
* Returns: A long representing the number of occurences of digit d in n
*
* Called by: Called by the main()
* Calls: Calls itself recursively
************************************************************************/
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
