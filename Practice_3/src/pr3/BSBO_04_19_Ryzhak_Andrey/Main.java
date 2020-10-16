package pr3.BSBO_04_19_Ryzhak_Andrey;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        while (true)
        {
            CallUI();

            Scanner input = new Scanner(System.in);

            switch (input.nextLine())
            {
                case "1":
                    Task_1.Execute();
                    break;
                case "2":
                    Task_2.Execute();
                    break;
                case "3":
                    Task_3.Execute(input);
                    break;
                case "4":
                    Task_4.Execute();
                    break;
                case "5":
                    Task_5.Execute(input);
                    break;
                case "6":
                    Task_6.Execute(input);
                    break;
                case "7":
                    Task_7.Execute(input);
                    break;
                case "8":
                    Task_8.Execute();
                    break;
                case "9":
                    Task_9_10.Execute(input);
                    break;
                case "10":
                    Task_10_11.Execute(input);
                    break;
                case "11":
                    Task_11_12.Execute(input);
                    break;
                case "exit":
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input received! Try again");
                    break;
            }

            WaitKey();
        }
    }

    static void CallUI()
    {
        System.out.println("\nChoose the task to execute:\n");
        for (int i = 0; i < 11; i++)
        {
            System.out.printf("%d. Task %d\n", i + 1, i + 1);
        }
        System.out.print("\t\t\texit - close the program\n> ");
    }

    static void WaitKey() throws IOException
    {
        System.out.println("\nPress Enter to continue...");
        System.in.read();
        System.out.println();
    }
}