/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopbasicslab;
import java.util.Scanner;
/**
 *
 * @author SHANE
 */
public class OOPBasicsLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        student student1 = new student();
        student student2 = new student();
        Scanner input = new Scanner(System.in);
        System.out.print("Hello pls enter student data\nEnter Name: ");
        String A = input.nextLine();
        System.out.print("Enter Age: ");
        int B = input.nextInt();
        System.out.print("Enter Grade: ");
        double C = input.nextDouble();
        input.nextLine();
        student1.setname(A);
        student1.setage(B);
        student1.setgrade(C);
        System.out.print("Hello pls enter student data\nEnter Name: ");
        String a = input.nextLine();
        System.out.print("Enter Age: ");
        int b = input.nextInt();
        System.out.print("Enter Grade: ");
        double c = input.nextDouble();
        student2.setname(a);
        student2.setage(b);
        student2.setgrade(c);
        System.out.println("Now lets enter the car data.");
        input.nextLine();
        System.out.print("type the brand here: ");
        String D = input.nextLine();
        System.out.print("type the model here: ");
        String E = input.nextLine();
        System.out.print("type the Speed here: ");
        double F = input.nextDouble();
        student.Vehicle car = student1.new Vehicle( D, E, F);
        System.out.print("Did the car accelerate?\nAnswer here (yes/no): ");
        input.nextLine();
        String G = input.nextLine();
        if (G.equals("yes")){System.out.print("How much?\nanswer here: "); 
        double H = input.nextDouble();
        car.accelerate(H);}
        System.out.println("Now lets enter the motorcycle data.");
        input.nextLine();
        System.out.print("type the brand here: ");
        String d = input.nextLine();
        System.out.print("type the model here: ");
        String e = input.nextLine();
        System.out.print("type the Speed here: ");
        double f = input.nextDouble();
        student.Vehicle motorcycle = student2.new Vehicle( d, e, f);
        System.out.print("Did the car accelerate?\nAnswer here (yes/no): ");
        input.nextLine();
        String g = input.nextLine();
        if (g.equals("yes")){System.out.print("How much?\nanswer here: "); 
        double h = input.nextDouble();
        input.nextLine();
        motorcycle.accelerate(h);}
        System.out.println("welcome to your bank Account.");
        student.BankAccount Money = student1.new BankAccount();
        boolean I = true;
        while (I == true) {
        Money.display();
        System.out.print("Would you like to (deposite or withdraw)?\nAnwer here ");
        String J = input.nextLine();
        if (J.equals("deposite")) { 
        System.out.print("insert here the amount: ");
        double K = input.nextDouble();
        input.nextLine();
        Money.deposite(K);}
        else if (J.equals("withdraw")) {
        System.out.print("insert here the amount: ");
        double L = input.nextDouble();
        input.nextLine();
        Money.withdraw(L);}
        System.out.print("Repeat? (y/n): ");
        String M = input.nextLine();
        if (M.equals("n")){
         I = false;}
        if (M.equals("y")){ }
        }
        System.out.println("Circle Geometry ");
        System.out.print("Enter radius for the 1st Circle: ");
        int N = input.nextInt();
        student.Circle circle1 = student1.new Circle(N);
        System.out.print("Enter radius for the 2nd Circle: ");
         int O = input.nextInt();
        student.Circle circle2 = student2.new Circle(O);
        
        System.out.println("\n====================================");
        System.out.println("         Final DATA Summary         ");
        System.out.println("\n Students Profile");
        student1.displayInfo();
        student2.displayInfo();
        System.out.println("\n Vehicle  Information");
        car.displayStatus();
        motorcycle.displayStatus();
        System.out.println("\n Bank Statemenet");
        Money.displayBalanace();
        System.out.println("\n Circle Geometry");
        circle1.displayDetails();
        circle2.displayDetails();
    }

}

