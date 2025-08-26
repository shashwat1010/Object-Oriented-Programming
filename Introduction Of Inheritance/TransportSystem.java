# Superclass
class Vehicle:
    def __init__(self, maxSpeed, fuelType):
        self.maxSpeed = maxSpeed
        self.fuelType = fuelType
    
    def displayInfo(self):
        print(f"Max Speed: {self.maxSpeed} km/h, Fuel Type: {self.fuelType}")

# Subclass: Car
class Car(Vehicle):
    def __init__(self, maxSpeed, fuelType, seatCapacity):
        super().__init__(maxSpeed, fuelType)
        self.seatCapacity = seatCapacity
    
    def displayInfo(self):
        super().displayInfo()
        print(f"Seat Capacity: {self.seatCapacity}")

# Subclass: Truck
class Truck(Vehicle):
    def __init__(self, maxSpeed, fuelType, loadCapacity):
        super().__init__(maxSpeed, fuelType)
        self.loadCapacity = loadCapacity  # in tons
    
    def displayInfo(self):
        super().displayInfo()
        print(f"Load Capacity: {self.loadCapacity} tons")

# Subclass: Motorcycle
class Motorcycle(Vehicle):
    def __init__(self, maxSpeed, fuelType, typeBike):
        super().__init__(maxSpeed, fuelType)
        self.typeBike = typeBike  # e.g., Sports, Cruiser
    
    def displayInfo(self):
        super().displayInfo()
        print(f"Type: {self.typeBike}")

# Testing Polymorphism
vehicles = [
    Car(180, "Petrol", 5),
    Truck(120, "Diesel", 20),
    Motorcycle(220, "Petrol", "Sports")
]

for v in vehicles:
    v.displayInfo()
    print("------")
