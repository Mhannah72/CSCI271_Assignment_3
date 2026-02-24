import java.util.Scanner;

public class question_3 {

    public static int max(int [] A, int left, int right)
    {
        // Base Case: Only one element left
        if (left == right)
        {
            return A[left];
        }

        // Recursive step: Divide array into two halves
        int mid = (left + right) / 2;
        int maxLeft = max(A, left, mid);
        int maxRight = max(A, mid + 1, right);

        return Math.max(maxLeft, maxRight);
    }


    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int userNum = scanner.nextInt();

        if (userNum <= 0) {
            System.out.println("Array must have at least one element.");
            return;
        }



        int [] A = new int[userNum];
        System.out.print("Enter " + userNum + " integers:");
        for (int i = 0; i < userNum; i++)
        {
            A[i] = scanner.nextInt();
        }

        scanner.close();

        // Call recursive max() function
        int maxVal = max(A, 0, A.length - 1);
        System.out.println("The maximum integer is: " + maxVal);


    }
    
}
