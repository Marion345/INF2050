package src;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    public static Scanner readFile;

    static{
        try {
            readFile = new Scanner(new File("Livres.txt"));
        } catch (FileNotFoundException e) {
            System.out.println ("Le fichier n'existe pas");
            System.exit(0);
        }
    }

    public static void print(){
        while(readFile.hasNextLine()){
            String line = readFile.nextLine();
            System.out.println(line);
        }
        readFile.close();
    }
}
