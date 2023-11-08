package Homework;


class Monitor {
    private String size;
    private String color;
    private String powerConsumption;

    public Monitor(String size, String color, String powerConsumption) {
        this.size = size;
        this.color = color;
        this.powerConsumption = powerConsumption;
    }

    public void printInfo() {
        System.out.println("Monitor Information:");
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Power Consumption: " + powerConsumption);
    }
}

class Computer {
    private String CPU;
    private String memory;
    private String HDD;
    private String coolerColor;
    private String power;

    public Computer(String CPU, String memory, String HDD, String coolerColor, String power) {
        this.CPU = CPU;
        this.memory = memory;
        this.HDD = HDD;
        this.coolerColor = coolerColor;
        this.power = power;
    }

    public void printInfo() {
        System.out.println("Computer Information:");
        System.out.println("CPU: " + CPU);
        System.out.println("Memory: " + memory);
        System.out.println("HDD: " + HDD);
        System.out.println("Cooler Color: " + coolerColor);
        System.out.println("Power: " + power);
    }
}

class PersonalComputer {
    private Monitor monitor;
    private Computer computer;

    public PersonalComputer(Monitor monitor, Computer computer) {
        this.monitor = monitor;
        this.computer = computer;
    }

    public void turnOn() {
        System.out.println("The personal computer is turning on.");
    }

    public void printInfo() {
        System.out.println("Personal Computer Information:");
        monitor.printInfo();
        computer.printInfo();
    }
}

public class Homework5 {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("32인치", "검은색", "45W");
        Computer computer = new Computer("Core i7", "32GB", "2TB", "흰색", "700W");

        PersonalComputer personalComputer = new PersonalComputer(monitor, computer);
        personalComputer.turnOn();
        personalComputer.printInfo();
    }
}
