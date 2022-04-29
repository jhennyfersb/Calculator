package com.jhenny;

public class Droid {

    int baterryLevel = 100;
    String name;

    public int energyReport(){
      return baterryLevel;
    }
    
    public String toString(){
      return "Olá, eu sou o droid: " + name;
    }

    public  void performTask(String task) {
        System.out.println(name + " is performing task: " + task);

    }
    public void energyTransfer(int energy){
      baterryLevel = energy;
    }
    public Droid(String droidName) {
     name = droidName;
    }

  public static void main(String[] args) {
    Droid codey = new Droid("Codey");
    Droid codey2 = new Droid("Codey2");
    System.out.println(codey);
    codey.performTask("dancing");
    codey.baterryLevel = codey.baterryLevel -10;
    System.out.println(codey.energyReport());
    int batteryLevel1 = codey.energyReport();
    int batteryLevel2 = codey2.energyReport();
    codey.energyTransfer(batteryLevel2);
    codey2.energyTransfer(batteryLevel1);

  }
  }