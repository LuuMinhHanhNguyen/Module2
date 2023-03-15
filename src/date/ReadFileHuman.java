package date;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileHuman {
    private static String PATH = "src/date/human.csv";
    public static List<Human> read(){
        List<Human> humans = new ArrayList<>();
        Human human;
        String line;
        String[] temp;
        BufferedReader bufferedReader = null;
        File file = new File(PATH);
        if (file.length() == 0) {
            System.out.println("There is no human!");
            return humans;
        } else {
            try{
                bufferedReader =  new BufferedReader(new FileReader(PATH));
                while ((line = bufferedReader.readLine()) != null){
                    temp = line.split(",");
                    human = new Human(temp[0], Utils.parseStringToLocalDate(temp[1]));
                    humans.add(human);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return humans;
        }
    }
}
