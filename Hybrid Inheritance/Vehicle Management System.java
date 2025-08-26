from abc import ABC, abstractmethod

# Superclass
class Vehicle:
    def __init__(self, model, maxSpeed):
        self.model = model
        self.maxSpeed = maxSpeed

    def displayInfo(self):
        print(f"Model: {self.model}, Max Speed: {self.maxSpeed} km/h")

# Interface: Refuelable
class Refuelable(ABC):
    @abstractmethod
    def refuel(self):
        pass

# Subclass: Electric Vehicle
class ElectricVehicle(Vehicle):
    def __init__(self, model, maxSpeed, batteryCapacity):
        super().__init__(model, maxSpeed)
        self.batteryCapacity = batteryCapacity

    def charge(self):
        print(f"{self.model} is charging... Battery capacity: {self.batteryCapacity} kWh")

# Subclass: Petrol Vehicle (inherits Vehicle + implements Refuelable)
class PetrolVehicle(Vehicle, Refuelable):
    def __init__(self, model, maxSpeed, fuelCapacity):
        super().__init__(model, maxSpeed)
        self.fuelCapacity = fuelCapacity

    def refuel(self):
        print(f"{self.model} is refueling... Fuel capacity: {self.fuelCapacity} liters")

# Testing
tesla = ElectricVehicle("Tesla Model 3", 250, 75)
honda = PetrolVehicle("Honda City", 180, 40)

tesla.displayInfo()
tesla.charge()

print("------")

honda.displayInfo()
honda.refuel()
