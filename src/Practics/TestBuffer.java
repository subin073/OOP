package Practics;
import java.io.*;
public class TestBuffer {
    public static void main(String[] args) {
        String fileName = "travel.txt";

        try{
            BufferedWriter bf = new BufferedWriter(new FileWriter(fileName));
            bf.write("I love to travel. \r\n");
            bf.write("The cities I have visited: \r\n");
            bf.write("\t- Seoul \r\n");
            bf.write("\t- New York \r\n");
            bf.close();

            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
