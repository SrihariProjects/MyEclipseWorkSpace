package day6Java;

enum Status {
    Running, Failed, Pending, Success;
}

public class EnumCalssDemo {
    public static void main(String[] args) {
        // Accessing an enum constant
        Status s = Status.Running;
        System.out.println(s); // Prints: Running

        // Accessing another enum constant
        Status s1 = Status.Failed;
        System.out.println(s1); // Prints: Failed

        // Accessing the ordinal value of an enum constant
        Status s2 = Status.Pending;
        System.out.println(s2.ordinal()); // Prints: 2

        // Using the `values()` method to get all enum constants as an array
        Status[] ss = Status.values();

        // Iterating through all enum constants
        for (Status x : ss) {
            System.out.println(x + " " + x.ordinal());
        }

        // Checking if s2 is present in the enum
        boolean isPresent = false;
        for (Status x : ss) {
            if (x == s2) { // Direct comparison of enum constants
                isPresent = true;
                break;
            }
        }

        if (isPresent) {
            System.out.println(s2 + " is present");
        } else {
            System.out.println(s2 + " is not present");
        }
    }
}
