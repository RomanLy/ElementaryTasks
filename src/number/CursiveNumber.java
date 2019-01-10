package number;
import java.util.HashMap;
import java.util.Map;

public class CursiveNumber {

    private int number;
    private int[] array = new int[10];
    private String[][] numbers = {
            {""},
            {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
            {"","десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят",
                    "семьдесят", "восемьдесят", "девяносто"},
            {"","сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот",
                    "семьсот", "восемьсот", "девятьсот"}
    };
    private String[][] difference = {
            {"одна","две", "три", "четыре"},
            {"","одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
                    "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"},
            {"тысяча", "тысячи", "тысяч"},
            {"миллион", "миллиона", "миллионов"},
            {"миллиард","миллиарда","миллиардов"}
    };
    Map<String, Integer> groups = new HashMap<String, Integer>();

    public CursiveNumber(int number) {
        this.number = number;
        System.out.println("number is: " + number);

        //        if (number <= 0) {
//            System.out.println("number is smaller");
//        }
        divide(getDischarge());
        merge(getPrecision(getDischarge()));
    }
    public void fillGroups() {
        groups.put("units", 3);
        groups.put("thousands", 6);
        groups.put("millions", 9);
        groups.put("billions", 12);
    }
    private int getDischarge() {
        int i = 1;
        while ( i <= number) {
            i *= 10;
        }
        return i;
    }
    private int getPrecision(int discharge) {
        int count = 0;
        while (discharge > 1) {
            discharge /= 10;
            count++;
        }
        return count;
    }
    private void divide(int discharge) {
        int r = 1;
        for (int i = 1; i < 10; i++) {
            if (r < discharge) {
                array[i] = number % (r *= 10);
            } else {
                break;
            }
        }
    }

    private void merge(int precision) {

        int a = getDischarge();
        for (int i = precision; i > 0; i--) {
            if (array[2] > 10 && array[2] < 20 && array[3] == 0) {
                System.out.println(difference[1][array[1]]);
                break;
            }
            if (array[2] > 10 && array[2] < 20) {
                System.out.println(numbers[3][array[3] / 100] + " " + difference[1][array[1]]);
                break;
            }
            System.out.print(numbers[i][(array[i] / (a /= 10))] + " ");

//            if (number >= 1000){
//                System.out.println(difference[][]);
//            }
        }
    }
}
