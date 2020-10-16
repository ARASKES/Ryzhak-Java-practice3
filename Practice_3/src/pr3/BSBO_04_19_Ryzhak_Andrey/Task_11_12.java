package pr3.BSBO_04_19_Ryzhak_Andrey;


import java.util.Scanner;

public class Task_11_12
{
    public static void Execute(Scanner input)
    {
        final int LATIN_ALPHABET_LENGTH = 26;
        final int CYRILLIC_ALPHABET_LENGTH = 33;

        System.out.print("Input your message: ");
        String message = input.nextLine();

        System.out.print("Input offset: ");
        int baseOffset = input.nextInt();

        StringBuilder encryptedMessage = new StringBuilder();
        for (char c : message.toCharArray())
        {
            int offset = baseOffset;
            char charToAdd = c;

            if (c >= 'a' && c <= 'z')
            {
                offset %= LATIN_ALPHABET_LENGTH;

                if (offset >= 0)
                {
                    if ('z' - c < offset)
                    {
                        offset  -= 'z' - c;
                        charToAdd = (char)('a' - 1 + offset);
                    }
                    else
                    {
                        charToAdd = (char)(c + offset);
                    }
                }
                else
                {
                    if (c - 'a' < offset * -1)
                    {
                        offset += c - 'a';
                        charToAdd = (char)('z' + 1 + offset);
                    }
                    else
                    {
                        charToAdd = (char)(c + offset);
                    }
                }
            }
            else if (c >= 'A' && c <= 'Z')
            {
                offset %= LATIN_ALPHABET_LENGTH;

                if (offset >= 0)
                {
                    if ('Z' - c < offset)
                    {
                        offset  -= 'Z' - c;
                        charToAdd = (char)('A' - 1 + offset);
                    }
                    else
                    {
                        charToAdd = (char)(c + offset);
                    }
                }
                else
                {
                    if (c - 'A' < offset * -1)
                    {
                        offset  += c - 'A';
                        charToAdd = (char)('Z' + 1 + offset);
                    }
                    else
                    {
                        charToAdd = (char)(c + offset);
                    }
                }
            }
            else if (c >= 'а' && c <= 'я')
            {
                offset %= CYRILLIC_ALPHABET_LENGTH;

                if (offset >= 0)
                {
                    if ('я' - c < offset)
                    {
                        offset  -= 'я' - c;
                        charToAdd = (char)('а' - 1 + offset);
                    }
                    else
                    {
                        charToAdd = (char)(c + offset);
                    }
                }
                else
                {
                    if (c - 'а' < offset * -1)
                    {
                        offset  += c - 'а';
                        charToAdd = (char)('я' + 1 + offset);
                    }
                    else
                    {
                        charToAdd = (char)(c + offset);
                    }
                }
            }
            else if (c >= 'А' && c <= 'Я')
            {
                offset %= CYRILLIC_ALPHABET_LENGTH;

                if (offset >= 0)
                {
                    if ('Я' - c < offset)
                    {
                        offset  -= 'Я' - c;
                        charToAdd = (char)('А' - 1 + offset);
                    }
                    else
                    {
                        charToAdd = (char)(c + offset);
                    }
                }
                else
                {
                    if (c - 'А' < offset * -1)
                    {
                        offset  += c - 'А';
                        charToAdd = (char)('Я' + 1 + offset);
                    }
                    else
                    {
                        charToAdd = (char)(c + offset);
                    }
                }
            }

            encryptedMessage.append(charToAdd);
        }

        System.out.print(encryptedMessage.toString());

        input.close();
    }
}
