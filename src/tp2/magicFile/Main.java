package tp2.magicFile;

import java.io.File;
import java.util.Scanner;

public class Main {

    //Now we want to create a program that takes a file name and prints it s content

    public static void main(String[] args) {
        System.out.println("Give me your file name :)"); //try isi as an input ;)
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        printFileContent(fileName);
    }


    private static String getFileContent(String fileName) {
        try{
            File file = new File("src\\tp2\\magicFile\\" + fileName);
            Scanner reader = new Scanner(file);
            String content = reader.nextLine();
            return content;
        }catch(FileNotFoundException e){
            System.out.println("file not found :/");
            return null;
        }
    }

    private static void printFileContent(String fileName) {
        String data = getFileContent(fileName);
        System.out.println(data);
    }
}
