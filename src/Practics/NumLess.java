package Practics;

public class NumLess {
    boolean NumLess(int num){
        if(num<100){
            return (true);
        }else {
            return (false);
        }
    }

    public static void main(String[] args) {
    NumLess NumLess = new NumLess();
        System.out.println(NumLess.NumLess(10));
        System.out.println(NumLess.NumLess(70));
        System.out.println(NumLess.NumLess(160));

    }
}
