package number;

public class CursiveNumber {
    int number;
    int unit;
    int ten;
    int hundred;

    String[] units = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
    String[] teens = {"одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
            "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    String[] tens = {"десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят",
            "семьдесят", "восемьдесят", "девяносто"};
    String[] hundreds = {"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот",
            "семьсот", "восемьсот", "девятьсот"};

    public CursiveNumber(int number) {
        this.number = number;
    }

    public void divide() {
        unit = number % 10;
        ten = (number % 100) - unit;
        hundred = (number % 1000) - ten - unit;
        merge();
    }
    public void merge() {
        System.out.print(hundreds[hundred / 100 - 1] + " ");
        System.out.print(tens[ten / 10 - 1] + " ");
        System.out.println(units[unit - 1]);
    }

}
