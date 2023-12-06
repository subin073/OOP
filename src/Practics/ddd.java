package Practics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class ddd {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new FileInputStream("src/circle.txt"));
            double r = sc.nextDouble();
            double area = Math.PI * r * r;
            System.out.printf("반지름: %.2f 원의 면적: %.2f\n", r, area);
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("circle.txt 파일이 존재하지 않습니다.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
