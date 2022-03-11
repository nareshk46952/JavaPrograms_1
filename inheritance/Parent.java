package inheritance;

//--------------------------- Multi-Level Inheritance -----------------------------.
public class Parent {
    int count = 1;
    String className = "Parent class";
    int hashCode = className.hashCode();

    void patenrMethod() {
        System.out.println("Parent-Method " + className + " " + hashCode);
        System.out.println("The method is invoked " + isInvoked() + " " + (count == 1 ? " time " : " times "));
    }

    int isInvoked() {
        return count++;
    }
}

class Child extends Parent {
    int childNum = 515;
    String className = "Child class";
    int hashCode = className.hashCode();

    void childMethod() {
        System.out.println("Parent-Method " + className + " " + hashCode);
        System.out.println("The method is invoked " + isInvoked() + " " + (count == 1 ? " time " : " times "));
    }

    int isInvoked() {
        return count++;
    }
}

class GrandChild extends Child {
    int childNum = 1;
    String className = "GrandChild class";
    int hashCode = className.hashCode();

    void grandChildMethod() {
        System.out.println("Parent-Method " + className + " " + hashCode);
        System.out.println("The method is invoked " + isInvoked() + " " + (count == 1 ? " time " : " times "));
    }

    int isInvoked() {
        return count++;
    }
}

class MainOfParent {
    public static void main(String[] args) {
        try {
            // Creating a object of Parenclst
            // Compile time polymorphism.
            System.out.println("          Parent           ");
            Parent p = new Parent();
            p.patenrMethod();
            System.out.println("          Child           ");
            Child c = new Child();
            c.patenrMethod();
            c.childMethod();
            System.out.println(c.childNum);
            System.out.println("          GrandChild           ");
            GrandChild gc = new GrandChild();
            gc.patenrMethod();
            gc.childMethod();
            gc.grandChildMethod();
            System.out.println(c.childNum);
            // Runtime Polymorphism
            p = new GrandChild();
            p.patenrMethod();
            c = new GrandChild();
            c.patenrMethod();
            c.childMethod();
        } catch (Exception e) {
            System.out.println("Exception --> " + e);
        }
    }
}