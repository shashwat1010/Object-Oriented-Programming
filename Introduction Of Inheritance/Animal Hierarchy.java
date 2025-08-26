# Superclass
class Animal:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    
    def makeSound(self):
        print("Some generic animal sound")

# Subclasses with unique sounds
class Dog(Animal):
    def makeSound(self):
        print(f"{self.name} says: Woof! Woof!")

class Cat(Animal):
    def makeSound(self):
        print(f"{self.name} says: Meow!")

class Bird(Animal):
    def makeSound(self):
        print(f"{self.name} says: Tweet! Tweet!")

# Testing
animals = [Dog("Buddy", 3), Cat("Whiskers", 2), Bird("Tweety", 1)]
for a in animals:
    a.makeSound()  # Polymorphism in action
