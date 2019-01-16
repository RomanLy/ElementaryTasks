package task_2;

public class FitLetter {

    Validator validator = new Validator();
    Letter firstLetter = validator.getFirstLetter();
    Letter secondLetter = validator.getSecondLetter();

    public void run(){
        String s =  comparison() ? "The first letter CAN fit the second letter" : "The first letter CANNOT fit the second letter";
        System.out.println(s);
    }
    public boolean comparison(){
        double a = firstLetter.getLength();
        double b = firstLetter.getWidth();
        double c = secondLetter.getLength();
        double d = secondLetter.getWidth();

        if ((a > c && b > d)||(a > d && b > c)) {
            return true;
        }
        return false;
    }

}
