package case_study.models;

public class House extends Facility{
    private String roomStandard;
    private int numOfFloors;

    public House(String serviceType,
                 double usableArea,
                 double price,
                 int capacity,
                 case_study.models.TypeOfRenting typeOfRenting,
                 String roomStandard,
                 int numOfFloors){
        super(serviceType,usableArea, price, capacity, typeOfRenting);
        this.roomStandard = roomStandard;
        this.numOfFloors = numOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", numOfFloors=" + numOfFloors +
                '}';
    }
}
