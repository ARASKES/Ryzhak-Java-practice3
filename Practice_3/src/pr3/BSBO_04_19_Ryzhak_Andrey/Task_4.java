package pr3.BSBO_04_19_Ryzhak_Andrey;

import java.util.Scanner;

public class Task_4
{
    public static void Execute()
    {
        String string = "This is a dog. The dog is good. A positive dog.";
        System.out.println("Current line: " + string + '\n');

        string = string.replace('s', 'x');
        string = string.replace("dog", "cat");

        System.out.println("Changed line: " + string);
    }
}