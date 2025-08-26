# Base class
class Employee:
    def __init__(self, name, emp_id, salary):
        self.name = name
        self.emp_id = emp_id
        self.salary = salary
    
    def displayDetails(self):
        print(f"Name: {self.name}, ID: {self.emp_id}, Salary: {self.salary}")

# Subclass: Manager
class Manager(Employee):
    def __init__(self, name, emp_id, salary, teamSize):
        super().__init__(name, emp_id, salary)
        self.teamSize = teamSize
    
    def displayDetails(self):
        super().displayDetails()
        print(f"Team Size: {self.teamSize}")

# Subclass: Developer
class Developer(Employee):
    def __init__(self, name, emp_id, salary, programmingLanguage):
        super().__init__(name, emp_id, salary)
        self.programmingLanguage = programmingLanguage
    
    def displayDetails(self):
        super().displayDetails()
        print(f"Programming Language: {self.programmingLanguage}")

# Subclass: Intern
class Intern(Employee):
    def __init__(self, name, emp_id, salary, duration):
        super().__init__(name, emp_id, salary)
        self.duration = duration  # duration in months
    
    def displayDetails(self):
        super().displayDetails()
        print(f"Internship Duration: {self.duration} months")

# Testing
employees = [
    Manager("Alice", 101, 90000, 10),
    Developer("Bob", 102, 60000, "Python"),
    Intern("Charlie", 103, 20000, 6)
]

for e in employees:
    e.displayDetails()
    print("------")
