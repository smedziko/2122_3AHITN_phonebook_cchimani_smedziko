package htbla.steyr;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import static java.io.File.separator;

public class Main {

    public static void main(String[] args) throws IOException {

        //System.out.println(new File(".").getAbsolutePath());
         File f = new File("src/htbla/steyr/testsaetze.csv");
        System.out.println(f.getAbsolutePath());
         Scanner sc = new Scanner(f);
         FileReader r = new FileReader(f);
         StreamOperation so = new StreamOperation();
        Person p = so.fromStream(r);

         ArrayList al = new ArrayList();
         p = so.fromStream(r);
         al.add(p);
        System.out.println(p);



         /*  String[] daten = new String[12];
           Integer i=0;

            while (sc.hasNext()){
                daten[i]=sc.nextLine();
                i++;

            }
            for (int j=0;j<daten.length;j++){
            daten[j].split(";");
            System.out.println(daten[j]);
        }
        System.out.println();

*/
        }
        }



