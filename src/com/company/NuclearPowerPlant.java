package com.company;

 class NuclearPowerPlant
{
   private int timeN;
   private int powerUnitN;
   private double powerN;

    NuclearPowerPlant(int time, int powerUnit, double power) {
        this.timeN = time;
        this.powerUnitN = powerUnit;
        this.powerN = power;
    }
    double atmosphericPollution(double emissionsPerDay, int day) {
        double pollution = emissionsPerDay * day;
        return pollution;
    }
    //Перевизначений метод(Тип даних)
    int atmosphericPollution(int emissionsPerDay, int day) {
        int pollution = emissionsPerDay * day;
        return pollution;
    }
    void efficiency() {
        double d = powerN/timeN*100;
        System.out.println("Ефективність реактора - " + d);
    }

    public double getPowerN() {
        return powerN;
    }

    public void setPowerN(double powerN) {
        this.powerN = powerN;
    }

    public int getPowerUnitN() {
        return powerUnitN;
    }

    public void setPowerUnitN(int powerUnitN) {
        this.powerUnitN = powerUnitN;
    }

    public int getTimeN() {
        return timeN;
    }

    public void setTimeN(int timeN) {
        this.timeN = timeN;
    }
}
