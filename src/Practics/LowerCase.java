package Practics;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LowerCase {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src/hello.txt");
            BufferedReader br = new BufferedReader(fr);
            int data;

            while ((data = br.read()) != -1) {
                char ch = Character.toLowerCase((char) data);
                System.out.print(ch);
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
