import java.util.Scanner;

class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    // Method to book a ticket
    void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    void displayTicketDetails() {
        System.out.println("\n===== Ticket Details =====");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }
}

public class MovieBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();

        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        String seatNumber = sc.nextLine();

        System.out.print("Enter Ticket Price: ₹");
        double price = sc.nextDouble();

        ticket.bookTicket(movieName, seatNumber, price);
        ticket.displayTicketDetails();
    }
}
