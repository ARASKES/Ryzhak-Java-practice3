package pr3.BSBO_04_19_Ryzhak_Andrey;

import java.util.*;

public class Task_10_11
{
    public static void Execute(Scanner input)
    {
        String[] blackList = new String[]   {
                "coffee",
                "java",
                "virtual",
                "machine"
        };

        System.out.print("WARNING! Words ");
        for (int i = 0; i < blackList.length; i++)
        {
            if (i != blackList.length - 1)
            {
                System.out.print("\"" + blackList[i] +  "\", ");
            }
            else
            {
                System.out.print("\b\b and \"" + blackList[i] +  "\"");
            }
        }
        System.out.println(" are being censored!\n");

        System.out.print("Input text: ");
        String text = input.nextLine();

        StringBuilder censorshipCopy = new StringBuilder(text);
        text = text.toLowerCase();
        for (String word : blackList)
        {
            StringBuilder replacement = new StringBuilder().append(word.toCharArray()[0]);
            replacement.append("*".repeat(word.length() - 2));
            replacement.append(word.toCharArray()[word.length() - 1]);

            text = text.replace(word, replacement.toString());
        }

        for (int i = 0; i < text.length(); i++)
        {
            if (text.toCharArray()[i] == '*')
            {
                censorshipCopy.setCharAt(i, '*');
            }
        }
        System.out.println("\nCensored text: " + censorshipCopy.toString());

        Map<String, Integer> wordDictionary = new HashMap<>();
        for (String word : blackList)
        {
            wordDictionary.put(word, 0);
        }

        for (int i = 1; i < text.length(); i++)
        {
            if (text.toCharArray()[i] == '*')
            {
                for (Map.Entry<String, Integer> entry : wordDictionary.entrySet())
                {
                    if (text.toCharArray()[i - 1] == entry.getKey().toCharArray()[0])
                    {
                        entry.setValue(entry.getValue() + 1);
                    }
                }
            }
        }

        ArrayList<String> keyList = SortMapToList(wordDictionary);

        System.out.println("\n\tStatistics:");
        for (String key : keyList)
        {
            int value = wordDictionary.get(key);
            System.out.printf("%s used %d time" + ((value == 1) ? "" : "s") + "\n", key, value);
        }

        input.close();
    }

    static ArrayList<String> SortMapToList(Map<String, Integer> map)
    {
        ArrayList<String> sortedKeyList = new ArrayList<>();

        int maxValue = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            if (entry.getValue() > maxValue)
            {
                maxValue = entry.getValue();
            }
        }

        for (int i = maxValue; i > 0; i--)
        {
            for (Map.Entry<String, Integer> entry : map.entrySet())
            {
                if (entry.getValue() == i)
                {
                    sortedKeyList.add(entry.getKey());
                }
            }
        }

        return sortedKeyList;
    }
}