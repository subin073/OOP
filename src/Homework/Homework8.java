package Homework;

import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {

    public static void main(String[] args) {
        // 미리 저장된 ID와 비밀번호를 해시맵에 저장
        HashMap<String, String> credentials = new HashMap<>();
        credentials.put("myId", "myPass");
        credentials.put("myId2", "myPass2");
        credentials.put("myId3", "myPass3");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String inputId = scanner.nextLine().trim();

            if (!credentials.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password : ");
            String inputPassword = scanner.nextLine().trim();

            // 입력된 ID에 대한 비밀번호 일치 여부 확인
            if (credentials.get(inputId).equals(inputPassword)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }

        scanner.close();
    }
}
