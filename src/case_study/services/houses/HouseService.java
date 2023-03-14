package case_study.services.houses;

import case_study.models.House;
import case_study.models.TypeOfRenting;
import case_study.repository.house.HouseRepository;
import case_study.repository.house.IHouseRepository;
import case_study.utils.Utils;

import java.util.Map;
import java.util.Scanner;

public class HouseService implements IHouseService{
    private static Scanner scanner = new Scanner(System.in);
    private static IHouseRepository iHouseRepository = new HouseRepository();
    private static Map<House, Integer> houses = iHouseRepository.getAll();
    @Override
    public void displayAllHouses() {
        if(houses.isEmpty()) System.out.println("There is no house in the system!");
        else {
            System.out.println("**List of Houses:**");
            for (Map.Entry<House, Integer> entry: houses.entrySet()) {
                System.out.println(entry);
            }
        }
    }

    @Override
    public void addNewHouse() {
        System.out.println("Enter your house's service ID here: (SVHO-1234)");
        String serviceID = scanner.nextLine();
        while (!Utils.validateServiceID(serviceID, "HO")){
            System.out.println("Please re-enter your house's service ID here: (SVHO-1234)");
            serviceID = scanner.nextLine();
        }


        System.out.println("Enter your house's service name here: (Xxxxx)");
        String serviceName = scanner.nextLine();
        while (!Utils.validateServiceName(serviceName)){
            System.out.println("Please re-enter your house's service name here: (Xxxxx)");
            serviceName = scanner.nextLine();
        }


        System.out.println("Enter your house's area here:");
        double area = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter your house's price:");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter your house's capacity here:");
        int capacity = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter type of renting for your house:");
        System.out.println("Choose a number: \n" +
                "1 - YEAR,\n" +
                "2 - MONTH,\n" +
                "3 - DAY,\n" +
                "4 or Other - HOUR");
        TypeOfRenting typeOfRenting;
        String temp = scanner.nextLine();
        if (temp.equals("1")) typeOfRenting = TypeOfRenting.YEAR;
        else if (temp.equals("2")) typeOfRenting = TypeOfRenting.MONTH;
        else if (temp.equals("3")) typeOfRenting = TypeOfRenting.DAY;
        else typeOfRenting = TypeOfRenting.HOUR;

        System.out.println("Enter your house's standard");
        String standard = scanner.nextLine();

        System.out.println("Enter number of floors for your house:");
        int numOfFloors = Integer.parseInt(scanner.nextLine());

        House house = new House(serviceID,serviceName, area, price,capacity, typeOfRenting, standard, numOfFloors);
        if(houses.containsKey(house)) System.out.println("This House already exists in the system!");
        else {
            houses.put(house, 0);
            iHouseRepository.add(houses);
            System.out.println("House added!");
        }
    }
}
