package main.week1;

public interface GenericInterfaces {
    /*
    * A generic Java interface is an interface which can be
    * typed - meaning it can be specialized to work with a
    * specific type (e.g. interface or class) when used. */

    static void main(String[] args) {
        MyProducer prod = new CarProducer();
        Car car = (Car) prod.produce();

        // Now using Generics Interface.
        MyProducers<String> prods = new CarProducers();
        String cars = prods.produce();
    }

}

interface MyProducer {

    public Object produce();

}

class CarProducer implements MyProducer {
    public Object produce() {
        return new Car();
    }
}

/*
    Using Java Generics you can type the MyProducer interface
    so you can specify what type of object it produces when you use it.
* */
interface MyProducers<T> {
    T produce();
}

/**
 * Here is an implementation to accept any possible generic type for a CarProducer.
 */
class CarProducers<T> implements MyProducers {
    @Override
    public T produce() {
        return (T) new Car();
    }
}

/**
 * Here you can lock down the generic type of the MyProducer interface already when you implement it.
 */
class CarProducing implements MyProducers<Car> {

    @Override
    public Car produce() {
        return new Car();
    }
}