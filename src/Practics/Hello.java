package Practics;

public class Hello {
    String toWhom = "world";

    Hello(){}
    Hello(String whom){
        toWhom= whom;
    }
    void sayHello(){
        System.out.println("Hello"+toWhom);
    }
}
/*
class TestHello{
    void callSayHello(){
        Hello hello = new Hello();
        hello.sayHello();
    }
}*/