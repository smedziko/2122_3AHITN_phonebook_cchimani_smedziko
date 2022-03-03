package htbla.steyr;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;

import static java.io.File.separator;

public class Main {

    public static void main(String[] args) throws IOException {

        //System.out.println(new File(".").getAbsolutePath());
         File f = new File("testsaetze.csv");
            Scanner sc = new Scanner(f);
        HashSet<String> a = new HashSet<String>();

            while (sc.hasNext()){

                a.add(sc.next());
            }


        }
        }



