// Base Class
class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }

    void displayDetails() {
        System.out.println("Order ID: " + orderId + ", Order Date: " + orderDate);
    }
}

// First Level Subclass
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped, Tracking Number: " + trackingNumber;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Second Level Subclass
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main Class
public class RetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-08-01");
        ShippedOrder shipped = new ShippedOrder(102, "2025-08-05", "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder(103, "2025-08-10", "TRK67890", "2025-08-15");

        order.displayDetails();
        System.out.println("Status: " + order.getOrderStatus());
        System.out.println("-------------------------");

        shipped.displayDetails();
        System.out.println("Status: " + shipped.getOrderStatus());
        System.out.println("-------------------------");

        delivered.displayDetails();
        System.out.println("Status: " + delivered.getOrderStatus());
    }
}

