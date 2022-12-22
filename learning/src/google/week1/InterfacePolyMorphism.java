package google.week1;


import java.io.Writer;

/*
* A simple application concept.
* */
class Vehicles implements InterfacePolyMorphism.Storable, InterfacePolyMorphism.Serializable {


    @Override
    public void store() {

    }

    @Override
    public void serializeToXML(String writer) {

    }

    @Override
    public void serializeToJSON(String writer) {

    }
}

class Cars extends Vehicles implements InterfacePolyMorphism.Storable, InterfacePolyMorphism.Serializable  {

    @Override
    public void store() {
        System.out.println("storing cars");
    }

    @Override
    public void serializeToXML(String writer) {
        System.out.println(writer);
    }

    @Override
    public void serializeToJSON(String writer) {
        System.out.println(writer);
    }
}

class Trucks extends Vehicles implements InterfacePolyMorphism.Storable, InterfacePolyMorphism.Serializable {
    @Override
    public void store() {
        System.out.println("storing trucks");
    }

    @Override
    public void serializeToXML(String writer) {
        System.out.println(writer);
    }

    @Override
    public void serializeToJSON(String writer) {
        System.out.println(writer);
    }
}

class Driver {

}

class CarDriver extends Driver {

}

class TruckDriver extends Driver {

}

/* Problem:
*  You want that implemented using a single method for each operation,
* available on each Car, Truck or Vehicle object.
* A store() method, a serializeToXML() method and a serializeToJSON() method.
*  */

/* Solution is to create interfaces.*/
interface InterfacePolyMorphism {

    class Test {

        public static void main(String[] args) {
            //  Access the methods of these interfaces.
            Serializable serial = new Cars();
            serial.serializeToJSON("json");
            serial.serializeToXML("xml");

            Storable store = new Cars();
            store.store();

            ((Serializable) new Cars()).serializeToJSON("car.json");
            ((Serializable) new Cars()).serializeToXML ("car.xml");
            ((Storable) new Cars()).store();


        }
    }

    interface Storable {

        public void store();
    }

    interface Serializable {
        public void serializeToXML(String writer);
        public void serializeToJSON(String writer);
    }
}


