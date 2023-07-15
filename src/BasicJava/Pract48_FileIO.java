package BasicJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Pract48_FileIO {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\Bidhu\\Downloads\\Java8_Demos_Notes\\Java8_Demos_Notes\\Java8_StreamAPI.txt";
        //scannerFileRead(filename);
        BufferFileRead(filename);
    }

    public static void BufferFileRead(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) System.out.println(line);
        br.close();
        fr.close();
    }

    public static void scannerFileRead(String filename) throws IOException {
        Path path = Paths.get(filename);
        Scanner sc = new Scanner(path);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}
