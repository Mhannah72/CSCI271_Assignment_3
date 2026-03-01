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

public class question_3 {

/*****************************<max>****************************
* Description: Recursively finds and returns the maximum value in a specified portion of an integer array using a divide-and-conquer approach.
*
* Parameters: 
*   int [] A - the array containing integer values
*   int left - the starting index of the portion to examine
*   int right - the ending index of the portion to examine
*
* Pre: 
*   - A is not null
*   - A.length > 0
*   - 0 <= left <= right < A.length
*   - The array A has been properly initialized
*
* Post:
*   - The array A is not modified
*   - Returns the largest value stored betwen indices left and right (inclusive).
*
* Returns: 
*   - An intger representing the maximum value in A
*   - From index left to index right
*
* Called by: Called by main()
* Calls: Calls itself recursively
************************************************************************/
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
