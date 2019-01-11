package task_5;

public class Assemble {
    public Split split;
    public Validator validator;
    private int number;
    private int[] array = new int[4];
    private String[] groups = {"units", "thousands", "millions"};
    private String[][] numbers = {
            {""},
            {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
            {"","десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят",
                    "семьдесят", "восемьдесят", "девяносто"},
            {"","сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот",
                    "семьсот", "восемьсот", "девятьсот"}
    };
    private String[][] difference = {
            {""},
            {"", "одна","две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
            {"","одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
                    "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"},
            {"тысяча", "тысячи", "тысяч"},
            {"миллион", "миллиона", "миллионов"},
            {"миллиард","миллиарда","миллиардов"}
    };

    public Assemble(int number) {
        split = new Split(number);
        validator = new Validator();
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
        int temp = 1;
        for (int i = 1; i < 10; i++) {
            if (temp < discharge) {
                array[i] = number % (temp *= 10);
            } else {
                break;
            }
        }
    }
    private String merge(int precision) {
        String putOut = "";
        int a = getDischarge();
        for (int i = precision; i > 0; i--) {
            if (array[2] > 10 && array[2] < 20 && array[3] == 0) {
                putOut += (difference[2][array[1]] + " ");
                break;
            }
            if (array[2] > 10 && array[2] < 20) {
                putOut += (numbers[3][array[3] / 100] + " " + difference[2][array[1]] + " ");
                break;
            }
            putOut += (numbers[i][(array[i] / (a /= 10))] + " ");
        }

        return putOut;
    }


    public String merge1(){
        String s = "";
        for (int i = groups.length - 1; i >= 0; i--) {
            if (!split.groups.containsKey(groups[i])){
                continue;
            }
            number = split.groups.get(groups[i]);
            divide(getDischarge());
            s += (merge(getPrecision(getDischarge())) + declension(groups[i], number) + " ");
        }
        return s;
    }

    public String declension(String s, int number){
        String declen = "";
        if (s == "millions" && number > 4){
            declen = difference[4][2];
        }
        if (s == "millions" && number < 5 && number > 1){
            declen = difference[4][1];
        }
        if (s == "millions" && number == 1){
            declen = difference[4][0];
        }
        if (s == "thousands" && number > 4){
            declen = difference[3][2];
        }
        if (s == "thousands" && number < 5 && number > 1){
            declen = difference[3][1];
        }
        if (s == "thousands" && number == 1){
            declen = difference[3][0];
        }


        return declen;
    }

}
