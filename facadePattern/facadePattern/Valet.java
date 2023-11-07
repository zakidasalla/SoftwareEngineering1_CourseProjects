package facadePattern;

public class Valet implements HotelService{
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }
    public String pickUpVehicle(String plateNumber) {
        return "Your car with the plate number \"" + this.plateNumber + "\" has been picked up by the Hotel's Valet to be parked.";
    }
    @Override
    public void selectService() {
        System.out.println(pickUpVehicle(plateNumber));
    }
}
