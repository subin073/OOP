package Practics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readhello {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("src/hello.txt"));

           while (sc.hasNext()){
               String s = sc.nextLine();
               System.out.println(s);
           }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("hello.txt 파일이 존재하지 않습니다.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
