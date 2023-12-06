package Practics;

class NoCoffeeExc extends Exception {
    public NoCoffeeExc(String e) {
        super(e);
    }

    public String getMessage() {
        System.out.println("Get more coffee!");
        return super.getMessage();
    }
}
class CoffeeMach{
    private  int amountCoffeeB;

    public CoffeeMach(int beans) {amountCoffeeB = beans;}
    public  int getAmountCoffeeB() {return amountCoffeeB;}
    public void addCoffeeBeans(int beans){
        amountCoffeeB += beans;
    }
    public void brew() throws NoCoffeeExc{
        if(amountCoffeeB < 10){
            throw new NoCoffeeExc("No coffee Exception...");
        }
        System.out.println("Brewing...");
        amountCoffeeB -= 10;
    }
}

public class CoffeeMachineExc {
    public static void main(String[] args) {
        CoffeeMach coffee = new CoffeeMach(15);

        try{
            coffee.brew();
            coffee.brew();

        }
        catch (NoCoffeeExc e){
            System.out.println(e.getMessage());
        }
    }
}
