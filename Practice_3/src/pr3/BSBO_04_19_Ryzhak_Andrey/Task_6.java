package pr3.BSBO_04_19_Ryzhak_Andrey;

import java.util.Scanner;

public class Task_6
{
    public static void Execute(Scanner input)
    {
        System.out.println("Input a line:");
        String string = input.nextLine();

        System.out.println("\nIn reverse:");
        for (int i = string.length() - 1; i >= 0; i--)
        {
            System.out.print(string.toCharArray()[i]);
        }
    }
}