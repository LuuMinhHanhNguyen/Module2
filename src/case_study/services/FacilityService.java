package case_study.services;

import case_study.models.Facility;
import case_study.services.houses.HouseService;
import case_study.services.houses.IHouseService;
import case_study.services.room.IRoomService;
import case_study.services.room.RoomService;
import case_study.services.villa.IVillaService;
import case_study.services.villa.VillaService;

import java.util.List;

public class FacilityService implements IFacilityService{
    IHouseService iHouseService = new HouseService();
    IRoomService iRoomService = new RoomService();
    IVillaService iVillaService = new VillaService();

    @Override
    public void display() {
        System.out.println("                 ****** List of Facility in the system: (Houses - Rooms - Villas) ******");
        iHouseService.displayAllHouses();
        iRoomService.displayAllRooms();
        iVillaService.displayAllVillas();
    }

    @Override
    public List<Facility> displayFacilityMaintenance() {
        return null;
    }
}
