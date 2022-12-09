package google.week1;

/*When a subclass extends a superclass in Java,
all protected and public fields and methods of the superclass
are inherited by the subclass. By inherited is meant that these
fields and methods are part of of the subclass, as if
the subclass had declared them itself. protected and public
fields can be called and referenced just like the methods declared
directly in the subclass.

Constructors are not inherited by subclasses, but a subclass
constructor must call a constructor in the superclass.
This will be explained in detail in a later section.*/

public class Inheritance {

    // Points to remember:

        /*A final class cannot be extended. In other words, you cannot inherit from a final class in Java.*/

        /*The Java inheritance rules are the same for abstract classes as for non-abstract classes.*/

        /*
        subclass constructor is required to call one of the
         constructors in the superclass as the very first action
         inside the constructor body.
         */
    public static void main(String[] args) {

        Car honda = new Honda();
        honda.setEngine("v-tech");
        System.out.println("Honda " + honda.getEngine());

        Car Toyota = new Toyota();
        Toyota.setEngine("vvt-i");
        System.out.println("Toyota " + Toyota.getEngine());


    }
}

class Car {
    private String engine = null;
    String getEngine() {
        return this.engine;
    }
    void setEngine(String e) {
        this.engine = e;
    }
}

class Honda extends Car {
    @Override
    public void setEngine(String e) {
        super.setEngine(e);
    }
}

class Toyota extends Car {
    @Override
    protected void setEngine(String e) {
        super.setEngine(e);
    }
}

