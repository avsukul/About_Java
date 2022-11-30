package google.week1;

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

        // Create a String
        String str = new String("My string");

        // String literal
        String sl = "a string literal";

    }
}
