# Superclass
class Book:
    def __init__(self, title, publicationYear):
        self.title = title
        self.publicationYear = publicationYear
    
    def displayInfo(self):
        print(f"Book Title: {self.title}")
        print(f"Publication Year: {self.publicationYear}")

# Subclass
class Author(Book):
    def __init__(self, title, publicationYear, name, bio):
        super().__init__(title, publicationYear)  # Call Book constructor
        self.name = name
        self.bio = bio
    
    def displayInfo(self):
        super().displayInfo()  # Display book info first
        print(f"Author: {self.name}")
        print(f"Bio: {self.bio}")

# Testing
book1 = Author("The Great Gatsby", 1925, "F. Scott Fitzgerald", "American novelist and short story writer.")
book1.displayInfo()
