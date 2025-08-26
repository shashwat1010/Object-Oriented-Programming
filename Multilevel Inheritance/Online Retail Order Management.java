# Base class
class Order:
    def __init__(self, orderId, orderDate):
        self.orderId = orderId
        self.orderDate = orderDate
    
    def getOrderStatus(self):
        return f"Order {self.orderId} placed on {self.orderDate}."

# Subclass 1
class ShippedOrder(Order):
    def __init__(self, orderId, orderDate, trackingNumber):
        super().__init__(orderId, orderDate)
        self.trackingNumber = trackingNumber
    
    def getOrderStatus(self):
        return f"Order {self.orderId} has been shipped. Tracking Number: {self.trackingNumber}."

# Subclass 2 (extends ShippedOrder)
class DeliveredOrder(ShippedOrder):
    def __init__(self, orderId, orderDate, trackingNumber, deliveryDate):
        super().__init__(orderId, orderDate, trackingNumber)
        self.deliveryDate = deliveryDate
    
    def getOrderStatus(self):
        return f"Order {self.orderId} delivered on {self.deliveryDate}."

# Testing
order1 = Order(1001, "2025-08-20")
order2 = ShippedOrder(1002, "2025-08-21", "TRK12345")
order3 = DeliveredOrder(1003, "2025-08-22", "TRK67890", "2025-08-25")

print(order1.getOrderStatus())
print(order2.getOrderStatus())
print(order3.getOrderStatus())
