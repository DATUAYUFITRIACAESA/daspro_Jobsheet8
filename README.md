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
  * **Answer:** -----------

---

### 2.2  Experiment 2: Rectangle Star Pattern (Nested FOR)

#### 2.2.1 Java Code
```java
import java.util.Scanner; 

public class Rectangle06 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number of rows: "); 
        int rows = sc.nextInt(); 
        System.out.print("Enter the number of columns: "); 
        int columns = sc.nextInt(); 

        for (int i = 1; i <= rows; i++) {    // outer loop: rows     
            for (int j = 1; j <= columns; j++) {   // inner loop: columns 
                System.out.print("*"); 
            } 
            System.out.println();    // new line              
        } 
    } 
}
```
![Example Image of Experiment 2 Output](/siakadwhile.png)


#### 2.2.3 Questions
* **Question 1:** Explain the function of the variables i and j in the program.
  * **Answer:** ------------
* **Question 2:** How many times are the outer loop, the inner loop, and the statement print("*") executed for rows = 4 and columns = 7? 
  * **Answer:** --------------
* **Question 3:** What happens if the bounds of the outer and inner loops are swapped (the outer loop uses columns and the inner loop uses rows)? Use rows = 3 and columns = 6 to explain. 
  * **Answer:** ----------
* **Question 4:** Explain the effect of removing System.out.println(); after the inner loop.  
  * **Answer:** -------------
* **Question 5:** Modify the program so that the printed character is #, then commit and push the changes to GitHub.
  * **Answer:** -------------

### 2.3 Experiment 3: Debugging a Star Triangle – Nested WHILE

#### 2.3.1 Java Code
```java
import java.util.Scanner; 
 
public class Triangle06 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the value of n = "); 
        int n = sc.nextInt(); 
 
        int i = 0; 
        while (i <= n) { 
            System.out.print("[i=" + i + "] ");   // temporary debug
            int j = 0; 
            while (j < i) { 
                System.out.print("*"); 
                j++; 
            } 
            i++; 
        } 
        sc.close(); 
    } 
}
```

#### 2.3.2 Screenshot Output

![Example Image of Experiment 3 Output](/coffeeCust.png)

#### 2.3.3 Questions
* **Question 1:** Identify the mismatches in the initial output, and at least two fixes needed to produce a nested triangle pattern.
  * **Answer:** ------------
* **Question 2:** Explain the roles of the variables i and j. Why must the value of j be reset to 0 in every iteration of the outer loop? What happens if j is not reset? 
  * **Answer:** ------------
* **Question 3:** Explain the changes to the initialization, the condition, and the update of the outer loop that are needed to form the inverted triangle. 
  * **Answer:** -------------------

### 2.4 Experiment 4: Case Study of Group Project Scores

#### 2.4.1 Java Code
```java
import java.util.Scanner; 

public class GroupScore06 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of groups : "); 
        int numGroups = sc.nextInt(); 
        System.out.print("Enter the number of graders: "); 
        int numGraders = sc.nextInt(); 
 
        if (numGroups <= 0 || numGraders <= 0) { 
            System.out.println("Groups and graders must be > 0."); 
        } else { 
            int groupNo = 1;                   // outer loop counter 
            double highestAverage = -1;        // -1: the first group is recorded 
            int bestGroup = 0; 

            while (groupNo <= numGroups) { 
                System.out.println("Group " + groupNo); 
                double totalScore = 0; 
 
                for (int j = 1; j <= numGraders; j++) { 
                    int score; 
                    do { 
                        System.out.print("  Score from Grader " + j + ": "); 
                        score = sc.nextInt(); 
                        if (score < 0 || score > 100) { 
                            System.out.println("  Score must be 0-100. Retry!"); 
                        } 
                    } while (score < 0 || score > 100); 
                    totalScore += score; 
                }  
 
                double averageScore = totalScore / numGraders; 
                System.out.println("Group " + groupNo 
                        + ": average score = " + averageScore); 
                if (averageScore > highestAverage) {
                    highestAverage = averageScore;
                    bestGroup = groupNo;
                }
 
                groupNo++; 
            } 
            System.out.println("==============================");
            System.out.println("Best group          : " + bestGroup);
            System.out.println("Highest average     : " + highestAverage);
        } 
        sc.close(); 
    } 
} 
```

#### 2.4.2 Screenshot Output

![Example Image of Experiment 3 Output](/coffeeCust.png)

#### 2.4.3 Questions
* **Question 1:** Why must totalScore be reset inside the outer loop, but highestAverage must not be reset for each group? 
  * **Answer:** ------------
* **Question 2:** For 3 groups and 2 graders (without any invalid input), how many times is the body of the FOR loop executed in total? 
  * **Answer:** ------------
* **Question 3:** What happens if totalScore is declared as int and the average is calculated using integer division? Give an example of values.
  * **Answer:** -------------------
* **Question 4:** Why is highestAverage given the initial value -1 rather than 0? Give an example of input that produces a wrong result if the initial value were 0.
  * **Answer:** -------------------
* **Question 5:** This program has three levels of loops. Name each type of loop and its role.
  * **Answer:** -------------------


---

## 3: Assignment 

The following is a list of tasks performed on this Jobsheet:

### Task 1:  Nested Number Pattern 

    Write a program that prints a number pattern from 1 up to the row number. Enter an integer n (n is at least 1). The first row prints 1, the second row prints 1 2, and so on up to row n. After the pattern is complete, display the total number of digits that have been printed. Save the file with the name: Task1StudentNo.java. For n = 5:
    
      ```
      Enter the value of n = 5 
        1 
        1 2 
        1 2 3 
        1 2 3 4 
        1 2 3 4 5 
        Total numbers printed: 15
      ```

 
- [x] **Task 2:** Refer to the following flowchart!

- [x] **Task 1:**  tickets, the customer receives a 15% discount. 
      
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
