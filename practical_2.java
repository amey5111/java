//Java program to accept marks from user and to declare the student as pass or fail

import java.util.Scanner;
public class practical_2 {
    public static void main(String[] args) {
        int marks ;
        Scanner sc  = new Scanner(System.in);
        System.out.println ("Enter the marks of student");
        marks = sc.nextInt();
        if (marks>40){
            System.out.println("The student is Passed");

        }
        else{
            System.out.println("The Student is Failed") ;

        }




    }
}
