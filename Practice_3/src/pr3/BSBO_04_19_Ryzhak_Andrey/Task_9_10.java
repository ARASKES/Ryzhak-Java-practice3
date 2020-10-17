package pr3.BSBO_04_19_Ryzhak_Andrey;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_9_10
{
    public static void Execute(Scanner input)
    {
        System.out.println("Input 10 lines:");
        ArrayList<String> lines = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            lines.add(input.nextLine());
        }

        WhichComesFirst(lines);
    }

    static void WhichComesFirst(ArrayList<String> lines)
    {
        String max = "", min = "";
        for (int i = 0; i < 10; i++)
        {
            if (i == 0)
            {
                min = lines.get(0);
            }

            if (lines.get(i).length() > max.length())
            {
                max = lines.get(i);
            }

            if (lines.get(i).length() < min.length())
            {
                min = lines.get(i);
            }
        }

        if (lines.indexOf(max) < lines.indexOf(min))
        {
            System.out.println("Maximum element comes first");
        }
        else if (lines.indexOf(max) > lines.indexOf(min))
        {
            System.out.println("Minimum element comes first");
        }
        else
        {
            System.out.println("Minimum and maximum elements are the same");
        }
    }
}