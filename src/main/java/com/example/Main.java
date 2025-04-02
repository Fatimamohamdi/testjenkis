
package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int unusedVariable = 42;

        try {
            int result = 10 / 0; 
        } catch (Exception e) {
   
        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Erreur de lecture du fichier");
        }

        System.out.println("Duplicated code");
        System.out.println("Duplicated code");
    }
}
