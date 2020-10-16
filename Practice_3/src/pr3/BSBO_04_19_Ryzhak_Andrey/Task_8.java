package pr3.BSBO_04_19_Ryzhak_Andrey;

import java.util.ArrayList;

public class Task_8
{
    public static void Execute()
    {
        try
        {
            String s = null;
            String m = s.toLowerCase();
        }
        catch (Exception e)
        {
            System.out.println("Exception caught. The type is: " + e.toString());
        }

        try
        {
            int[] m = new int[2];
            m[8] = 5;
        }
        catch (Exception e)
        {
            System.out.println("Exception caught. The type is: " + e.toString());
        }

        try
        {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        }
        catch (Exception e)
        {
            System.out.println("Exception caught. The type is: " + e.toString());
        }
    }
}