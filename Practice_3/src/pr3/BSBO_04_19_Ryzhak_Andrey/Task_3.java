package pr3.BSBO_04_19_Ryzhak_Andrey;

import java.util.Scanner;

public class Task_3
{
    public static void Execute(Scanner input)
    {
        System.out.println("Input a line:");
        String string = input.nextLine();

        for (int i = 0 ; i < string.length(); i++)
        {
            System.out.println(string.toCharArray()[i]);
        }
    }
}