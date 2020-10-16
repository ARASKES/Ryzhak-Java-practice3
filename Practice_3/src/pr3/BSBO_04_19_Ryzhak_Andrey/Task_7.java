package pr3.BSBO_04_19_Ryzhak_Andrey;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_7
{
    public static void Execute(Scanner input)
    {
        int[] numbers = new int[5];
        int exceptionIndex = 0;

        try
        {
            System.out.println("Input numbers:");
            for (int i = 0; i < 5; i++)
            {
                exceptionIndex = i;
                numbers[i] = input.nextInt();
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("That was not a number!!!");
            for (int i = 0; i < exceptionIndex; i++)
            {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}