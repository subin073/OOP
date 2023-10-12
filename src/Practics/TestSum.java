package Practics;

class sum1 {
    int sum = 0; //초기화

    int getSum() {
        return sum;
    }

    int add(int num) {
        if (num <= 50) {
            return sum;
        } else if (num > 100) {
            sum += num;
        }
        printsum();
        return sum; //없애도 무관
        }
    void printsum(){
            System.out.println(getSum());
    }
}


public class TestSum {
    public static void main(String[] args) {
        sum1 s = new sum1();
        s.add(101);
        s.add(50);
        s.add(10);
        s. printsum();
    }

}
