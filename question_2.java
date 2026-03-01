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

public class question_2
{
/*****************************<countOccurences>****************************
* Description: Recursively counts how many times a given character c appears in the string s.
*
* Parameters: 
*   String s - the string to search through
*   char c - the character to count in the string
*
* Pre: 
*   - s may be null or a valid initialized string
*   - c is any valid character.
*
* Post: 
*   - The original string s is not modified (Strings are immutable).
*   - Returns the number of times character c appears in s.
*   - If s is null or empty, 0 is returned.
*
* Returns: An integer representing the number of occurences of c in s.
*
* Called by: Called by the main()
* Calls: Calls itself recursively
************************************************************************/
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