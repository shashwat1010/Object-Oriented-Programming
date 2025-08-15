public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default Constructor
    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking other) {
        this(other.guestName, other.roomType, other.nights);
    }

    public void display() {
        System.out.println(guestName + " booked " + roomType + " for " + nights + " nights.");
    }
}
