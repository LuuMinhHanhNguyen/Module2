package ss16_text_file.read_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("src/ss16_text_file/read_file/countries.csv"));
            String[] country;
            while ((line = br.readLine()) != null) {
                country = line.split(",");
                System.out.println(
                        "Country [id= "
                                + country[0]
                                + ", code= " + country[1]
                                + " , name=" + country[2]
                                + "]");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
