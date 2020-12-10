//Java program to Accept and display the String entered and execute at least 5 different string functions on it.


import java.util.Scanner;


public class java_practical_9 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first string");
    String str_1 = sc.nextLine();
    
    System.out.println("Enter the second string");
    String str_2 = sc.nextLine();


    System.out.println("Wether String_1 is equal to String_2 -:");
    System.out.println(str_1.equals(str_2));//This String function is used to know that wether string_1 is equal to string_2

    System.out.println("String _1 in lowercase -:");
    System.out.println(str_1.toLowerCase());//This String function is used to convert whole string_1 in Lowercase
    System.out.println("String_2 in lowercase -:");
    System.out.println(str_2.toLowerCase());//This String fuction is used to convert whole string_2 in Lowercase
    
    System.out.println("String_1 in Uppercase -:");
    System.out.println(str_1.toUpperCase());//This String function is used to convert whole string_1 in Uppercase
    System.out.println("String_2 in Uppercase -:");
    System.out.println(str_2.toUpperCase());//This String function is used to convert whole string_2 in Uppercase

    System.out.println("Length of the String_1 -:");
    System.out.println(str_1.length());//This String Function is used to find the length of  string_1
    System.out.println("Length of the String_2 -:");
    System.out.println(str_2.length());//This String Function is used to find the length of string_2

    String str_3 = str_2.concat(str_1);//This String Function is used to give the concatinated String
    System.out.println("The concatinated string  -:" +str_3);

    System.out.println("Enter the letter in the string 1 that you want to find the index of -: ");
    char LetterToFindInString_1 = sc.next().charAt(0);
    System.out.println("The Index Of the letter you entered -:");
    System.out.println(str_1.indexOf(LetterToFindInString_1));//This String Function is used to Find the index of any letter in the string

    System.out.println("Enter the letter in the string 2 that you want to find the index of -: ");
    char LetterToFindInString_2 = sc.next().charAt(0);
    System.out.println("The Index Of the letter you entered -:");
    System.out.println(str_2.indexOf(LetterToFindInString_2));//This String Function is used to Find the index of any Letter in the string 



    




       
   } 
}
