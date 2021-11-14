package com.sofka.Dictionary;

import javax.swing.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Options {
    private File file;

    public void register()
    {
        file = new File();

        String spanishWord;
        String englishWord;

        spanishWord =  JOptionPane.showInputDialog("Ingrese la palabra en espanol que desea registrar");
        englishWord =  JOptionPane.showInputDialog("Ingrese la palabra en ingles");

        if(file.writeFile(spanishWord, englishWord))
            JOptionPane.showMessageDialog(null, "Palabra almacenada con exito");
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
        String wordToSearch= JOptionPane.showInputDialog("Ingrese la palabra en espanol que desea buscar en el diccionario").toLowerCase();
        file = new File();
        Map<String, String> dictionary = file.readFile();
        String wordTranslated = dictionary.getOrDefault(wordToSearch, null);

        if(wordTranslated != null )
            JOptionPane.showMessageDialog(null,"La traduccion de: " + wordToSearch + " es: " + wordTranslated);
        else
            JOptionPane.showMessageDialog(null,"La traduccion de: " + wordToSearch + " no se encontro en el diccionario");

    }
}
