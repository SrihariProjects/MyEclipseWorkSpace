package day4Java;

/*
1. Public
Keyword: public
Scope: Widest; accessible from anywhere.
Applicable to: Classes, methods, constructors, fields.
Rules:
Can be accessed from the same class, same package, subclasses, and even outside the package.
Useful for APIs or utilities meant to be widely used.

   code:
package package1;

public class PublicExample {
    public void displayMessage() {
        System.out.println("This is a public method!");
    }
}

// File: TestPublic.java
package package2;

import package1.PublicExample;

public class TestPublic {
    public static void main(String[] args) {
        PublicExample example = new PublicExample();
        example.displayMessage(); // Accessible because it's public
    }
}

2. Protected
Keyword: protected
Scope: Medium; more restrictive than public.
Applicable to: Methods, fields, constructors. (Cannot be applied to top-level classes.)
Rules:
Accessible within the same package.
Accessible from subclasses in other packages, but only through inheritance.
Cannot be accessed directly by objects outside the package.

Code
package package1;

public class ProtectedExample {
    protected void displayMessage() {
        System.out.println("This is a protected method!");
    }
}

// File: TestProtected.java
package package2;

import package1.ProtectedExample;

class ChildClass extends ProtectedExample {
    public void show() {
        displayMessage(); // Accessible because of inheritance
    }
}

public class TestProtected {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.show();
    }
}


3. Default (Package-Private)
Keyword: No modifier (implicit default)
Scope: Package-private; limited to the same package.
Applicable to: Classes, methods, constructors, fields.
Rules:
Can be accessed by any class within the same package.
Not accessible from subclasses or outside the package.
Often used for internal implementation where external access isn’t required.
Example Code:

package package1;

class DefaultExample {
    void displayMessage() {
        System.out.println("This is a default (package-private) method!");
    }
}

package package1;

public class TestDefault {
    public static void main(String[] args) {
        DefaultExample example = new DefaultExample();
        example.displayMessage(); // Accessible because it's in the same package
    }
}



4. Private
Keyword: private
Scope: Narrowest; most restrictive.
Applicable to: Methods, fields, constructors, inner classes. (Cannot be applied to top-level classes.)
Rules:
Accessible only within the same class.
Not inherited or accessible by other classes, even in the same package.
Often used for encapsulation and ensuring class-level control.
5. Access Modifiers and Classes
Top-level classes can only use public or default modifiers.
Nested classes (inner classes) can use all modifiers (public, protected, default, private).


Example Code:
// File: PrivateExample.java
package package1;

public class PrivateExample {
    private void displayMessage() {
        System.out.println("This is a private method!");
    }

    public void showMessage() {
        displayMessage(); // Accessible within the same class
    }
}

// File: TestPrivate.java
package package1;

public class TestPrivate {
    public static void main(String[] args) {
        PrivateExample example = new PrivateExample();
        // example.displayMessage(); // Error: displayMessage() has private access
        example.showMessage(); // Indirect access through a public method
    }
}

*/
public class AccessModifiers {

	int marks = 10;

}
