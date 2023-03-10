package case_study.services.villa;

import case_study.models.TypeOfRenting;
import case_study.models.Villa;
import case_study.repository.villa.IVillaRepository;
import case_study.repository.villa.VillaRepository;
import case_study.utils.UserException;
import case_study.utils.Utils;

import java.util.Map;
import java.util.Scanner;

public class VillaService implements IVillaService{
    private static Scanner scanner = new Scanner(System.in);
    private static IVillaRepository iVillaRepository = new VillaRepository();
    private static Map<Villa, Integer> villas = iVillaRepository.getAll();

    @Override
    public void displayAllVillas() {
        if(villas.isEmpty()) System.out.println("There is no villa in the system!");
        else {
            System.out.println("**List of Villas:**");
            for (Map.Entry<Villa, Integer> entry: villas.entrySet()) {
                System.out.println(entry);
            }
        }
    }

    @Override
    public void addNewVilla() {
        System.out.println("Enter your villa's service ID here: (SVVL-1234)");
        String serviceID = scanner.nextLine();
        while (!Utils.validateServiceID(serviceID, "VL")){
                System.out.println("Please re-enter your villa's service ID here: (SVVL-1234)");
                serviceID = scanner.nextLine();
        }


        System.out.println("Enter your villa's service name here: (Xxxxx)");
        String serviceName = scanner.nextLine();
        while (!Utils.validateServiceName(serviceName)){
            System.out.println("Please re-enter your villa's service name here: (Xxxxx)");
            serviceName = scanner.nextLine();
        }

        boolean flag;
        double area = 0;
        do{
            try{
                System.out.println("Enter your villa's area here: ( > 30.0 )");
                area = Double.parseDouble(scanner.nextLine());
                if(area <= 30.0) throw new UserException("Your input area should be greater than 30.0!");
                flag = true;
            } catch (NumberFormatException e){
                System.out.println("Your input area should be a decimal number!");
                flag = false;
            } catch (UserException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        } while (!flag);



        System.out.println("Enter your villa's price:");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter your villa's capacity here:");
        int capacity = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter type of renting for your villa:");
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

        System.out.println("Enter your villa's standard");
        String standard = scanner.nextLine();

        System.out.println("Enter pool area for your villa:");
        double poolArea = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter number of floors for your villa:");
        int numOfFloors = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(serviceID,serviceName, area, price,capacity, typeOfRenting, standard, poolArea, numOfFloors);
        if(villas.containsKey(villa)) System.out.println("This villa already exists in the system!");
        else {
            villas.put(villa, 0);
            iVillaRepository.add(villas);
            System.out.println("Villa added!");
        }
    }
}
