import java.util.Scanner;


public class practical_6 {
    public static void main(String args[]){
        int a, b, result, choice;
        System.out.println("This is the basic Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Sutraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Divisin");
        System.out.println("Enter 5 for Nodulous");
        choice = sc.nextInt();
        switch (choice)
        {
            case 1:
            {
                result = a+b;
                System.out.println("The result of Addition -:"  +result);
                break;
            }
            case 2:
            {
                result = a-b;
                System.out.println("The result of Substraction -: " +result);
                break;
                
            }
            case 3:
            {
                result = a*b;
                System.out.println("The result of Multiplivation -:" +result);
                break;
            }
            case 4:
            {
                result = a/b;
                System.out.println("The result of Division -:" +result);
            }
            case 5:
            {
                result = a%b;
                System.out.println("The result of Modulous -:" +result);
                break;
            }
            default :
            {
                System.out.println("The choice Entered is invalid");
            }
        
        }

        





    }
}
