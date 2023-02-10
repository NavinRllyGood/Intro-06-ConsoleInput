// Java program to demonstrate working of Scanner in Java

import java.util.Scanner;

class ConsoleInput {

    public static void main(String args[]) {

       // Using Scanner for Getting Input from User
       System.out.println("Enter the radius of your sphere: ");

       Scanner scanner = new Scanner(System.in);

       String someString = scanner.nextLine();

       System.out.println(" " + someString);

       // Closing Scanner 

       scanner.close();
       double radDouble = Double.parseDouble(someString); 

       if (radDouble < 0) {
        System.out.println("This is a negative number");
       }

       double volume = (4.0/3.0) * Math.PI * Math.pow(radDouble, 3); 

       System.out.format("The volume of your sphere is %.2f m^3.", volume);
       System.out.println("");


    }

} 