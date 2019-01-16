package task_5;

public class Validator {
    int number;
    String s = "¯\\_(ツ)_/¯";
    Assemble num;

    public Validator() {

    }

    public Validator(int number) {
        this.number = number;
        if (number < 0) {
            number = modul();
        }
        num = new Assemble(number);

        System.out.println(m());
    }

    private String m (){
        if (number == 0){
            s = "ноль";
        } else if(number > 0){
            s =  num.merge1();
        } else {
            s = ("минус " + num.merge1());
        }
        return s;
    }

    private int modul(){
        System.out.println(Math.abs(number));
        return Math.abs(number);
    }
}
