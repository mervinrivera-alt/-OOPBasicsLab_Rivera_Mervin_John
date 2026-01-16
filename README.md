# -OOPBasicsLab_Rivera_Mervin_John
# Java OOP Integrated Practice System

This project is a consolidated Java console application that demonstrates fundamental Object-Oriented Programming (OOP) concepts. It combines multiple scenarios—Student Management, Vehicle Simulation, Banking, and Geometry—into a single execution flow using **Inner Classes** and **Encapsulation**.

## 📂 Project Structure

The project consists of a single outer class (`student`) which contains the `main` method and several inner classes representing different entities.

**File Name:** `student.java`

### Class Hierarchy:
* **`student`** (Outer Class & Main Entry Point)
    * `student.Vehicle` (Inner Class)
    * `student.BankAccount` (Inner Class)
    * `student.Circle` (Inner Class)

---

## 📋 Activity Breakdown

The code implements the following five specific activities:

### Activity 1: Create a Class and Object
* **Goal:** Initialize student objects.
* **Implementation:** The code asks for input (Name, Age, Grade) for two separate student instances (`student1` and `student2`).

### Activity 2: Encapsulation
* **Goal:** Protect data using private attributes.
* **Implementation:** The `student` class uses `private` variables for `name`, `age`, and `grade`. Data is accessed and modified strictly through **Getter** and **Setter** methods (e.g., `student1.setname(A)`).

### Activity 3: Vehicle Class Example
* **Goal:** Simulate object behavior.
* **Implementation:** The inner `Vehicle` class models a Car and a Motorcycle.
* **Logic:**
    * Accepts Brand, Model, and base Speed.
    * Asks the user if they want to accelerate.
    * Calculates the new speed using the `accelerate()` method.

### Activity 4: Bank Account Simulation
* **Goal:** Control flow and loops.
* **Implementation:** The inner `BankAccount` class simulates an ATM.
* **Logic:**
    * Uses a `while` loop to keep the session open.
    * Allows the user to type "deposite" or "withdraw".
    * Updates the balance dynamically and checks for sufficient funds during withdrawal.

### Activity 5: Circle Geometry
* **Goal:** Mathematical computation and return values.
* **Implementation:** The inner `Circle` class.
* **Logic:**
    * Accepts a radius input.
    * Uses `Math.PI` and `Math.pow` to accurately calculate **Area** and **Circumference**.

---

## 🚀 How to Run

### Prerequisites
* Java Development Kit (JDK) installed.

### Steps
1.  **Save the code:** Ensure all your code (the Main method and the Classes) is inside a file named `student.java`.
2.  **Compile:** Open your terminal/command prompt and run:
    ```bash
    javac student.java
    ```
3.  **Run:** Execute the program:
    ```bash
    java student
    ```

---

## 🖥️ Usage Guide

When you run the program, the console will guide you through the data entry process in this order:

1.  **Student Data:** Enter details for Student 1 and Student 2.
2.  **Car Data:** Enter details and choose whether to accelerate.
3.  **Motorcycle Data:** Enter details and choose whether to accelerate.
4.  **Banking:** Enter 'deposite' or 'withdraw' until you choose to stop (answer 'n').
5.  **Geometry:** Enter the radius for two circles.

### 📊 Final Output
At the very end of the execution, the program generates a **Final Data Summary** block. This displays the final state of all objects created during the session:

* Profiles for both students.
* Final speeds of the Car and Motorcycle.
* Final Balance of the Bank Account.
* Calculated Area and Circumference of the circles.
