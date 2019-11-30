package day42.example.inheritance;

public class House {
    private int rooms;
    private double price;

    public House(int rooms, double price) {
        this.rooms = rooms;
        this.price = price;
    }

    public boolean isNew() {
        return true;
    }

    @Override
    public String toString() {
        return "House";
    }
}
