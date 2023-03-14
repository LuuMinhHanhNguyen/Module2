package case_study.services.room;

import case_study.models.Room;
import case_study.models.TypeOfRenting;
import case_study.repository.room.IRoomRepository;
import case_study.repository.room.RoomRepository;
import case_study.utils.Utils;

import java.util.Map;
import java.util.Scanner;

public class RoomService implements IRoomService{
    private static Scanner scanner = new Scanner(System.in);
    private static IRoomRepository iRoomRepository = new RoomRepository();
    private static Map<Room, Integer> rooms = iRoomRepository.getAll();
    @Override
    public void displayAllRooms() {
        if(rooms.isEmpty()) System.out.println("There is no room in the system!");
        else {
            System.out.println("**List of Rooms:**");
            for (Map.Entry<Room, Integer> entry: rooms.entrySet()) {
                System.out.println(entry);
            }
        }
    }

    @Override
    public void addNewRoom() {
        System.out.println("Enter your room's service ID here: (SVRO-1234)");
        String serviceID = scanner.nextLine();
        while (!Utils.validateServiceID(serviceID, "RO")){
                System.out.println("Please re-enter your room's service ID here: (SVRO-1234)");
                serviceID = scanner.nextLine();
        }


        System.out.println("Enter your room's service name here: (Xxxxx)");
        String serviceName = scanner.nextLine();
        while (!Utils.validateServiceName(serviceName)){
            System.out.println("Please re-enter your room's service name here: (Xxxxx)");
            serviceName = scanner.nextLine();
        }


        System.out.println("Enter your room's area here:");
        double area = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter your room's price:");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter your room's capacity here:");
        int capacity = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter type of renting for your room:");
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

        System.out.println("Enter your room's complimentary service");
        String complimentary = scanner.nextLine();

        Room room = new Room(serviceID,serviceName, area, price,capacity, typeOfRenting, complimentary);
        if(rooms.containsKey(room)) System.out.println("This room already exists in the system!");
        else {
            rooms.put(room, 0);
            iRoomRepository.add(rooms);
            System.out.println("Room added!");
        }
    }
}
