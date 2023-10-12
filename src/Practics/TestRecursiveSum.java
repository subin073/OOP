package Practics;

public class TestRecursiveSum {

    /* 최대 공약수
    int gcd(int a, int b){
        if(a == b){
            return 0;
        } else if (a > b) {
            return gcd(a - b, b);
        }else{
            return gcd(a -b, a);
        }
    }*/

    long sum(int n){
        if(n==1){
            return 1;
        } else  {
            return n + sum(n -1);
        }

    }

    public static void main(String[] args) {
        TestRecursiveSum sum = new TestRecursiveSum();
        System.out.println(sum.sum(100));
    }
}
