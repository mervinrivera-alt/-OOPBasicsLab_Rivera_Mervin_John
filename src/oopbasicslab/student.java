/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopbasicslab;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
/**
 *
 * @author SHANE
 */
public class student {
    //attributes
    private String name;
    private int age;
    private double grade;    
    //contructor
    public student() {
   }
    
    //Methods
    void displayInfo(){
    System.out.println("--- student Details ---");
    System.out.println("Name: "+name+"\nAge: "+age+"\nGrade: "+grade);
   }
    public String getname() {
    return name;
    }
    public int getage() {
    return age;
    }
    public double getgrade() {
    return grade;    
    }
    void setname (String newname) {
    this.name = newname;
    }  
    void setage (int newage) {
    this.age = newage;
  }
    void setgrade (double newgrade) {
    this.grade = newgrade;
  }
    public class Vehicle {
    //Attributes
    String Brand;
    String Model;
    double Speed;
    double speed;
    double total;
    //constructor
    public Vehicle(String brand,String model,double speed){
    this.Brand = brand;
    this.Model = model;
    this.Speed = speed;
    }
    void accelerate(double incramates){
    this.speed = incramates;
    this.total = this.Speed + this.speed;
   
    }
    void displayStatus() {
    System.out.println("--- Vehicle Details ---");
    System.out.println("Brand: "+Brand+"\nModel: "+Model+"\nSpeed: "+Speed+"\nAfter accelerating by "+speed+" km/h: "+this.total+" km/h");
    }
    }
    public class BankAccount {
    //Attributes
    String accountHolder;
    double balance; 
    //constructor
    public BankAccount(){
    this.accountHolder = "User";
    }
    void deposite(double amount) {
    double Amount = amount;
    this.balance = this.balance + Amount;
    }
    void withdraw(double amount){
    double Amount = amount;
    this.balance = this.balance - Amount;
    }
    void display() {
     System.out.println("--- Bank Details ---");
     System.out.println("Account Name: "+this.accountHolder+"\nBalance: "+this.balance);}
     void displayBalanace() {
     System.out.println("Balance: "+this.balance);}
  } 
    public class Circle {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea (){
        return (PI * pow(radius,2)); 
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public void displayDetails() {
        System.out.println("--- Circle Details ---");
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", getArea());
        System.out.printf("Circumference: %.2f%n", getCircumference());
    } 
  } 
}

