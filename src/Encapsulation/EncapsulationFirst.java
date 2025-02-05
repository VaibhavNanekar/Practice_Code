package Encapsulation;

import java.sql.SQLOutput;

class Encapsulate{
   private String Name;
    private int Age;
    private double Salary;
    private String City;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public static void main(String[] args) {
        Encapsulate obj=new Encapsulate();
        obj.setName("Rushi");
        obj.setAge(20);
        obj.setSalary(50000);
        obj.setCity("Pune");

        System.out.println("Encapsulation Program");
        System.out.println("Name:"+ obj.getName());
        System.out.println("Age:" + obj.getAge());
        System.out.println("Salary:" + obj.getSalary());
        System.out.println("City:" + obj.getCity());

    }
}
