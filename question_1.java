import java.util.Scanner;


public class question_1 {
    
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