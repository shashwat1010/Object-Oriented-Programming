public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate = 50.0;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void display() {
        System.out.println(customerName + " rented " + carModel + " for " + rentalDays +
                " days. Total cost: $" + calculateTotalCost());
    }
}
