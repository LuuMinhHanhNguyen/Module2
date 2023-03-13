package case_study.models;

public class Villa extends Facility{
    private String roomStandard;
    private double poolArea;
    private int numOfFloors;

    public Villa(String serviceType,
                 double usableArea,
                 double price,
                 int capacity,
                 case_study.models.TypeOfRenting typeOfRenting,
                 String roomStandard,
                 double poolArea,
                 int numOfFloors){

        super(serviceType, usableArea, price, capacity, typeOfRenting);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numOfFloors = numOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numOfFloors=" + numOfFloors +
                '}';
    }
}
