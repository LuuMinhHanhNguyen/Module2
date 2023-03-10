package ss16_text_file;

import java.io.*;

public class Try {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("hannah.txt"));
            writer.write("I'm Hannah Luu!");
            writer.write("\nI'm a programmer!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("hannah.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
