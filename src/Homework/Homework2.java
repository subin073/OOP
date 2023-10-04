package Homework;

import java.util.Scanner;

class Student {
    private int studentID;
    private String name;
    private String major;
    private String phoneNumber;

    public Student(int studentID, String name, String major, String phoneNumber) {
        this.studentID = studentID;
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    // Getter 메소드
    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter 메소드
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3명의 학생 정보를 입력받아 Student 객체 생성
        Student[] students = new Student[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("학번, 이름, 전공, 전화번호를 띄어쓰기로 입력하세요:");
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");

            if (inputArray.length == 4) {
                int studentID = Integer.parseInt(inputArray[0]);
                String name = inputArray[1];
                String major = inputArray[2];
                String phoneNumber = formatPhoneNumber(inputArray[3]);

                students[i] = new Student(studentID, name, major, phoneNumber);
            } else {
                System.out.println("잘못된 입력입니다. 학생 정보를 다시 입력하세요.");
                i--;  // 다시 입력 받도록 인덱스를 줄입니다.
            }
        }

        // 입력된 학생 정보 출력
        System.out.println("입력된 학생 정보:");
        for (Student student : students) {
            System.out.println("학번: " + student.getStudentID());
            System.out.println("이름: " + student.getName());
            System.out.println("전공: " + student.getMajor());
            System.out.println("전화번호: " + student.getPhoneNumber());
            System.out.println();
        }

        scanner.close();
    }

    // 전화번호 형식 변환 메소드
    private static String formatPhoneNumber(String phoneNumber) {
        // "-" 제거하고 앞자리 0 복구 및 하이픈 추가
        phoneNumber = phoneNumber.replace("-", "");
        phoneNumber = "010-" + phoneNumber.substring(1, 5) + "-" + phoneNumber.substring(5);
        return phoneNumber;
    }
}
