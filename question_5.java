import java.util.Scanner;

public class question_5 {

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
