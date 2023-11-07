package facadePattern;

public class HouseKeeping implements HotelService{
    private String roomNumber;

    public HouseKeeping(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String cleanRoom(String roomNumber) {
        return "Your Room, Room " + roomNumber + ", has been cleaned by the Hotel's Housekeeper.";
    }

    @Override
    public void selectService() {
        System.out.println(cleanRoom(roomNumber));
    }
}
