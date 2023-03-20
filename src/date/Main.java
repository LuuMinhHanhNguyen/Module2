package date;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Set<Human> humans = new LinkedHashSet<>();

        Scanner scanner = new Scanner(System.in);
        // 1
        System.out.println("name1");
        String name1 = scanner.nextLine();

        System.out.println("age1");
        String dob1 = scanner.nextLine();
        while (Utils.parseStringToLocalDate(dob1) == null) {
            dob1 = scanner.nextLine();
        }
        Human human1 = new Human(name1, Utils.parseStringToLocalDate(dob1));
        humans.add(human1);

//        LocalDate today = LocalDate.now();
//        System.out.println(today);
//        System.out.println("DOB " + human1.getDOB().getYear());
//        System.out.println(Period.between(human1.getDOB(), today));
//        WriteFileHuman.write(humans);
//        System.out.println(ReadFileHuman.read());
        // 2
        System.out.println("name2");
        String name2 = scanner.nextLine();

        System.out.println("age2");
        String dob2 = scanner.nextLine();
        Human human2 = new Human(name2, Utils.parseStringToLocalDate(dob2));
        humans.add(human2);

        // 3
        System.out.println("name3");
        String name3 = scanner.nextLine();

        System.out.println("age3");
        String dob3 = scanner.nextLine();
        Human human3 = new Human(name3, Utils.parseStringToLocalDate(dob3));
        humans.add(human3);
        WriteFileHuman.write(humans);

        Set<Human> humanSet = new TreeSet<>(humans);

        System.out.println("Read" + ReadFileHuman.read());
        System.out.println("TreeSet:" + humanSet);


//        List<Human> cloneHumans = new ArrayList<>(humans);
//        Collections.sort(cloneHumans, new Comparator<Human>() {
//            @Override
//            public int compare(Human o1, Human o2) {
//                return o1.getDOB().compareTo(o2.getDOB());
//            }
//        });
//        System.out.println("after sorted" + cloneHumans);

//         who was born first will be placed first in the list
//        List<List<LocalDate>> listOfDates = new ArrayList<>();
//        System.out.println("Start 1");
//        String date1 = scanner.nextLine();
//        LocalDate date1LocalDate = Utils.parseStringToLocalDate(date1);
//        System.out.println("End 2");
//        String date2 = scanner.nextLine();
//
//        LocalDate date2LocalDate = Utils.parseStringToLocalDate(date2);
//        List<LocalDate> dates = getDatesBetweenUsingJava9(date1LocalDate, date2LocalDate);
//        listOfDates.add(dates);
//        System.out.println("Start 3");
//        String date3 = scanner.nextLine();
//        LocalDate date3LocalDate = Utils.parseStringToLocalDate(date3);
//        System.out.println("End 4");
//        String date4 = scanner.nextLine();
//        LocalDate date4LocalDate = Utils.parseStringToLocalDate(date4);
//        List<LocalDate> dates2 = getDatesBetweenUsingJava9(date3LocalDate, date4LocalDate);
//        if((date1LocalDate.isBefore(date4LocalDate) || date1LocalDate.equals(date4LocalDate))
//                && (date2LocalDate.isAfter(date3LocalDate) || date2LocalDate.equals(date3LocalDate))){
//
//            System.out.println("already booked");
//        } else listOfDates.add(dates2);
//
//        System.out.println(listOfDates);
//    }

//    public static List<LocalDate> getDatesBetweenUsingJava9(LocalDate startDate, LocalDate endDate) {
//        List<LocalDate> dates = startDate.datesUntil(endDate).collect(Collectors.toList());
//        dates.add(endDate);
//
//        return dates;
//    }
    }
}
