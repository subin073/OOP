package Practics;

import org.w3c.dom.ls.LSOutput;

abstract class Hello{
    private String towhom;

    public Hello(String whom){towhom = whom;}
    public String getWhom(){return  towhom;}
    public abstract void sayHello();
}
class HelloFrench extends Hello {
    public HelloFrench(String toWhom) {
        super(toWhom);
    }

    @Override
    public void sayHello()

    {
        System.out.println("Binjour" + getWhom());
    }

    class HelloKorean extends Hello {
        public HelloKorean(String toWhom) {
            super(toWhom);
        }

        @Override
        public void sayHello() {
            System.out.println("안녕하세요" + getWhom());
        }
    }
}
class TestHello {
    public static void main(String[] args) {
        Hello[] hArray = new Hello[2];
        hArray[0] = new HelloFrench("js1");
        hArray[1] = new HelloKorean("js2");
        for (Hello hello : hArray) { hello.sayHello(); }
    }
}

