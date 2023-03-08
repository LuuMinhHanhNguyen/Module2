package ss16_text_file.copy_file_text;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your source file path here:");
        String sourceFile = scanner.nextLine();
        System.out.println("Enter your target file path here:");
        String targetFile = scanner.nextLine();
        int count = 0;

        try{
            BufferedReader reader =  new BufferedReader(new FileReader("src/ss16_text_file/copy_file_text/" + sourceFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/ss16_text_file/copy_file_text/" + targetFile));
            String line;


            while ((line = reader.readLine()) != null){
                String[] result = line.split(" ");
                System.out.println("There are " + result.length + " words.");
                for (String word : result) {
                   // System.out.println(word);
                    count += word.length();
                }
                writer.write(line + "\n");

            }
            reader.close();
            writer.close();
            System.out.print("Copied!");
            System.out.println("There are "+ count + " characters!");

        } catch (FileNotFoundException e) {
            System.out.println("Cannot find your input source file!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
