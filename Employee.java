package com.company;

public class Employee {

    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    //constructor
    public Employee(int baseSalary){
        this(baseSalary,20);

    }
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees ++;

    }
    public static void printNumberOfEmployees(){


    }

    //method
    public int calculateWage (int extraHours){
        return baseSalary + (extraHours * getHourlyRate());
    }
    //method overloading
    public int calculateWage (){
        return calculateWage(0);
    }

    //getters
    private int getBaseSalary (){
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    //setters
    private void setBaseSalary(int baseSalary){
        if (baseSalary<=0)
            throw new IllegalArgumentException("please enter a value >0");
        this.baseSalary = baseSalary;
    }
    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate<0)
            throw new IllegalArgumentException("please enter value >0");
        this.hourlyRate = hourlyRate;
    }
}
