// Interface: Worker
interface Worker {
    void performDuties();
}

// Superclass: Person
class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public int getId() { return id; }
}

// Subclass: Chef
class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + getName() + " (ID: " + getId() + ") is cooking " + specialty + " dishes.");
    }
}

// Subclass: Waiter
class Waiter extends Person implements Worker {
    private String section;

    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + getName() + " (ID: " + getId() + ") is serving in section " + section + ".");
    }
}

// Test class
public class RestaurantTest {
    public static void main(String[] args) {
        Worker chef = new Chef("Gordon", 101, "Italian");
        Worker waiter = new Waiter("Alice", 102, "A1");

        chef.performDuties();
        waiter.performDuties();
    }
}

