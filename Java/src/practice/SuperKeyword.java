package practice;

class Animal {
    public static void Animal() {
        System.out.println("Animal constructor called");
    }
}

// Child class
class Dog extends Animal {
    Dog() {
        super();  // Calls Animal() constructor
        System.out.println("Dog constructor called");
    }
}

// Main class
public class SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();  // Output?
    }
}
