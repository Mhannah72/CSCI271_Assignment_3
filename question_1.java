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

public class question_1 {

/*****************************<recursiveReadString>****************************
* Description: Recursively counts the number of characters in a given string by examining one character at a time
*
* Parameters: String s - the string to be processsed
*
* Pre: 
*   - s is not null.
*   - s has been properly initialized
*
* Post: 
*   - The original string s is not modified (Strings are immutable)
*   - Returns the total number of characters in s.
*   - If s is empty (""), 0 is returned.
*
* Returns: An integer representing the length of the string s.
*
* Called by: Called by the main()
* Calls: Calls itself recursively
************************************************************************/
    public static int recursiveReadString(String s)
    {
        if (s.isEmpty())
        {
            return 0;
        }

        else {
            return 1 + recursiveReadString(s.substring(1));
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String userString;

        System.out.print("Enter a single string: ");
        userString = scanner.nextLine();

        int stringLength = recursiveReadString(userString);

        System.out.println("The length of " + userString + " is " + stringLength);

        scanner.close();
    }
}