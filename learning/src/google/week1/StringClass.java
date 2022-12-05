package google.week1;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringClass {

    /*From Java 9 and forward, The Java VM can optimize strings
     using a new Java feature called compact strings.
     The compact strings feature lets the Java VM detect if
     a string only contains ISO-8859-1/Latin-1 characters.

     If it does, the String will only use 1 byte per character internally.

     The characters of a compact Java String can thus be represented by a
     byte array instead of a char array.

    Whether a String can be represented as a compact string or not is
     detected when the string is created.
     A String is immutable once created - so this is safe to do.*/
    public static void main(String[] args) {

        // Create a String instance
        String str = new String("My string");

        // String literal
        String sl = "a string literal";

        // concatenation
        String s1 = str + " " + sl;
        // above is same as
        String s2 = new StringBuilder(str).append(sl).toString();

        // concatenation of strings efficiently in a loop
        String[] strA = {"one", "two", "three", "four", "five"};
        StringBuilder sb = new StringBuilder();
        for (String s : strA) {
            sb.append(" ").append(s);
        }
        String myStr = sb.toString();

        // length of string
        String sLength = "foo bar";

        // get part of string
        String sPart = sLength.substring(4); // outputs -> bar

        // indexOf
        String theString = "is this good or is this bad?";
        String substring = "is";

        int index = theString.indexOf(substring);
        while(index != -1) {
//            System.out.println(index);
            index = theString.indexOf(substring, index + 1);
        }

        // how to compare strings
        String a = "foo";
        String b = "bar";
        String c = "FOO";
        String z = "foo";
        // equals
        boolean r0 = a.equals(b);
        boolean r1 = a.equals(c);
        boolean r2 = a.equals(z);   // equals methods compares state of object
        boolean r3 = a == z;     // equality operator compares memory address


        // startsWidth checks if starts with a substring
        String swStr = "This is a good day to ";
        swStr.startsWith("This"); // true
        swStr.startsWith("this"); // false
        swStr.startsWith("this", 5); // starts at index 5 returns false

        // endsWidth checks if ends with a substring
        String endStr = "This is a good day to code!";
        endStr.endsWith("This"); // false
        endStr.endsWith("code!"); // true

        // compareTo method.
        // If string is smaller=negative number, equal=0 and after=positive number.
        String one   = "abc";
        String two   = "def";
        String three = "abc";
        String four = "ABC";

        // trim method will remove white spaces beginning and end
        String st = " foo ".trim();  // outputs length of 3

        // repalce method
        String source   = "123abc";
        String replaced = source.replace('a', '@'); // outputs 123@bc


        // convert numbers to string
        int i = 97324;
        String intToStr = String.valueOf(i); // converts to string

        // convert objects to strings
        Character aChar = new Character('c');
        String charStr = aChar.toString();

        // charAt method
        String theStr = "This is a good day to code";
        char cc = theStr.charAt(10); // char at 'g'

        // getBytes method
        String strr = "This is a good day to code";
        byte[] bb = strr.getBytes(); // will use character encoding of the machine
        byte[] bbb = strr.getBytes(StandardCharsets.UTF_8); // specify character encoding

        System.out.print(isValid0(null));

        /*Esc. Char	Description
        \\	Translated into a single \ character in the String
        \t	Translated into a single tab character in the string
        \r	Translated into a single carriage return character in the string
        \n	Translated into a single new line character in the string
        */



    }

    public static boolean isValid(String value) {
        return "123".equals(value);
    }
    public static boolean isValid0(String value) {
        return value.equals("123");
    }
}
