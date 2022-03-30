package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.* ;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            Scanner scr = new Scanner(new File("input.txt"));
            PrintWriter pwr = new PrintWriter("output.txt");
            int count = 1;
            while (scr.hasNext()) {
                String line = scr.nextLine();
               pwr.write("/*" + count + "*/" + line + "\n");
               count = count + 1 ;
            }
            scr.close();
            pwr.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
