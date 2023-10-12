package Practics;

public class Add {
    //동일 클래스 내에 메소드 이름은 같게, 매개변수는 다르게 == 오버로딩
    String add(String s1, String s2) {
        return s1 + ' ' + s2;
    }

    double add(double d1, double d2) {
        return d1 + d2;
    }

    int add(int n1, int n2) {
        return n1 + n2;
    }


    public static void main(String[] args) {
        Add a = new Add();

        int sumInt = a.add(1, 2);
        double sumDouble = a.add(3.5, 5.5);
        String sumStr = a.add("cute", "cat");
        System.out.println(sumInt);
        System.out.println(sumDouble);
        System.out.println(sumStr);

    }
}