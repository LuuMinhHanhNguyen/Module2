package case_study.models;

public class Room extends Facility{
    private String complimentaryService;

    public Room(String serviceType,
         double usableArea,
         double price,
         int capacity,
         case_study.models.TypeOfRenting typeOfRenting,
         String complimentaryService){
        super(serviceType, usableArea, price,capacity, typeOfRenting);
        this.complimentaryService = complimentaryService;
    }

    public String getComplimentaryService() {
        return complimentaryService;
    }

    public void setComplimentaryService(String complimentaryService) {
        this.complimentaryService = complimentaryService;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                "complimentaryService='" + complimentaryService + '\'' +
                '}';
    }
}
