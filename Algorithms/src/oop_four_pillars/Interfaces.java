package oop_four_pillars;

public class Interfaces {

    public static void main(String[] args) {

        Animals[] a = {new Cats(), new Canines(), new Dogs(), new Felines()};
        animalSounds(a);

        Animals[] newA = {new Dogs(), new Canines(), new Hippos()};
        newSounds(newA);


    }
    static void animalSounds(Animals[] a) {
        for (Animals make : a) {
            make.sound();
        }
    }

    static void newSounds(Animals[] newA) {
        for (Animals make : newA) {
            make.sound();
        }
    }
}

interface Animals {
    void sound();
}
////////////////////////////////////

class Canines implements Animals {

    @Override
    public void sound() {
        System.out.println("canine!");
    }
}
class Dogs implements Animals {
    @Override
    public void sound() {
        System.out.println("woof!");
    }
}
////////////////////////////////////
class Felines implements Animals {
    @Override
    public void sound() {
        System.out.println("feline");
    }
}

class Cats implements Animals {
    @Override
    public void sound() {
        System.out.println("meow!");
    }
}
////////////////////////////////////
class Hippos implements Animals {
    @Override
    public void sound() {
        System.out.println("awww!");
    }
}