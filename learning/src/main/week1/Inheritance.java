package main.week1;

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
        honda.setMake("Honda");
        honda.setEngine("v-tech");
        honda.setModel("Civic LX");
        System.out.println(honda);

        Car toyota = new Toyota();
        toyota.setMake("Toyota");
        toyota.setEngine("vvt-i");
        toyota.setModel("corolla RS");
        System.out.println(toyota);
    }
}

class Car {
    private String make = null;
    private String engine = null;
    private String model = null;
    String color = "no color";

    @Override
    public String toString() {
        return this.make + " " + this.engine + " " + this.model + " " + this.color;
    }

    void setMake(String make) {
        this.make = make;
    }
    void setEngine(String e) {
        this.engine = e;
    }

    void setModel(String model) {
        this.model = model;
    }
}

class Honda extends Car {

    String color = "black";
    @Override
    public void setEngine(String e) {
        System.out.println("set engine for honda " + e);
        super.setEngine(e + " Power!");
    }
}

class Toyota extends Car {
    String color = "red";
    @Override
    protected void setEngine(String e) {
        System.out.println("set engine for toyota " + e);
        super.setEngine(e + " Performance tuned!");
    }
}

class UpDownCasting {

    public static void main(String[] args) {
        // up casting.
        Car hon = new Honda();
        Car toy = new Toyota();
        // calls the super-class.
        System.out.println(hon.color);
        System.out.println(toy.color);

        // down casting.
        Honda h = (Honda) hon;
        Toyota t = (Toyota) toy;
        // calls the subclass.
        System.out.println(h.color);
        System.out.println(t.color);

    }
}

class FieldsInheritance {

    public static void main(String[] args) {
        Car car = new FieldsInheritance().new Car();

        car.setLicensePlate("123");
        car.updateLicensePlate("abc");

        System.out.println("license plate: "
                + car.getLicensePlate());
    }

    public class Vehicle {

        String licensePlate = null; // 123

        public void setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
        }

        public String getLicensePlate() {
            return licensePlate;
        }
    }

    public class Car extends Vehicle {

        protected String licensePlate = null;   // abc

        @Override
        public void setLicensePlate(String license) {
            super.setLicensePlate(license);
        }

        @Override
        public String getLicensePlate() {
            return super.getLicensePlate();
        }

        public void updateLicensePlate(String license){
            this.licensePlate = license;
        }
    }

}