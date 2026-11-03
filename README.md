# JOBSHEET 8 - LOOPS 2

**Identitas Mahasiswa:**
* **Nama:** Datu Ayu Fitria Ceasa
* **NIM:** 264107020087
* **Kelas / No. Presensi:** 1I / 06

---

## 1: OBJECTIVES

1. Understand the concept of nested loops in algorithms 
2. Understand the flow of nested loops
3. Recognize the syntax of nested loops
4. Be able to apply nested loops to solve a simple case study. 

---

## 2: Practical Exercises

### 2.1 Experiment 1: Review of Loops 1

#### 2.1.1 Java Code
```java
import java.util.Scanner; 

public class Star06 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the value of n = "); 
        int n = sc.nextInt(); 
        
        for (int i = 1; i <= n; i++) { 
        System.out.print("*"); 
        } 
        System.out.println(); 
        sc.close(); 
    } 
}
```

#### 2.1.2 Screenshot Output

![Example Image of Experiment 1 Output](/StudentScore.png)

#### 2.1.3 Questions
* **Question 1:** If the initialization i = 1 is changed to i = 0 without changing the condition, how many characters are printed when n = 5? Explain.
  * **Answer:** -------
* **Question 2:** If the condition i <= n is changed to i < n, how many times does the loop run when n = 5? Why is the result different?  
  * **Answer:** --------
* **Question 3:** Predict the output of the following code fragment when n = 9, then verify it by replacing the FOR loop in your program and running it.
  ```
  for (int i = 2; i <= n; i += 2) { 
  System.out.print(i + " "); 
  } 
  ```
  * **Answer:** ----------
* **Question 4:** Explain why changing the increment i++ to i-- (with the condition still i <= n) makes the loop run endlessly, so that it does not stop in a reasonable time for positive n. Do not run that version; if it has already started running, stop the program by pressing Ctrl + C in the terminal. 
  * **Answer:** 
```java
import java.util.Scanner;

public class SiakadFor06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score, highest = 0, lowest = 100;
        int passCount = 0, failCount = 0;
        for (int i = 1; i <= 10; i++) { 
            System.out.print("Enter score for student " + i + ": "); 
            score = sc.nextDouble(); 
            if (score > highest) { 
                highest = score; 
            } 
            if (score < lowest) { 
                lowest = score; 
            } 
            if (score >= 60) {
                passCount++;
            } else {
                failCount++;
            }
        } 
        System.out.println("Highest score: " + highest); 
        System.out.println("Lowest score: " + lowest); 
        System.out.println("Number of students who pass: " + passCount);
        System.out.println("Number of students who fail: " + failCount);
    }
}
```
![](/runCode.png)

---

### 2.2  Experiment 2: Student Grades Case Study in SIAKAD – WHILE Loop

#### 2.2.1 Java Code
```java
import java.util.Scanner;

public class siakadwhile06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score;
        int studentCount, i=0;
        
        System.out.print("Enter the number of students: "); 
        studentCount = sc.nextInt();

        while (i < studentCount) { 
            System.out.print("Enter score for student " + (i + 1) + ": "); 
            score = sc.nextInt(); 
 
            if (score < 0 || score > 100) { 
                System.out.println("Invalid score. Please enter a valid score!"); 
                continue; 
            } 
 
            if (score > 80 && score <= 100) { 
                System.out.println("The grade of student " + (i + 1) + " is A"); 
            } else if (score > 73 && score <= 80) { 
                System.out.println("The grade of student " + (i + 1) + " is B+"); 
            } else if (score > 65 && score <= 73) { 
                System.out.println("The grade of student " + (i + 1) + " is B"); 
            } else if (score > 60 && score <= 65) { 
                System.out.println("The grade of student " + (i + 1) + " is C+"); 
            } else if (score > 50 && score <= 60) { 
                System.out.println("The grade of student " + (i + 1) + " is C"); 
            } else if (score > 39 && score <= 50) { 
                System.out.println("The grade of student " + (i + 1) + " is D"); 
            } else { 
                System.out.println("The grade of student " + (i + 1) + " is E"); 
            } 
            i++; 
        }
    }
}
```
![Example Image of Experiment 2 Output](/siakadwhile.png)

#### 2.2.2 Verification of Experimental Results

Compare the output of your program with the following figure:

```
Enter the number of students: 5 
Enter score for student 1: 85 
The grade of student 1 is A 
Enter score for student 2: 63
The grade of student 2 is C+ 
Enter score for student 3: 101 
Invalid score. Please enter a valid score! 
Enter score for student 3: 23 
The grade of student 3 is E 
Enter score for student 4: -15 
Invalid score. Please enter a valid score! 
Enter score for student 4: 70 
The grade of student 4 is B 
Enter score for student 5: 55 
The grade of student 5 is C
```
![](/trycode.png)

#### 2.2.3 Questions
* **Question 1:** IIn the following code snippet, determine the meaning and purpose of the following syntax:
```
if (score < 0 || score > 100) { 
System.out.println("Invalid score. Please enter a valid score!"); 
continue; 
}
```
  * **Answer:**
    The syntax if (score < 0 || score > 100) { System.out.println("Invalid score. Please enter a valid score!"); continue; } means: if the score is less than 0 or greater than 100, it is invalid, so the program prints an error message and immediately skips the rest of the current loop iteration using continue. Its purpose is to prevent invalid input from being processed and to force the user to enter a correct score before continuing to the next student. The expression in part:
    
    (a) is score < 0 || score > 100, which means “score is below 0 or above 100,”
    
    (b) continue tells the loop to stop the current iteration and go back to the loop condition.
* **Question 2:** Why is the i++ statement written at the end of the WHILE loop? What happens if it is written at the beginning of the WHILE loop?
  * **Answer:**
    The i++ statement is written at the end of the while loop so that each time a valid student score is entered and processed, the counter increases by 1. This keeps track of how many students have already been handled and ensures the loop eventually stops when i reaches studentCount. If i++ were written at the beginning of the loop, the loop would skip the first student because i would increase before checking or processing the score, causing the program to count incorrectly and possibly stop too early.
* **Question 3:** If the number of students entered is 19, how many times will the WHILE loop run?  
  * **Answer:**
    If the number of students entered is 19, the while loop will run 19 times, because the loop condition is while (i < studentCount), so it repeats until i reaches 19. Each valid student input increases i by 1, and the loop stops when i becomes 19.
* **Question 4:** Modify the program so that, if a student receives grade A, the program displays an 
additional message “Well done, keep up the good work!”  
  * **Answer:**
    ![](/modifiedcode.png)

### 2.3 Experiment 3: Café Transaction Case Study – DO-WHILE Loop

#### 2.3.1 Java Code
```java
import java.util.Scanner;

public class cafeDoWhile06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int coffee, tea, bread, totalPrice;
        int coffeePrice = 12000, teaPrice = 7000, breadPrice = 20000;
        String customerName;
        do { 
            System.out.print("Enter customer name (type 'cancel' to exit): "); 
            customerName = sc.nextLine(); 
            if (customerName.equalsIgnoreCase("cancel")) { 
                System.out.println("Transaction canceled."); 
                break; 
            } 
            System.out.print("Coffee quantity: "); 
            coffee = sc.nextInt(); 
            System.out.print("Tea quantity: "); 
            tea = sc.nextInt(); 
            System.out.print("Bread quantity: "); 
            bread = sc.nextInt(); 
            totalPrice = (coffee * coffeePrice) + (tea * teaPrice) + (bread * breadPrice); 
            System.out.println("Total amount to pay: Rp " + totalPrice); 
            sc.nextLine(); 
        } while (true); 
 
        System.out.println("All transactions completed."); 
        
    }
}
```

#### 2.3.2 Screenshot Output

![Example Image of Experiment 3 Output](/coffeeCust.png)

#### 2.3.3 Questions
* **Question 1:** In this DO-WHILE loop, if the first customer name entered is “cancel”, how many times is the loop executed?
  * **Answer:** The loop runs once. A do-while loop executes its body before checking the condition. Since the first name is “cancel,” the break statement exits the loop during that first execution.
* **Question 2:** State the stopping condition used in this DO-WHILE loop! 
  * **Answer:** The loop’s condition is while (true), which is always true. In practice, the loop stops when the customer enters “cancel” and the break statement runs.
* **Question 3:** What is the function of using the value true in the DO-WHILE condition? 
  * **Answer:** true makes the loop repeat indefinitely unless it is exited another way, such as with the break statement.
* **Question 4:**Why does this DO-WHILE loop still run even though it has no initialization and update components?   
  * **Answer:** A do-while loop does not require initialization or update components like a for loop. It executes its body, checks its condition, and repeats while the condition is true. Here, the loop is controlled by while (true) and exits through break when the customer enters “cancel”.

---

## 3: Assignment 

The following is a list of tasks performed on this Jobsheet:

- [x] **Task 1:** A cinema manager wants to create a program to calculate the total ticket sales in one 
day. Tickets are sold at Rp 50,000 per ticket. The program must calculate the total number 
of tickets sold and the total ticket sales revenue for the day, subject to the following rules:

    • If a customer buys more than 4 tickets, the customer receives a 10% discount. 

    • If a customer buys more than 10 tickets, the customer receives a 15% discount. 

    • If the ticket quantity entered is invalid (negative), the program ignores the input and 
      asks for it to be re-entered.
      
- [x] **Task 2:** Refer to the following flowchart!
      
![](/flowchart.png)

A parking lot operator wants to create a program to calculate the total parking fees of several vehicles. The parking rate is Rp 3,000 per hour for cars and Rp 2,000 per hour for motorcycles. The program keeps asking for input as long as the input is not 0. Implement the flowchart as a Java program! 

### 3.1 Task 1 Code Implementation

```java
import java.util.Scanner;

public class ticketSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TICKET_PRICE = 50000;
        int customerCount, totalTickets = 0;
        double totalRevenue = 0;

        System.out.print("Enter the number of customers: ");
        customerCount = sc.nextInt();

        for (int i = 1; i <= customerCount; i++) {
            int quantity;
            do {
                System.out.print("Enter the number of tickets for customer " + i + ": ");
                quantity = sc.nextInt();
                if (quantity < 0) {
                    System.out.println("Invalid quantity. Please enter a non-negative number.");
                }
            } while (quantity < 0);

            double discountRate = 0;
            if (quantity > 10) {
                discountRate = 0.15;
            } else if (quantity > 4) {
                discountRate = 0.10;
            }

            totalTickets += quantity;
            totalRevenue += quantity * TICKET_PRICE * (1 - discountRate);
        }
        System.out.println("Total tickets sold: " + totalTickets);
        System.out.printf("Total ticket sales revenue: Rp %.0f%n", totalRevenue);
    }
}
```
![](/ticketSaler.png)

### 3.2 Task 2 Code Implementation
```java
import java.util.Scanner;

public class motorcycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type, duration, total = 0;

        do {
            System.out.print("Enter vehicle type (1=Car, 2=Motorcycle, 0=Exit): ");
            type = sc.nextInt();

            if (type == 1 || type == 2) {
                System.out.print("Enter parking duration in hours: ");
                duration = sc.nextInt();

                if (type == 1) {
                    total += duration * 3000;
                } else {
                    total += duration * 2000;
                }
            } else if (type != 0) {
                System.out.println("Invalid vehicle type. Please enter 1, 2, or 0.");
            }
        } while (type != 0);

        System.out.println("Total parking fee: Rp " + total);
    }
}
```
![](/parking.png)

---

## 4: Conclusion

These programs demonstrate how loops and conditional
