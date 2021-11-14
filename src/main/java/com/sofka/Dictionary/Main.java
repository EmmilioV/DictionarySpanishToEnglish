package com.sofka.Dictionary;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

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
