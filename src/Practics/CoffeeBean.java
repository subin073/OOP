package Practics;

public class CoffeeBean {
    private  String species = "coffee";
        void print(){
            System.out.println(species);
        }
        private void setSpecies(String s){species = s;}
    public  String getSpecies(){return species;}
}
class Robusta extends CoffeeBean{
    @Override
    void print(){
        System.out.println("Robusta coffee...");
    }
    void print(String s){
        System.out.printf("%s: %s/n", getSpecies(), s);
    }
}
