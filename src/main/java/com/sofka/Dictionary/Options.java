package com.sofka.Dictionary;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Options {
    private File file;

    public void register()
    {
        file = new File();

        String spanishWord;
        String englishWord;

        spanishWord =  JOptionPane.showInputDialog("Ingrese la palabra en español que desea registrar");
        englishWord =  JOptionPane.showInputDialog("Ingrese la palabra en ingles");

        if(file.writeFile(spanishWord, englishWord))
            JOptionPane.showMessageDialog(null, "Palabra almacenada con éxito");
        else
            JOptionPane.showMessageDialog(null,"No fue posible almacenar la palabra");

    }

    public  void getAllTranslations()
    {
        file = new File();
        Map<String, String> words;

        words = file.readFile();
        String completeList = "";

        for (Map.Entry<String, String> e : words.entrySet())
        {
            completeList = completeList + e.getKey() + " = " + e.getValue() + "\n";
        }
    
        JOptionPane.showMessageDialog(null, completeList);
    }

    public void getTranslation()
    {

    }
}
