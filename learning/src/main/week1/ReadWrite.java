package main.week1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadWrite {

    public static void main(String argos[]) throws IOException {

        BufferedReader br = null;
        try {
            // path to the file for which to read.
            String filePath = System.getenv("PWD") + "/src/google/main.week1/File.txt";
            // efficiently read all bytes.
            br = new BufferedReader(new FileReader(filePath));

            String line = "";
            // read each line until null is returned.
            while((line = br.readLine()) != null) {

                System.out.println(line);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        br.close();


    }



}
