package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee employee = new Employee(100, "chitra", 9000, 5,"java");
        employee.displayData();
        Employee employee1 = new Employee(101,"suchi",3000,3,".net");
        Employee employee2 = new Employee(102,"chiru",5000,3,"azure");
        Employee employee3 = new Employee(101,"sam",1000,3,".net");
        System.out.println(("*********************************************"));
        System.out.println("2.Display first employee Name and second employee Salary");
        System.out.println("First Employee Name: "+employee1.getName());
        System.out.println("Second Employee Salary: "+employee2.getSalary());
        System.out.println(("*********************************************"));
        employee1.displayData();
        //Addition.add();
        //java: add() has private access in com.company.Addition
        Addition.typeCasting();
        Addition.test();
        Addition.add(90,10);
        Addition.add("Add method called");
        show(employee1);
        System.out.println(employee1.getId()+" "+employee1.getSalary()+" "+employee1.getName());

        //show1(employee1);
        //Non-static method 'show1(com.company.Employee)' cannot be referenced from a static context
        //Main main = new Main();
        //main.show1(employee1);
    }

    public static void show(Employee e){
        e.displayData();
        e.setId(105);

    }
    public void show1(Employee e){
        e.displayData();

    }
}
