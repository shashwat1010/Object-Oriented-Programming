# Base class
class Course:
    def __init__(self, courseName, duration):
        self.courseName = courseName
        self.duration = duration  # duration in weeks or months
    
    def displayCourse(self):
        print(f"Course: {self.courseName}, Duration: {self.duration}")

# Subclass 1
class OnlineCourse(Course):
    def __init__(self, courseName, duration, platform, isRecorded):
        super().__init__(courseName, duration)
        self.platform = platform
        self.isRecorded = isRecorded
    
    def displayCourse(self):
        super().displayCourse()
        print(f"Platform: {self.platform}, Recorded: {self.isRecorded}")

# Subclass 2
class PaidOnlineCourse(OnlineCourse):
    def __init__(self, courseName, duration, platform, isRecorded, fee, discount):
        super().__init__(courseName, duration, platform, isRecorded)
        self.fee = fee
        self.discount = discount  # percentage
    
    def displayCourse(self):
        super().displayCourse()
        print(f"Fee: ₹{self.fee}, Discount: {self.discount}%")

# Testing
course1 = Course("Mathematics", "3 Months")
course2 = OnlineCourse("Python Programming", "6 Weeks", "Udemy", True)
course3 = PaidOnlineCourse("Data Science Bootcamp", "4 Months", "Coursera", True, 20000, 20)

course1.displayCourse()
print("------")
course2.displayCourse()
print("------")
course3.displayCourse()
