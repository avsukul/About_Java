package oop_four_pillars;

public class Inheritance {


    public static void main(String[] args) {

        Animal[] a = {new Cat(), new Canine(), new Dog(), new Feline()};
//        animalSounds(a);

        Animal[] c = {new Dog(), new Canine(), new Hippo()};
        newSounds(c);
    }

    static void animalSounds(Animal[] a) {
        for (Animal make : a) {
            make.sound();
        }
    }

    static void newSounds(Animal[] c) {
        for (Animal make : c) {
            make.sound();
        }
    }
}

class Animal {
    void sound() {
        System.out.println("animal!");
    }

    void foo() {
        System.out.println("private foo invoked!");
    }
}
////////////////////////////////////
class Canine extends Animal {

    @Override
    void sound() {
        System.out.println("canine!");
    }


}
class Dog extends Canine {

    @Override
    void sound() {
        System.out.println("woof!");
    }

}
////////////////////////////////////
class Feline extends Animal {

    @Override
    void sound() {
        System.out.println("feline");
    }
}

class Cat extends Feline {

    void sound() {
        System.out.println("meow!");
    }
}
////////////////////////////////////
class Hippo extends Animal {

    @Override
    void sound() {
        System.out.println("awww!");
    }
}