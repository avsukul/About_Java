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


class MathOperators {

    public static void main(String[] args) {
        // math precedence.
        //  * / take precedence over + -
        // * / is performed from left to right
        // + -  is performed from left to right
        // () parentheses have higher precedence than any math operator

        // Rounding
        double result = 100 / 8; // 12.0
        double a = 100;
        double b = 8;
        double x = a / b; // 12.5

        // suffix
        double r = 100D / 8D; // 12.5

        int abs1 = Math.abs(10);  // abs1 = 10

        int abs2 = Math.abs(-20); // abs2 = 20

        double ceil = Math.ceil(7.343);  // ceil = 8.0

        double floor = Math.floor(7.343);  // floor = 7.0

        double result3 = Math.floorDiv(-100,9);
        System.out.println("result3: " + result3);

        double result4 = -100 / 9;
        System.out.println("result4: " + result4);

        int min = Math.min(10, 20); // 10

        int max = Math.max(10, 20); // 20

        double roundedDown = Math.round(23.445); // 23.0
        double roundedUp   = Math.round(23.545); // 24.0

        System.out.println(Math.random() * 100D); // float point value.

        System.out.println(Math.floor(Math.random() * 100D));
    }

}

class Arrays {

    // valid array declarations
    int[] intArrays = new int[5];
    int iArrays[] = new int[10];

    public static void main(String[] args) {

        // Arrays length CANNOT be changed and is static

        // array literals
        // Method 1.
        int[] arr = {1,2,3};

        // Method 2.
        // anonymous arrays, arrays not assigned to a variable
        double volume = computeVolume(new int[]{1,2,3});

        // array length can be accessed via the length field
        int length = arr.length; // 3

        // iterate through an array with for loop & for-each loop
        iterate(arr);
    }

    static void iterate(int[] arr) {
        // for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // for-each loop
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static double computeVolume(int[] ints) {
        return ints[0] * ints[1] * ints[2];
    }

}

class MultiDimensionalArrays {

    public static void main(String[] args) {
        // create multidimensional array
        int[][] multi = {{1,3,5},{2,4,6}, {7,8,9,0,15}};

        // iterate multidimensional array
        printMulti(multi);
    }

    static void printMulti(int[][] multi) {
        for (int row = 0; row < multi.length; row++) {
            for (int column = 0; column < multi[row].length; column++) {
                System.out.print(multi[row][column] + " ");
            }
            System.out.println();
        }
    }
}