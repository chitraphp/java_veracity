package com.company;

public class Employee {
    private int id;
    private String name;
    private float salary;
    private int experience;
    private String technology;
    public Employee(int id, String name, float salary, int experience, String technology){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
        this.technology = technology;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void displayData(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("salary:"+salary);
        System.out.println("Experience:"+experience+"years");
        System.out.println("Technology:"+technology);
    }
}

class Addition{
    public static int num1 = 10;
    public static int num2 = 20;
    public int num3 = 15;
    public int num4 = 25;
    private static void add(){
        int result = num1+num2;
        //int result = num3+num4;
        //Non-static field 'num4' cannot be referenced from a static contex
        System.out.println(result);
    }

    public static void typeCasting(){

        float number = 10.5f;
        int number2 = (int)number;
        System.out.println(number2);
    }

    public static void test(){
        char ch = 98;
        System.out.println(ch);

    }
    public static void add(int num1, int num2){
        int result= num1+num2;
        System.out.println(result);
    }
    public static void add(String str){
        System.out.println(str);
    }

}








