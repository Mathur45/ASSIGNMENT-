/*Write Java Program to print numbers between 1 to 200 which are divisible by 5, 7 and by both.*/
public class Assignment {
public static void main(String args[]){ System.out.println("\nDivided by 5: ");
for (int i=1; i<=200; i++) {
if (i%5==0)
System.out.print(i +", ");
}
System.out.println("\n\nDivided by 7: "); 
for (int i=1; i<=200; i++) { 
if (i%7==0) 
System.out.print(i +", ");
}
System.out.println("\n\nDivided by 5 & 7: ");
for (int i=1; i<=200; i++) { 
if (i%5==0 && i%7==0) 
System.out.print(i +", ");
}
System.out.println("\n");
}}