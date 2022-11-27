package google.week1;
// this java file is located in this package.

// import statement shows which other files this file is using.
// only to be used if not in the same package.

public class CoreConcepts { // type declaration

   boolean aBoolean = true; // true or false
   char aChar = 'y'; // Unicode characters
   byte aByte = 127; // holds = -128 to 127 ;  8 bit two’s complement
   short aShort = 120; // holds = -32,768 to 32,767 ; 16 bit two’s complement
   int anInt = 23432; // 32 bit two’s complement
   long aLong = 2342344L; // 64 bit two’s complement
   float aFloat = 3234.234f; // 32 bit IEEE floating point
   double aDouble = 43423.23423; // 64 bit IEEE floating point

    {
        // initializer block is run when an instance of this
        // class is created.
    }

    static {
        // static block executed when this class
        // is loaded, which only happens once.
    }

    public CoreConcepts() {
        // similar to class initializers
        // but can take parameters.
    }

    public static void main(String[] args) {
        // main entry point of application.
        // static method belongs to the class
        // so an instance does not need to be created
        // to call this method.

        int value    = 100;
        int remainder = value % 9;

        System.out.println(remainder);
    }

    void foo() {
        // instance method.
    }

}
