package pr3.BSBO_04_19_Ryzhak_Andrey;

public class Task_1
{
    public static void Execute()
    {
        String firstName = "Иванов", secondName = "Иван", thirdName = "Иванович";

        System.out.println(firstName + ' ' + secondName + ' ' + thirdName);

        System.out.println("\nThrough \"concat\":\n" + firstName.concat(" ").concat(secondName).concat(" ").concat(thirdName));
    }
}