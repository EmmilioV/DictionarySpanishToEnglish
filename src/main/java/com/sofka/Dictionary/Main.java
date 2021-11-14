package com.sofka.Dictionary;

import javax.swing.*;

public class Main {
    private static String path;

    public static void main(String[] args) {
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
                    break;
                case 2 :
                    break;
                case  3 :
                    break;
                default :
                    option = 0;
            }
        }while(option == 0);
    }

}
