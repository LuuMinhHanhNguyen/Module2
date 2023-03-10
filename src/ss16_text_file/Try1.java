package ss16_text_file;

import java.io.*;

public class Try1 {
    public static void main(String[] args) throws Exception{
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("try1.csv"));
            writer.write("Name");
            writer.write(",");
            writer.write("Age");
            writer.write(",");
            writer.write("DOB");
            writer.write("\n");
            writer.write("Hannah");
            writer.write(",");
            writer.write("28");
            writer.write(",");
            writer.write("14/11/1994");
            writer.write("\n");
            writer.write("Keit");
            writer.write(",");
            writer.write("19");
            writer.write(",");
            writer.write("06/12/2003");
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader("try1.csv"));
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null ){
                String[] values = line.split(",");
                System.out.println("Name: " + values[0] + ", Age: " + values[1] + ", DOB: " + values[2]);
            }
            reader.close();
         } catch (IOException e) {
        throw new RuntimeException(e);
    }
    }
}
