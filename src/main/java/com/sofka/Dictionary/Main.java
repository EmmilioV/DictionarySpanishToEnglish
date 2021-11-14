package com.sofka.Dictionary;

import javax.swing.*;

public class Main {
    private static String path;

    public static void main(String[] args) {
        Options options = new Options();
        int option = 0;
        path = "spanish_english.txt";

        do
        {
            option = Integer.parseInt(JOptionPane.showInputDialog("    MENU    \n" +
                    "Digite el numero segun la accion que desee realizar: \n" +
                    "1. Registrar una palabra en español con su traduccion al ingles \n" +
                    "2. Consultar todo el diccionario \n" +
                    "3. Consultar traduccion de una palabra en español"));
            switch (option)
            {
                case 1 :
                    options.register();
                    break;
                case 2 :
                    options.getAllTranslations();
                    break;
                case  3 :
                    break;
                default :
                    option = 0;
            }
        }while(option != 0);
    }

}
