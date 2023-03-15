package date;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("name1");
        String name1 = scanner.nextLine();

        System.out.println("age1");
        String dob1 = scanner.nextLine();
        while (Utils.parseStringToLocalDate(dob1) == null){
            dob1 = scanner.nextLine();
        }
        Human human1 = new Human(name1, Utils.parseStringToLocalDate(dob1));
        humans.add(human1);
        LocalDate today =  LocalDate.now();
        System.out.println(today);
        System.out.println("DOB "+human1.getDOB().getYear());
        System.out.println(Period.between( human1.getDOB(), today));
        WriteFileHuman.write(humans);
        System.out.println(ReadFileHuman.read());

//        System.out.println("name2");
//        String name2 = scanner.nextLine();
//
//        System.out.println("age2");
//        String dob2 = scanner.nextLine();
//        Human human2 = new Human(name2, Utils.parseStringToDate(dob2));
//        humans.add(human1);
//        humans.add(human2);
//        WriteFileHuman.write(humans);
//        System.out.println("Read"+ ReadFileHuman.read());
//        List<Human> cloneHumans = new ArrayList<>(humans);
//        Collections.sort(cloneHumans, new Comparator<Human>() {
//            @Override
//            public int compare(Human o1, Human o2) {
//                return o1.getDOB().compareTo(o2.getDOB());
//            }
//        });
//        System.out.println("after sorted" + cloneHumans);
        // who was born first will be placed first in the list

       // System.out.println(date.compareTo(human2.getDOB()));
    }
}
