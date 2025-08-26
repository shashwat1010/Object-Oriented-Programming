# Superclass
class Device:
    def __init__(self, deviceId, status):
        self.deviceId = deviceId
        self.status = status  # e.g., "ON" or "OFF"
    
    def displayStatus(self):
        print(f"Device ID: {self.deviceId}, Status: {self.status}")

# Subclass
class Thermostat(Device):
    def __init__(self, deviceId, status, temperatureSetting):
        super().__init__(deviceId, status)
        self.temperatureSetting = temperatureSetting
    
    def displayStatus(self):
        super().displayStatus()
        print(f"Temperature Setting: {self.temperatureSetting}°C")

# Testing
thermo1 = Thermostat("T1001", "ON", 24)
thermo1.displayStatus()
