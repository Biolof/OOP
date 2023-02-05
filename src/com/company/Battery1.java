package com.company;

public class Battery1 extends SolarPanel{
    Battery1(String weather, double time, double power, int capacity) {
        super(weather, time, power, capacity);
    }
    void capacity(){
        System.out.println("Ємність акамулятора на сонячних панелях - " + capacity);
    };
    void test(){
        BatteryDemo bd = new BatteryDemo();
        bd.methodBatteryDemo();
    }
    class BatteryDemo{
        void methodBatteryDemo(){
            if (capacity>15){
                System.out.println("Ємність акамулятора не можна збільшити");
            }
            else{
                System.out.println("Ємність акамулятора можна збільшити");
            }
            capacity();
        }
    }
}
