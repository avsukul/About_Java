package google.week1;
// this java file is located in this package.

// import statement shows which other files this file is using.
// only to be used if not in the same package.


import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

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

class Arrayz {

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
//        iterate(arr);

        // insert elements into an array
//        arr[0] = 5;
        // remove the element above
//        arr[0] = 0;

        // min value in array
        findMinValue(arr);
        // System.out.print(findMinValue(arr));

        // max value in array
        findMaxValue(arr);
        // System.out.print(findMaxValue(arr));

        // copying an array into another array
        // iteration
        int[] ints = new int[arr.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = arr[i];
        }
        // Arrays.copyOf
        int[] newArr = Arrays.copyOf(arr, 10);
//        iterate(newArr);
        // Arrays.copyOfRange
        int[] newerArr = Arrays.copyOfRange(arr, 0, arr.length);
//        iterate(newerArr);

        // sort an Array
        int[] a  = {5,3,2,1,5,45,634,2311,21};
        Arrays.sort(a);
//        iterate(a);

        // sort objects
        Employee[] emp = new Employee[3];
        emp[1] = new Employee("bob".toUpperCase(), 2332);
        emp[0] = new Employee("Tom".toUpperCase(), 234);
        emp[2]= new Employee("John".toUpperCase(), 234324);
        Arrays.sort(emp, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        });
        for(int i=0; i < emp.length; i++) {
//            System.out.println(emp[i].name);
        }

        // Arrays.fill()
        int[] intArray = new int[10];

        Arrays.fill(intArray, 123);

        int[] aa = new int[10];

        Arrays.fill(aa, 3, 5, 123) ;
//        System.out.println(Arrays.toString(aa));

        // Arrays.binarySearch but you MUST Sort the array
        int[] search = {3,43,4,3,2,23,21,4,5};
        Arrays.sort(search);
//        System.out.println(Arrays.toString(search));
        int index = Arrays.binarySearch(search, 3);
//        System.out.println(index);

        // search part of the array
        int[] ar = {0,2,4,6,8,10};
        int in = Arrays.binarySearch(ar, 0, 4, 2);
//        System.out.println(in);

        // check if arrays are equal
        int[] ints1 = {0,2,4,6,8,10};
        int[] ints2 = {0,2,4,6,8,10};
        int[] ints3 = {10,8,6,4,2,0};

        boolean ints1EqualsInts2 = Arrays.equals(ints1, ints2);
        boolean ints1EqualsInts3 = Arrays.equals(ints1, ints3);

        System.out.println(ints1EqualsInts2);
        System.out.println(ints1EqualsInts3);





    }

    private static class Employee {
        public String name;
        public int employeeId;

        public Employee(String name, int employeeId){
            this.name       = name;
            this.employeeId = employeeId;
        }
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

    static int findMinValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int findMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
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

class Ternary {

    public static void main(String[] args) {
        int ii = 0;
        int iii = 1;
        int i = ii > iii ? 1 : 0;

        // chaining ternary
        int t = ii > iii ? 15 : ii > iii ? 10 : ii < iii ? 1 : 0;
        System.out.print(t);


    }
}

class InstanceOf {

    /*
    The Java instanceof operator will
    evaluate to true if you compare an
    object to the exact class of that object.*/
    public static void main(String[] args) {

        // instanceof
        Map<Object, Object> map = new HashMap();
        boolean mapIsObject = map instanceof Object; // true

        // instance with same class
        HashMap<Object, Object> map1 = new HashMap();
        boolean mapIsObject1 = map1 instanceof HashMap; // true

        // superclass
        Map<Object, Object> map2 = new HashMap();
        boolean mapIsObject2 = map2 instanceof Object; // true

        //  interface
        HashMap<Object, Object> map3 = new HashMap();
        boolean mapIsObject3 = map3 instanceof Map; // true

        // compare against null
        Map<Object, Object> map4 = null;
        // false Since null is not an instance of Map
        boolean mapIsObject4 = map4 instanceof Map;

        // downcasting with instanceof
        String myObject = "";  // get object from somewhere

        if(myObject instanceof String) {
            String myString = (String) myObject;

        }
    }
}

class Loops {

    public static void main(String args) {

        // Variable visibility:
        // Variables declared inside a Java while loop are only
        // visible inside the while loop body

        // for loop
        for (int i = 0; i > 10; i++) {
        }

        // for each loop
        int[] arr = new int[10];
        for (int i : arr) {
        }

        // while loop
        while (arr.length < 10) {

        }

        // do while loop
        do {

        } while (arr.length < 10);
    }
}


class NestedClass {

    // Terminology: Nested classes are divided into two categories:
    // non-static and static.
    // Non-static nested classes are called inner classes.
    // Nested classes that are declared static are called static nested classes.

    public static void main(String[] args) {
        // accessing nested classes
        NestedClass nested = new NestedClass();
        MyInnerClass inner = nested.new MyInnerClass();
        inner.foo();

        // accessing static nested classes
        MyStaticNestedClass staticNested = new MyStaticNestedClass();
        staticNested.foo();

    }

    /**
     * nested inner-class
     */
    class MyInnerClass {

        void foo() {System.out.println("inner");}
    }

    /**
     * static nested class
     */
    static class MyStaticNestedClass {

        void foo() {System.out.println("static nested");}
    }

}








