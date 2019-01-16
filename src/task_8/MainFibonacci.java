package task_8;

public class MainFibonacci {
    public static void main(String[] args) {
        Validator validator = new Validator();
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers(validator.inPut(),validator.inPut());
        System.out.println(fibonacciNumbers.printDiapason());
    }
}
