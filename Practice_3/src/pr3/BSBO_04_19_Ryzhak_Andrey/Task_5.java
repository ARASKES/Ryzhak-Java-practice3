package pr3.BSBO_04_19_Ryzhak_Andrey;

import java.util.Scanner;

public class Task_5
{
    public static void Execute(Scanner input)
    {
        System.out.println("Input a line:");
        String string = input.nextLine();

        System.out.println("In lower case: " + string.toLowerCase());
        System.out.println("In upper case: " + string.toUpperCase());

        System.out.println("Input a line to compare:");
        String secondString = input.nextLine();

        String biggerString = StringCompare(string, secondString);
        if (biggerString != null)
        {
            System.out.println("\nThe bigger string is: " + biggerString);
        }
        else
        {
            System.out.println("The strings are equal");
        }
    }

    static String StringCompare(String str1, String str2) // ASCII table comparison, returns the bigger string or null if they are equal
    {
        String shorterStr = (str1.length() > str2.length()) ? str2 : str1;
        for (int i = 0; i < shorterStr.length(); i++)
        {
            if (str1.charAt(i) > str2.charAt(i))
            {
                return str1;
            }
            else if (str1.charAt(i) < str2.charAt(i))
            {
                return str2;
            }
        }
        return null;
    }
}