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

public class question_5 {

/*****************************<reverseString>****************************
* Description: Recursively reverses the characters in a given String.
*
* Parameters: String s - the string being reversed
*
* Pre:
* - May be null or a valid String object
* - If s is not null
* - It is has been properly initialized
*
* Post: 
* - The orignal String s is not modified
* - A new String is returned containing the characters of s in reverse order
* - Ff s is empty (""), the empty string is returned.
*
* Returns: A new String that is the reverse of s.
*
* Called by: Called by the main()
* Calls: Calls itself recursively
************************************************************************/
    public static String reverseString(String s)
    {
       if (s == null || s.isEmpty())
        {
            return s;
        }

        else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userString = scanner.nextLine();

        scanner.close();

        String backwardString = reverseString(userString);

        System.out.println(userString + " backwards is " + backwardString);

    }
    
}
