package com.sofka.Dictionary;

import javax.swing.*;

public class Options {
    private File file;

    public void register()
    {
        file = new File();

        String spanishWord;
        String englishWord;

        spanishWord =  JOptionPane.showInputDialog("Ingrese la palabra en español que desea registrar");
        englishWord =  JOptionPane.showInputDialog("Ingrese la palabra en español que desea registrar");

        if(file.writeFile(spanishWord, englishWord))
            JOptionPane.showMessageDialog(null, "Palabra almacenada con éxito");
        else
            JOptionPane.showMessageDialog(null,"No fue posible almacenar la palabra");

    }

    public  void getAllTranslations()
    {

    }

    public void getTranslation()
    {

    }
}
