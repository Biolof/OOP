package com.company;

public class Main {

public static void main(String[] args) {
        //SolarPanel <---------------
        SolarPanel num = new SolarPanel("Ясно", 2.0, 3.0, 20);
        System.out.println("Вироблена енергія панелями - " + num.getEnergySolarPanel());//Виклик закритого методу
        //Перевизначений метод(Тип даних)
        System.out.println("Вироблена енергія панелями - " + num.energySolarPanel(2, 3));
        num.square(5.1, 7.8);
        //Перевантажений метод
        num.efficiency();
        //Hydroelectric <---------------
        //Перевизначення конструктора 4-ма способами
        Hydroelectric num2 = new Hydroelectric(1.0, 2.0, 3.0);
        Hydroelectric num2_2 = new Hydroelectric(1);
        Hydroelectric num2_3 = new Hydroelectric(num2);
        Hydroelectric num2_4 = new Hydroelectric();
        num2_4.setPowerH(3.0);
        num2_4.setSpeedH(2.0);
        num2_4.setGeneratorEfficiencyH(1.0);
        System.out.println("Вироблена енергія Гідроелектростанцією - " + num2.energyHydroelectric());
        //Перевизначений метод(Тип даних)
        System.out.println("Вироблена енергія Гідроелектростанцією - " + num2.energyHydroelectric(1, 2, 3));
        num2.noiseExposure(1.0, 3.0);
        //Перевантажений метод
        num2.efficiency();
        //NuclearPowerPlant <---------------
        NuclearPowerPlant num3 = new NuclearPowerPlant(8, 2, 2);
        System.out.println("Забруднення атмосфери -  " + num3.atmosphericPollution(1.0, 12));
        //Перевизначений метод(Тип даних)
        System.out.println("Забруднення атмосфери -  " + num3.atmosphericPollution(1, 12));
        num3.efficiency();
        //Battery1 <---------------
        Battery1 battery1 = new Battery1("Ясно", 2, 5, 20);
        battery1.test();
        //Інтерфейси
        Printable printable = new Developer("Електрика", "Д.Горбай");
        printable.print();
     }
}
