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