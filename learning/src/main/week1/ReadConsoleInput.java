package main.week1;

import java.util.Scanner;

public class ReadConsoleInput {


    public static void main(String args[]) {


        Scanner sc = null;
        try {

            sc = new Scanner(System.in);
            char choice = 0;
            do {
                int input = sc.nextInt();
                System.out.println(input);

                boolean response = true;
                while (response) {
                    System.out.println("y to continue n to exit!");
                    choice =  sc.next().charAt(0);
                    if (Character.isLetter(choice) && (String.valueOf(choice).equalsIgnoreCase("y") ||
                            String.valueOf(choice).equalsIgnoreCase("n"))) {
                        response = false;
                    }
                }
            } while (String.valueOf(choice).equalsIgnoreCase("y") ||
                    !String.valueOf(choice).equalsIgnoreCase("n"));

        } catch (Exception e) {

            System.err.print(e);

        } finally {

            sc.close();

        }

    }

}
