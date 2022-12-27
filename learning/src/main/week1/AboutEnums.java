package main.week1;

import java.util.EnumMap;
import java.util.EnumSet;

public enum AboutEnums implements MyInter { // can implement an interface but CANNOT extend.

    /*A Java Enum is a special Java type used to define collections of constants.
    *
    * Java enums extend the java.lang.Enum class implicitly, so your enum
    * types cannot extend another class.

    * If a Java enum contains fields and methods, the definition of fields and
    * methods must always come after the list of constants in the enum.
    * The list of enum constants must be terminated by a semicolon;*/

    HIGH(1){
        @Override
        public String asLowerCase() {
            return null;
        }

        @Override
        public void bar() {

        }
    }, MEDIUM(2) {
        @Override
        public String asLowerCase() {
            return null;
        }

        @Override
        public void bar() {

        }
    }, LOW(3) {
        @Override
        public String asLowerCase() {
            return null;
        }

        @Override
        public void bar() {

        }
    }; // Constants defined.

    private int var;

    AboutEnums(int var) {
        this.var = var;
    }

    int getVar() {
        return this.var;
    }

    // Abstract class in Enum.
    // Enum instance (each constant) defines its own implementation of this abstract method.
    public abstract String asLowerCase();

    static class Test {
        public static void main(String[] args) {
            System.out.println(new Test().foo());

            // EnumSet
            EnumSet<AboutEnums> enumSet = EnumSet.of(AboutEnums.HIGH, AboutEnums.MEDIUM);

            // EnumMap
            EnumMap<AboutEnums, String> map = new EnumMap<>(AboutEnums.class);
        }

        int foo() {
           return AboutEnums.HIGH.getVar(); // Calling method in Enum.
        }
    }
}

interface MyInter {
    void bar();
}