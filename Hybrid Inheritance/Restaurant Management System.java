from abc import ABC, abstractmethod

# Superclass
class Person:
    def __init__(self, name, emp_id):
        self.name = name
        self.emp_id = emp_id

# Interface (Worker)
class Worker(ABC):
    @abstractmethod
    def performDuties(self):
        pass

# Subclass: Chef
class Chef(Person, Worker):
    def __init__(self, name, emp_id, specialty):
        super().__init__(name, emp_id)
        self.specialty = specialty

    def performDuties(self):
        print(f"Chef {self.name} (ID: {self.emp_id}) is cooking {self.specialty} dishes.")

# Subclass: Waiter
class Waiter(Person, Worker):
    def __init__(self, name, emp_id, section):
        super().__init__(name, emp_id)
        self.section = section

    def performDuties(self):
        print(f"Waiter {self.name} (ID: {self.emp_id}) is serving tables in section {self.section}.")

# Testing
staff = [
    Chef("Gordon", 101, "Italian"),
    Waiter("Alice", 102, "A1")
]

for member in staff:
    member.performDuties()
