package com.sofka.Dictionary;

import java.io.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class File {
    private Map<String, String> dictionary;
    private  String path;

    public File()
    {
        path = "spanish_english.txt";
    }

    public Map<String,String> readFile()
    {
        try {
            FileReader fileReader = new FileReader(this.path);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            String[] words = line.split("=");
            dictionary = new HashMap<>();

            while(line!=null)
            {
                words = line.split("=");
                dictionary.put(words[0], words[1]);
                line = reader.readLine();
            }

            dictionary.keySet().stream().sorted((x,y) -> x.compareTo(y));

            reader.close();
            fileReader.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        return dictionary;
    }

    public boolean writeFile(String spanishWord, String englishWord)
    {
        try {
            FileWriter fileWriter = new FileWriter(this.path, true);
            PrintWriter writer = new PrintWriter(fileWriter);

            writer.println(spanishWord.toLowerCase() + "=" + englishWord.toLowerCase());

            writer.close();
            fileWriter.close();

            return true;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
