package com.company;


interface Voltage {
    void displayVoltage();
}

public class Main {
    public static void main(String[] args) {
        Charger charger = new Charger();
        Android adapter = new Android(charger);
        adapter.displayVoltage();
    }
}

class Charger {
    public void charge(){
        System.out.println("Зарядное устройство: 220 вольт");
    }
}

class Android implements Voltage {
    private final Charger charger;
    public Android(Charger charger){
        this.charger = charger;
    }
    @Override
    public void displayVoltage() {
        System.out.println("Адаптер преобразует напряжение 380 вольт в 220 вольт");
        charger.charge();
    }
}