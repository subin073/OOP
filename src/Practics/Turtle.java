package Practics;

public class Turtle {
    protected int limbs = 4;
    protected String food;
    public void setFood(String f){this.food = f;}
    public void eat(){
        System.out.println("Tutle eats" + food);
    }
}

class SeaTurtle extends Turtle{
    public void swim(){
        System.out.println("A sea turtle swim...");
    }
}

class LandTurtle extends Turtle{
    public void walk(){
        System.out.println("A land turtle walk...");
    }
}
