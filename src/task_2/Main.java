package task_2;

public class Main {
    public static void main(String[] args) {

        Validator validator = new Validator();
        do{
            FitLetter fitLetter = new FitLetter();
            fitLetter.run();
        }while (validator.confirm(validator.scan()));

    }
}
