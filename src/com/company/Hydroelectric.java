package com.company;

 class Hydroelectric
{
   private double generatorEfficiencyH;
   private double speedH;
   private double powerH;

    //Перевизначення конструктора 4-ма способами
    Hydroelectric(double generatorEfficiency, double speed, double power) {
        this.generatorEfficiencyH = generatorEfficiency;
        this.speedH = speed;
        this.powerH = power;
    }
    Hydroelectric(double t) {
        generatorEfficiencyH = speedH = powerH = t;
    }
    Hydroelectric(Hydroelectric hy) {
        generatorEfficiencyH = hy.generatorEfficiencyH ;
        speedH = hy.speedH ;
        powerH = hy.powerH;
    }
    Hydroelectric(){
    }
    double energyHydroelectric() {
        double c = generatorEfficiencyH * powerH * speedH;
        return c;
    }
    //Перевизначений метод(тип даних)
    int energyHydroelectric(int generatorEfficiency, int power, int speed) {
        int c = generatorEfficiency * power * speed;
        return c;
    }
    void noiseExposure(double noiseInsulation, double noise ) {
        double f = noiseInsulation/noise;
        System.out.println("Коефіцієнт впливу шуму на гідроелектростанції - " + f);
    }
    void efficiency() {
        double d = speedH*powerH*100;
        System.out.println("Ефективність Гідроелектростанції - " + d);
    }

    public double getGeneratorEfficiencyH() {
        return generatorEfficiencyH;
    }

    public void setGeneratorEfficiencyH(double generatorEfficiencyH) {
        this.generatorEfficiencyH = generatorEfficiencyH;
    }

    public double getPowerH() {
        return powerH;
    }

    public void setPowerH(double powerH) {
        this.powerH = powerH;
    }

    public double getSpeedH() {
        return speedH*2;
    }

    public void setSpeedH(double speedH) {
        this.speedH = speedH;
    }
}
