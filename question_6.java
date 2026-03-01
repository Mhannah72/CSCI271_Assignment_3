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

public class question_6 {
/*****************************<evenSum>****************************
* Description: Recursively calculates the sum of all even numbers in the integer array A starting from the given index
*
* Parameters: int [] A - array of integers to search through, int index - the current position in the array being examined
*
* Pre: A is not null, the index is not less than 0 or does not surpass the length of the array, the array A has been properly initialized.
*
* Post: The function does not modify the original array but instead returns the sum of all even elements from the index to the end of the array
*
* Returns: Describe what value the function returns, if any.
*
* Called by: The main()
* Calls: Calls itself recursively
************************************************************************/
    public static int evenSum(int [] A, int index)
    {

        // Base Case: if we've reached the end of the array
        if (index == A.length) 
        {
            return 0;
        }

        // If current number is even, include it
        if (A[index] % 2 == 0)
        {
            return A[index] + evenSum(A, index + 1);
        }
        
        // Otherwise, skip the value
        else {
            return evenSum(A, index + 1);
        }
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



        int [] numArray = new int[userNum];
        System.out.print("Enter " + userNum + " integers:");
        for (int i = 0; i < userNum; i++)
        {
            numArray[i] = scanner.nextInt();
        }

        scanner.close();

        // Call recursive evenSum() function
        int sumOfEvens = evenSum(numArray, 0);
        System.out.println("The sum of even numbers in the array is " + sumOfEvens);


    }
    
}