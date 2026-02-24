import java.util.Scanner;

public class question_2
{
    public static int countOccurrences(String s, char c)
    {
        // Base case: If the string is empty, the count is 0.
        if (s == null | s.isEmpty())
        {
            return 0;
        }

        // Recursive step: Check the first character
        int count = 0;
        if (s.charAt(0) == c)
        {
            count++;
        }
        

        //
        return count + countOccurrences(s.substring(1), c);
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        // Reads in string input
        System.out.print("Enter a string (s): ");
        String userString = scanner.nextLine();
        
        // Read the character input
        System.out.print("Enter a single character (c): ");
        char userChar = scanner.next().charAt(0);

        int count = countOccurrences(userString, userChar);

        System.out.println("The character " + userChar + " appears " + count + " times in the string " + userString);

        scanner.close();
        
    }

}