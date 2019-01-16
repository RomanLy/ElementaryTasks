package task_2;

import java.util.Scanner;

public class Validator {
    private Scanner scanner = new Scanner(System.in);

    public Letter getFirstLetter() {
        Letter firstLetter = createLetter("first Letter");
        return firstLetter;
    }
    public Letter getSecondLetter() {
         Letter secondLetter = createLetter("second Letter");
        return secondLetter;
    }

    protected Letter createLetter(String letter){
        return new Letter(width(letter), length(letter));
    }
    protected double width(String letter){
        return scanDouble("width", letter);
    }
    protected double length(String letter){
        return scanDouble("length", letter);
    }

    protected double scanDouble(String s, String l){
        double number;
        do {
            System.out.println("Please enter "+ s +" of "+ l +" letter");
            while (!scanner.hasNextDouble()){
                System.out.println("That's not a number, try again ");
                scanner.next();
            }
            number = scanner.nextDouble();
        } while (number <= 0);

        return number;
    }
    protected String scan(){
        String s = "";
            System.out.println("Do you want to continue (enter Yes(Y) / No(N))");
//            while (!scanner.hasNext()) {
//
////                System.out.println("That's not a number, try again ");
//                scanner.next();
                s = scanner.nextLine();
//            }
        return s;
    }

    public boolean confirm(String s) {
        boolean b = false;
            switch (s.toLowerCase()) {
                case "yes":
                    return true;
                case "y":
                    return true;
                case "no":
                    return false;
                case "n":
                    return false;
            }
        return b;

    }


}
