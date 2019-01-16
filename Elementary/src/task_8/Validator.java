package task_8;

import java.util.Scanner;

public class Validator {
    FibonacciNumbers fibonacciNumbers;

    Scanner scanner = new Scanner(System.in);

    public int divide(int number){
        int discharge = 0;
        while (number > 0){
            number /= 10;
            discharge++;
        }
        return discharge;
    }

    public int inPut(){
        System.out.println("Please enter some number");
        int number;
        do {
           while (!scanner.hasNextInt()){
               System.out.println("That's not a number, try again ");
               scanner.next();
           }
           number = scanner.nextInt();
           if (number <= 0){
                System.out.println("Number cannot be a zero or be negative, try again ");
           }
        } while (number <= 0);
       return number;
   }

}
