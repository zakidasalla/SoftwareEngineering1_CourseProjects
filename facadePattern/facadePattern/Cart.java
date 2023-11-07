package facadePattern;

public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void selectService() {
        System.out.println("Here are " + numberOfCarts + " luggage cart(s) for all your things.");
    }
}
