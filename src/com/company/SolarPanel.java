package com.company;

 class SolarPanel {
     private String weatherS;
     private double timeS;
     private double powerS;
     int capacity = 20;

     SolarPanel(String weather, double time, double power, int capacity) {
         this.weatherS = weather;
         this.timeS = time;
         this.powerS = power;
         this.capacity = capacity;
     }

     private double energySolarPanel() {
         double a = timeS * powerS;
         return a;
     }

     //Перевизначений метод(Тип даних)
     int energySolarPanel(int time, int power) {
         int a = time * power;
         return a;
     }

     void square(double length, double width) {
         double s = length * width;
         System.out.println("Площа пенелей - " + s);
     }

     void efficiency() {
         double d = timeS * powerS * 100;
         System.out.println("Ефективність Сонячних панелей - " + d);
     }

     public String getWeatherS() {
         return weatherS;
     }

     public void setWeatherS(String weatherS) {
         this.weatherS = weatherS;
     }

     public double getTimeS() {
         return timeS;
     }

     public void setTimeS(double timeS) {
         this.timeS = timeS;
     }

     public double getPowerS() {
         return powerS;
     }

     public void setPowerS(double powerS) {
         this.powerS = powerS;
     }
     public double getEnergySolarPanel(){
         return energySolarPanel();
     }
 }

